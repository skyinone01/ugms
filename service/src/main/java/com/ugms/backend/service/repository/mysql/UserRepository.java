package com.ugms.backend.service.repository.mysql;

import com.ugms.backend.service.repository.rdbsupport.RDBRepository;
import com.ugms.backend.service.entity.mysql.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

/**
 * Created by roy on 2017/3/17.
 */

public interface UserRepository extends RDBRepository<User, Long> {
	@Query("SELECT CASE WHEN COUNT(u) > 0 THEN true ELSE false END FROM User u WHERE u.id = :id AND u.secretKey = :secret")
	boolean existsByIdAndSecret(@Param("id")Long userId, @Param("secret")String secret);
}
