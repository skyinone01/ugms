package com.ugms.backend.service.entity.mysql;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by roy on 2017/07/05.
 */

@Entity
@Table(name = "t_dopm")
public class Dopm implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2184268495156577590L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
    @Column(name = "pdt_id", nullable = false)
    private Long productId;

    @Column(name = "name",nullable = false)
    private String name;

    @Column(name = "md5",length = 16, nullable = false)
    private byte[] md5;
    
    @Column(name = "path",nullable = false)
    private String path;
    
    @Column(name = "status", nullable = false)
    private Integer status;
    
    @Column(name = "create_time", nullable = false)
    private Date createTime;
    
    @Column(name = "creator_id",nullable = false)
    private Long creatorId;

    @Column(name = "remark")
    private String remark;
    
    @Column(name = "reason")
    private String reason;
    
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public byte[] getMd5() {
		return md5;
	}

	public void setMd5(byte[] md5) {
		this.md5 = md5;
	}

	public String getPath() {
		return path;
	}

	public void setPath(String path) {
		this.path = path;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getCreatorId() {
		return creatorId;
	}

	public void setCreatorId(Long creatorId) {
		this.creatorId = creatorId;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

   
  
}
