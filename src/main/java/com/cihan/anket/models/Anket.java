package com.cihan.anket.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "anket")
public class Anket extends BaseEntity {
	
	private int id;
	private String anketadi ;
	private String anketiyapan ;
	private AnketTuru anketTuru;   
	
	@Id
	@SequenceGenerator(name = "seq_anket", allocationSize = 1, sequenceName = "seq_anket")
	@GeneratedValue(generator = "seq_anket", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length = 200, name = "anketadi")
	public String getAnketadi() {
		return anketadi;
	}
	public void setAnketadi(String anketadi) {
		this.anketadi = anketadi;
	}
	
	@Column(length = 100, name = "anketiyapan")
	public String getAnketiyapan() {
		return anketiyapan;
	}
	public void setAnketiyapan(String anketiyapan) {
		this.anketiyapan = anketiyapan;
	}
	
	@Column(name = "anketturu")
	public AnketTuru getAnketTuru() {
		return anketTuru;
	}
	public void setAnketTuru(AnketTuru anketTuru) {
		this.anketTuru = anketTuru;
	}

}
