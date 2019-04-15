package com.cihan.anket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "il")
public class IL {
	private Integer id;
	private String iladi ;
	
	@Id
	@SequenceGenerator(name = "seq_il", allocationSize = 1, sequenceName = "seq_il")
	@GeneratedValue(generator = "seq_il", strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	@Column(length = 100, name = "iladi")
	public String getIladi() {
		return iladi;
	}
	public void setIladi(String iladi) {
		this.iladi = iladi;
	}
	
}
