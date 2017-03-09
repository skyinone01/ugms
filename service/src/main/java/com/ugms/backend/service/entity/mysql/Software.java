package com.ugms.backend.service.entity.mysql;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Roy on 2017/3/20.
 */

@Entity
@Table(name = "t_soft")
public class Software implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -3964250941254096411L;

	@Id
    @Column(name = "uuid", length = 36, nullable = false, columnDefinition = "char(36)")
    private String id;

    @Column(length = 16, nullable = false)
    private byte[] md5sum;

    @Column(length = 64, nullable = false)
    private String version;

    @Column(name = "uploaded_time", nullable = false)
    private Date uploadedTime;

    @Column(name = "op_user_id")
    private Long opUserId;

    @Column(name = "product_id", nullable = false)
    private long productId;

    @Column(name = "file_name", nullable = false)
    private String fileName;

    @Column(name = "description")
    private String description;

    public long getProductId() {
        return productId;
    }

    public void setProductId(long productId) {
        this.productId = productId;
    }


    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getId() { return id;}

    public void setId(String id) {
        this.id = id;
    }

    public byte[] getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(byte[] md5sum) {
        this.md5sum = md5sum;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

 

    public Date getUploadedTime() {
		return uploadedTime;
	}

	public void setUploadedTime(Date uploadedTime) {
		this.uploadedTime = uploadedTime;
	}

	public Long getOpUserId() {
        return opUserId;
    }

    public void setOpUserId(Long opUserId) {
        this.opUserId = opUserId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
