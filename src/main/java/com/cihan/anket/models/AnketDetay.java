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
@Table(name = "anketdetay")
public class AnketDetay extends BaseEntity{
	
	private int id;
	private Anket anket;
	private String anketsorusu;
	private Cevap cevap;
	
	@Id
	@SequenceGenerator(name = "seq_anketdetay", allocationSize = 1, sequenceName = "seq_anketdetay")
	@GeneratedValue(generator = "seq_anketdetay", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "anketid", referencedColumnName = "id")
	public Anket getAnket() {
		return anket;
	}
	public void setAnket(Anket anket) {
		this.anket = anket;
	}
	@Column(length = 200, name = "anketsorusu")
	public String getAnketsorusu() {
		return anketsorusu;
	}
	public void setAnketsorusu(String anketsorusu) {
		this.anketsorusu = anketsorusu;
	}
	
	@ManyToOne
	@JoinColumn(name = "cevapid", referencedColumnName = "id")
	public Cevap getCevap() {
		return cevap;
	}
	public void setCevap(Cevap cevap) {
		this.cevap = cevap;
	}
	
	


}
