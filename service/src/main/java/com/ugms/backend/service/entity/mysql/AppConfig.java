package com.ugms.backend.service.entity.mysql;

import javax.persistence.*;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by roy on 2017/07/05.
 */

@Entity
@Table(name = "t_app_config")
public class AppConfig implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 2184222651573413148L;

	@Id
    @Column(name = "product_id", nullable = false)
    private Long id;

    @Column(name = "product_img_fid",nullable = false)
    private String productImgFid;

    @Column(name = "product_img_name",nullable = false)
    private String productImgName;
    
    @Column(name = "config_img_fid",nullable = false)
    private String configImgFid;

    @Column(name = "config_img_name",nullable = false)
    private String configImgName;
    
    @Column(name = "description")
    private String desc;
    
    @Column(name = "create_time", nullable = false)
    private Date createTime;
    
    @Column(name = "op_user_id", nullable = false)
    private Long opUserid;


	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getProductImgFid() {
		return productImgFid;
	}

	public void setProductImgFid(String productImgFid) {
		this.productImgFid = productImgFid;
	}

	public String getProductImgName() {
		return productImgName;
	}

	public void setProductImgName(String productImgName) {
		this.productImgName = productImgName;
	}

	public String getConfigImgFid() {
		return configImgFid;
	}

	public void setConfigImgFid(String configImgFid) {
		this.configImgFid = configImgFid;
	}

	public String getConfigImgName() {
		return configImgName;
	}

	public void setConfigImgName(String configImgName) {
		this.configImgName = configImgName;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	public Long getOpUserid() {
		return opUserid;
	}

	public void setOpUserid(Long opUserid) {
		this.opUserid = opUserid;
	}
    
    
  
}
