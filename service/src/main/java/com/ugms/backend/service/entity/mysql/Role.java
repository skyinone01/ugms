package com.ugms.backend.service.entity.mysql;

import java.io.Serializable;

import javax.persistence.*;


/**
 * Created by Roy on 2017/3/20.
 */
@Entity
@Table(name = "t_role")
public class Role implements Serializable{

    /**
	 * 
	 */
	private static final long serialVersionUID = -8566197653568234573L;

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "name", length = 16)
    private String name;


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
