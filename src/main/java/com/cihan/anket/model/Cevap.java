package com.cihan.anket.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "cevap")
public class Cevap {
	private Integer id;
	private String cevapturu ;
	
	@Id
	@SequenceGenerator(name = "seq_cevap", allocationSize = 1, sequenceName = "seq_cevap")
	@GeneratedValue(generator = "seq_cevap", strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length = 100, name = "cevapturu")
	public String getCevapturu() {
		return cevapturu;
	}
	public void setCevapturu(String cevapturu) {
		this.cevapturu = cevapturu;
	}
	
		

}
