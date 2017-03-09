package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Created by roy on 2017/3/25.
 */
@Entity
@Table(name = "t_sdk_platform")
public class SdkPlatform implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = 6290500656788660971L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "description")
    private String description;


	@Column(name = "language")
	private String language;

    @Lob @Basic(fetch = FetchType.LAZY)
    @Column(name = "zip_library", columnDefinition="BLOB", nullable=true)
    private byte[] zipLibrary;

	@Column(length = 16, nullable = false)
	private byte[] md5;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public byte[] getZipLibrary() {
		return zipLibrary;
	}

	public void setZipLibrary(byte[] zipLibrary) {
		this.zipLibrary = zipLibrary;
	}

	public byte[] getMd5() {
		return md5;
	}

	public void setMd5(byte[] md5) {
		this.md5 = md5;
	}
}
