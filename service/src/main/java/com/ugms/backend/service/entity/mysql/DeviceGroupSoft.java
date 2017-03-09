package com.ugms.backend.service.entity.mysql;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

/**
 * Created by roy on 2017/3/7.
 */
@Entity
@Table(name = "t_devicegroup_soft")
public class DeviceGroupSoft {

    @Column(name = "op_user_id", nullable = false)
    private Long opUserId;

    @Column(name = "updated_time", nullable = false)
    private Date updatedTime;

    @Column(name = "soft_uuid", nullable = false)
    private String softUuid;

    public Long getDeviceGroupId() {
        return deviceGroupId;
    }

    public void setDeviceGroupId(Long deviceGroupId) {
        this.deviceGroupId = deviceGroupId;
    }

    public String getSoftUuid() {
        return softUuid;
    }

    public void setSoftUuid(String softUuid) {
        this.softUuid = softUuid;
    }

    @Id
    @Column(name = "device_group_id", nullable = false)
    private Long deviceGroupId;

    public Long getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

	public Date getUpdatedTime() {
		return updatedTime;
	}

	public void setUpdatedTime(Date updatedTime) {
		this.updatedTime = updatedTime;
	}

  

}
