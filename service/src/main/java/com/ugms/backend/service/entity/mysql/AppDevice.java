package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by roy on 2017/07/05.
 */

@Entity
@Table(name = "t_app_device")
public class AppDevice implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 4477345249463069924L;

	@Id
    @Column(name = "product_id", nullable = false)
    private Long productId;

    @Column(name = "app_user_id", nullable = false)
    private Long appUserId;

    @Column(name = "device_id",nullable = false)
    private Long deviceId;

    @Column(name = "name")
    private String name;
    
    @Column(name = "source_user_id")
    private Long sourceUserId;
    
    @Column(name = "subsc_token")
    private String subscToken;
    
    @Column(name = "create_time", nullable = false)
    private Date createTime;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getAppUserId() {
		return appUserId;
	}

	public void setAppUserId(Long appUserId) {
		this.appUserId = appUserId;
	}

	public Long getDeviceId() {
		return deviceId;
	}

	public void setDeviceId(Long deviceId) {
		this.deviceId = deviceId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getSourceUserId() {
		return sourceUserId;
	}

	public void setSourceUserId(Long sourceUserId) {
		this.sourceUserId = sourceUserId;
	}

	public String getSubscToken() {
		return subscToken;
	}

	public void setSubscToken(String subscToken) {
		this.subscToken = subscToken;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
    
}
