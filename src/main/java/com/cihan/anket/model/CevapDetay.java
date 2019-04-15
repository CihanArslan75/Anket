package com.cihan.anket.model;

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
@Table(name = "cevapdetay")
public class CevapDetay {
	
	private Integer id;
	private String cevapAciklama;
	private Cevap cevap;
	
	@Id
	@SequenceGenerator(name = "seq_cevapdetay", allocationSize = 1, sequenceName = "seq_cevapdetay")
	@GeneratedValue(generator = "seq_cevapdetay", strategy = GenerationType.SEQUENCE)
	public long getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	
	@Column(length = 100, name = "cevapaciklama")
	public String getCevapAciklama() {
		return cevapAciklama;
	}
	public void setCevapAciklama(String cevapAciklama) {
		this.cevapAciklama = cevapAciklama;
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
