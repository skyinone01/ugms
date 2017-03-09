package com.ugms.backend.utils;

import com.ugms.backend.bean.exception.UgmsStatus;
import com.ugms.backend.bean.exception.UserException;
import org.apache.commons.codec.binary.Base64;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.nio.ByteBuffer;
import java.time.Instant;

/**
 * Created by Roy on 2017/3/10.
 */
@Component
public class TokenUtils {

	@Autowired
	private AesUtils aesUtils;
	@Value("${outer.token.aes-key}")
	private String key;
	@Value("${outer.token.timeout-extra}")
	private int extra;

	public Long validate(String token) {
		try {
			byte[] tokenBytes = Base64.decodeBase64(token);
			byte[] org = aesUtils.decryptToken(tokenBytes, key);
			ByteBuffer byteBuffer = ByteBuffer.wrap(org);

			long epoch = byteBuffer.getLong();
			long userId = byteBuffer.getLong();
			long timeout = byteBuffer.getLong();
			//过期时间校验：end < now + extra
			Instant end = Instant.ofEpochMilli(epoch).plusSeconds(timeout - extra);
			if (!end.isAfter(Instant.now())) {
				throw new UserException(UgmsStatus.INVALID_TOKEN,"token is expired");
			}
			return userId;
		} catch (UserException e) {
			throw new UserException(UgmsStatus.INVALID_TOKEN,"token is invalid");
		}
	}
}
