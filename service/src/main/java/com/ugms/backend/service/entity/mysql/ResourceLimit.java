package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Created by roy on 2017/3/28.
 */

@Entity
@Table(name = "t_resource_limit")
public class ResourceLimit implements Serializable {

    /**
	 * 
	 */
	private static final long serialVersionUID = -2197394164649658567L;

	@Id
    private String name;

    @Column(nullable = false)
    private Integer value;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

   

  
}
