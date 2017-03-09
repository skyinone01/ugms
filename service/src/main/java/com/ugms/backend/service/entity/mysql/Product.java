package com.ugms.backend.service.entity.mysql;


import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by Roy on 2017/3/20.
 */

@Entity
@Table(name = "t_product")
public class Product implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 534503885822704011L;

	public enum Status{UNVERIFIED, VERIFYING, VERIFIED}

    @Id
    private Long id;

    @Column(columnDefinition = "char(128)")
    private String token;

    @Column(length = 32, nullable = false)
    private String name;

    @Column(name = "created_time", nullable = false)
    private Date createdTime;

    @Column(name = "accepted_time")
    private Date acceptedTime;

    @Column(length = 255)
    private String description;

    @Enumerated(EnumType.STRING)
    @Column(name = "status", nullable = false)
    private Status status;

    @Column(name = "device_limit_count", nullable = false)
    private int deviceLimitCount;

    @Column(name = "process", nullable = false)
    private Integer process;


    @Column(name = "created_user_id", nullable = false)
    private Long createdUserId;

    @Column(name = "category")
    private String category;
    @Column(name = "industry")
    private Integer industry;
    @Column(name = "release_date")
    private Date releaseDate;
    @Column(name = "release_count")
    private String releaseCount;
    @Column(name = "os")
    private String os;
    @Column(name = "carrier")
    private String carrier;
    @Column(name = "connection")
    private Integer connection;
    @Column(name = "protocol")
    private Integer protocol;


    public Long getCreatedUserId() {
        return createdUserId;
    }

    public void setCreatedUserId(Long createdUserId) {
        this.createdUserId = createdUserId;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

   

    public Date getCreatedTime() {
		return createdTime;
	}

	public void setCreatedTime(Date createdTime) {
		this.createdTime = createdTime;
	}

	public Date getAcceptedTime() {
		return acceptedTime;
	}

	public void setAcceptedTime(Date acceptedTime) {
		this.acceptedTime = acceptedTime;
	}

	public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDeviceLimitCount() {
        return deviceLimitCount;
    }

    public void setDeviceLimitCount(int deviceLimitCount) {
        this.deviceLimitCount = deviceLimitCount;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Integer getIndustry() {
        return industry;
    }

    public void setIndustry(Integer industry) {
        this.industry = industry;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public String getReleaseCount() {
        return releaseCount;
    }

    public void setReleaseCount(String releaseCount) {
        this.releaseCount = releaseCount;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public Integer getConnection() {
        return connection;
    }

    public void setConnection(Integer connection) {
        this.connection = connection;
    }

    public Integer getProtocol() {
        return protocol;
    }

    public void setProtocol(Integer protocol) {
        this.protocol = protocol;
    }
}
