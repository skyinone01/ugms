package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name = "t_dopm_config")
public class DopmConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -6461976514753741701L;

	@Id
	@Column(name = "pdt_id", nullable = false)
	@JsonProperty("pdt_id")
    private Long productId;
	
	@Column(name = "active_dopm_id", nullable = false)
	private Long activeDopmId;
	
	@Column(name = "status", nullable = false)
	@JsonProperty("status")
	private Integer  status;

	public Long getProductId() {
		return productId;
	}

	public void setProductId(Long productId) {
		this.productId = productId;
	}

	public Long getActiveDopmId() {
		return activeDopmId;
	}

	public void setActiveDopmId(Long activeDopmId) {
		this.activeDopmId = activeDopmId;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}
	
	
	
}
