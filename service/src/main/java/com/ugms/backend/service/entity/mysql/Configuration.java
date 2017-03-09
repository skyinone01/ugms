package com.ugms.backend.service.entity.mysql;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Roy on 2017/3/20.
 */

@Entity
@Table(name = "t_configuration")
public class Configuration implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 433099628620840661L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long groupId;

    @Column(nullable = false)
    private byte[] body;

    @Column(nullable = false)
    private byte[] md5sum;

    @Column(name = "op_user_id", nullable = false)
    private Long opUserId;

    @Column(name = "activated_time", nullable = false)
    private Date activatedTime;

    @Column(name = "schema_id",nullable = false)
    private Long schemaId;

    public byte[] getBody() {
        return body;
    }

    public void setBody(byte[] body) {
        this.body = body;
    }

    public byte[] getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(byte[] md5sum) {
        this.md5sum = md5sum;
    }

    public Long getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

 

    public Date getActivatedTime() {
		return activatedTime;
	}

	public void setActivatedTime(Date activatedTime) {
		this.activatedTime = activatedTime;
	}

	public Long getGroupId() {
        return groupId;
    }

    public void setGroupId(Long groupId) {
        this.groupId = groupId;
    }

    public Long getSchemaId() {
        return schemaId;
    }

    public void setSchemaId(Long schemaId) {
        this.schemaId = schemaId;
    }
}
