package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

/**
 * Created by roy on 2017/3/7.
 */
@Entity
@Table(name = "t_schema")
public class Schema implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = 5659890212524789397L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", length = 32)
    private String name;

    @Column(name = "\"schema\"", length = 21332)
    private String schema;

	@Column(name = "product_id")
	private Long productId;

    @Column(name = "type_id")
    private Integer schemaType;

    @Column(name = "version")
    private int version;

    @Column(name = "locked")
    private boolean locked;

    @Column(name = "created_time")
    private Date createdTime;

    @Column(name = "created_user_id")
    private Long createdUserId;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSchema() {
        return schema;
    }

    public void setSchema(String schema) {
        this.schema = schema;
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    public boolean isLocked() {
        return locked;
    }

    public void setLocked(boolean locked) {
        this.locked = locked;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public Integer getSchemaType() {
        return schemaType;
    }

    public void setSchemaType(Integer schemaType) {
        this.schemaType = schemaType;
    }

  

    public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    @PrePersist
    public void prePersist() {
        this.createdTime = new Date();
    }
}
