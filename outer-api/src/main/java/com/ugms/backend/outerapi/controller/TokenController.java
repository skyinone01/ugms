package com.ugms.backend.outerapi.controller;

import com.ugms.backend.bean.exception.UserException;
import com.ugms.backend.bean.base.response.DataResponse;
import com.ugms.backend.bean.exception.UgmsStatus;
import com.ugms.backend.bean.bean.response.TokenResponse;
import com.ugms.backend.service.repository.mysql.UserRepository;
import com.ugms.backend.utils.AesUtils;
import org.apache.commons.codec.binary.Base64;
import org.apache.commons.lang3.RandomUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.nio.ByteBuffer;
import java.time.Instant;

/**
 * Created by Roy on 2017/3/8.
 */
@RestController
public class TokenController {
	@Autowired
	private AesUtils aesUtils;
	@Autowired
	private UserRepository userRepository;

	@Value("${outer.token.aes-key}")
	private String key;
	@Value("${outer.token.timeout}")
	private int timeout;

	/*
	1.1
	roy
	 */
	@RequestMapping(value = "/token", method = RequestMethod.GET)
	public DataResponse<TokenResponse> getToken(@RequestParam("user_id") Long userId,
	                             @RequestParam("secret") String secret) {
		if (!userRepository.existsByIdAndSecret(userId, secret)) {
			throw new UserException(UgmsStatus.BAD_REQUEST,"invalid user_id or secret.");
		}


		ByteBuffer byteBuffer = ByteBuffer.allocate(32);
		byteBuffer.putLong(Instant.now().toEpochMilli());
		byteBuffer.putLong(userId);
		byteBuffer.putLong(timeout);
		byteBuffer.putLong(RandomUtils.nextLong(0, Long.MAX_VALUE));
		byte[] tokenBytes = aesUtils.encryptToken(byteBuffer.array(), key);
		TokenResponse response = new TokenResponse();
		response.setToken(Base64.encodeBase64URLSafeString(tokenBytes));
		response.setTimeout(timeout);

		return new DataResponse<>(response);
	}
}
