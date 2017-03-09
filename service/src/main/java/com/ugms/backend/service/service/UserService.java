package com.ugms.backend.service.service;

import com.ugms.backend.bean.result.PagedResult;
import com.ugms.backend.service.entity.mysql.User;
import com.ugms.backend.service.repository.mysql.UserRepository;
import com.ugms.backend.service.request.UserCreateRequest;
import com.ugms.backend.bean.base.request.PageRequest;
import org.apache.commons.lang3.RandomStringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by roy on 2017/3/17.
 */
@Service
public class UserService {
    @Autowired
    UserRepository userRepository;

    @Transactional
    public void create(UserCreateRequest request) {
    	if(!exists((long)request.getUserId())){
        User user = new User();
        user.setSecretKey(RandomStringUtils.randomAlphanumeric(32));
        user.setId((long) request.getUserId());
        userRepository.save(user);
    	}
    }

    public boolean exists(Long userId) {
        return userRepository.exists(userId);
    }

    public User findById(Long userId) {
        return userRepository.findOne(userId);
    }

    public PagedResult getAll(PageRequest pageRequest) {

        Map map = new HashMap();
        return userRepository.getDataPageBatch("User.getAll", "User.getCount", map, pageRequest);
    }
}
