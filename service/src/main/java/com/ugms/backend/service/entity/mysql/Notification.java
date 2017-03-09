package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by roy on 2017/3/11.
 */

@Entity
@Table(name = "t_notification")
public class Notification  implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 5390213493747754566L;

	@Id
    @Column(name = "uuid",nullable = false)
    private String uuid;

    @Column(name = "op_user_id",nullable = false)
    private Long operateUser;

    @Column(name = "sequence_number", nullable = false)
    private Long sequenceNumber;


	@Column(name = "product_id")
    private Long productId = null;

    @Column(name = "schema_id",nullable = false)
    private Long schemaId;

    @Column(name = "body", length = 40960, nullable = false)
    private byte[] body;

	@Column(name = "expired_time", nullable = false)
    private Date expiredTime;

	@Column(name = "sent_time", nullable = false)
    private Date sentTime;
	
	@Column(name = "device_group_name")
    private String deviceGroupName=null;

    @Column(name = "profile_filter")
    private String profileFilter;

    @Column(name = "target_device_uuid")
    private Long targetDeviceId;
    
    @Column(name = "device_count")
    private Long deviceCount;

	public byte[] getBody() {
		return body;
	}

	public void setBody(byte[] body) {
		this.body = body;
	}
	
	public String getDeviceGroupName() {
		return deviceGroupName;
	}

	public void setDeviceGroupName(String deviceGroupName) {
		this.deviceGroupName = deviceGroupName;
	}


	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getOperateUser() {
		return operateUser;
	}

	public void setOperateUser(Long operateUser) {
		this.operateUser = operateUser;
	}



	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getProfileFilter() {
		return profileFilter;
	}

	public void setProfileFilter(String profileFilter) {
		this.profileFilter = profileFilter;
	}

	public Long getSchemaId() {
		return schemaId;
	}

	public void setSchemaId(Long schemaId) {
		this.schemaId = schemaId;
	}



	public Date getExpiredTime() {
		return expiredTime;
	}

	public void setExpiredTime(Date expiredTime) {
		this.expiredTime = expiredTime;
	}

	public Date getSentTime() {
		return sentTime;
	}

	public void setSentTime(Date sentTime) {
		this.sentTime = sentTime;
	}

	public Long getSequenceNumber() {
		return sequenceNumber;
	}

	public void setSequenceNumber(Long sequenceNumber) {
		this.sequenceNumber = sequenceNumber;
	}

	public Long getTargetDeviceId() {
		return targetDeviceId;
	}

	public void setTargetDeviceId(Long targetDeviceId) {
		this.targetDeviceId = targetDeviceId;
	}

	public Long getDeviceCount() {
		return deviceCount;
	}

	public void setDeviceCount(Long deviceCount) {
		this.deviceCount = deviceCount;
	}


}
