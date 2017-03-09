package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;

import javax.persistence.*;

/**
 * Created by roy on 2017/3/19.
 */
@Entity
@Table(name = "t_schema_type")
public class SchemaType implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7736090481521385421L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;

	@Column(length = 32, nullable = false)
	private String type;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
