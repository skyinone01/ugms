package com.ugms.backend.service.entity.mysql;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Roy on 2017/3/20.
 */
@Entity
@Table(name = "t_device_register")
public class DeviceRegister implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6940907916976128550L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

	@Column(name = "product_id")
	private Long productId;

    @Column(length = 255, name = "code",nullable = false)
    private String code;

    @Column(name = "modified_time",nullable = false)
    private Date modifiedTime;

    @Column(name = "op_user_id",nullable = false)
    private Long opUserId;

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }


    public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	public Long getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
