package com.cihan.anket.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "sektor")
public class Sektor {
	
	private Integer id;
	private String sektoradi ;
	
	@Id
	@SequenceGenerator(name = "seq_sektor", allocationSize = 1, sequenceName = "seq_sektor")
	@GeneratedValue(generator = "seq_sektor", strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length = 100, name = "sektoradi")
	public String getSektoradi() {
		return sektoradi;
	}
	public void setSektoradi(String sektoradi) {
		this.sektoradi = sektoradi;
	}
	
}
