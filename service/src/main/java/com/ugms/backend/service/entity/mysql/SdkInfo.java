package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

/**
 * Created by roy on 2017/3/7.
 */
@Entity
@Table(name = "t_sdk")
public class SdkInfo implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3753673198946641167L;

	@Id
    private String uuid;

    @Column(name = "op_user_id")
    private Long opUserId;


	@Column(name = "product_id")
	private Long productId;

    @Column(name = "op_time",nullable = false)
    private Date opTime;

    @Column(name = "created_time")
    private Date createTime;

    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name = "property_body", length = 4096)
    private byte[] propertyBody;
    
   
	public String getUuid() {
		return uuid;
	}

	public void setUuid(String uuid) {
		this.uuid = uuid;
	}

	public Long getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

   
	public Date getOpTime() {
		return opTime;
	}

	public void setOpTime(Date opTime) {
		this.opTime = opTime;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public byte[] getPropertyBody() {
		return propertyBody;
	}

	public void setPropertyBody(byte[] propertyBody) {
		this.propertyBody = propertyBody;
	}

  

}
