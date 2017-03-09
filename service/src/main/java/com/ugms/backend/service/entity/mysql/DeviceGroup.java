package com.ugms.backend.service.entity.mysql;


import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by roy on 2017/3/7.
 */
@Entity
@Table(name = "t_device_group")
public class DeviceGroup implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -3722124521942487887L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "product_id")
    private Long productId;

    @Column(name = "profile_filter", nullable = false)
    private String profileFilter;

    @Column(nullable = false)
    private int weight;

    @Column(nullable = false)
    private String name;

    @Column(nullable = true)
    private String description;

	@Column(name = "op_user_id", nullable = false)
    private Long opUserId;

    @Column(name = "modified_time", nullable = false)
    private Date modifiedTime;

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

	public String getProfileFilter() {
		return profileFilter;
	}

	public void setProfileFilter(String profileFilter) {
		this.profileFilter = profileFilter;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Long getOpUserId() {
		return opUserId;
	}

	public void setOpUserId(Long opUserId) {
		this.opUserId = opUserId;
	}

	public Date getModifiedTime() {
		return modifiedTime;
	}

	public void setModifiedTime(Date modifiedTime) {
		this.modifiedTime = modifiedTime;
	}

	

}
