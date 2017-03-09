package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by roy on 2017/3/17.
 */

@Entity
@Table(name = "t_user")
public class User implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 2406271872055393481L;

	@Id
    private Long id;

    @Column(name = "secret_key", length = 32, nullable = false)
    private String secretKey;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSecretKey() {
        return secretKey;
    }

    public void setSecretKey(String secretKey) {
        this.secretKey = secretKey;
    }
}
