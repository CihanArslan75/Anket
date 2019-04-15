package com.cihan.anket.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "ilce")
public class Ilce {
	private Integer id;
	private String ilceadi ;
	private IL il;
	
	@Id
	@SequenceGenerator(name = "seq_ilce", allocationSize = 1, sequenceName = "seq_ilce")
	@GeneratedValue(generator = "seq_ilce", strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Column(length = 100, name = "ilceadi")
	public String getIlceadi() {
		return ilceadi;
	}
	public void setIlceadi(String ilceadi) {
		this.ilceadi = ilceadi;
	}
	
	@ManyToOne
	@JoinColumn(name = "ilid", referencedColumnName = "id")
	public IL getIl() {
		return il;
	}
	public void setIl(IL il) {
		this.il = il;
	}

	

}
