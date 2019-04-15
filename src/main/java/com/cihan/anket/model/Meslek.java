package com.cihan.anket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "meslek")
public class Meslek {
	private Integer id;
	private String meslekadi ;
	
	@Id
	@SequenceGenerator(name = "seq_meslek", allocationSize = 1, sequenceName = "seq_meslek")
	@GeneratedValue(generator = "seq_meslek", strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length = 100, name = "meslekadi")
	public String getMeslekadi() {
		return meslekadi;
	}
	public void setMeslekadi(String meslekadi) {
		this.meslekadi = meslekadi;
	}
	
	

}
