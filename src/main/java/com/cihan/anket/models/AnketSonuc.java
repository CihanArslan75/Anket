package com.cihan.anket.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name = "anketsonuc")
public class AnketSonuc extends BaseEntity{
	
    private int id;
	private AnketDetay anketDetay;
	private Katilimci katilimci;
	private String katilimcicevabi;
	private String degerlendirme;
	
	@Id
	@SequenceGenerator(name = "seq_anketsonuc", allocationSize = 1, sequenceName = "seq_anketsonuc")
	@GeneratedValue(generator = "seq_anketsonuc", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@ManyToOne
	@JoinColumn(name = "anketdetayid", referencedColumnName = "id")
	public AnketDetay getAnketDetay() {
		return anketDetay;
	}
	public void setAnketDetay(AnketDetay anketDetay) {
		this.anketDetay = anketDetay;
	}
	
	@OneToOne
	@JoinColumn(name = "katilimciid", referencedColumnName = "id")
	public Katilimci getKatilimci() {
		return katilimci;
	}
	public void setKatilimci(Katilimci katilimci) {
		this.katilimci = katilimci;
	}
	
	@Column(length = 100, name = "katilimcicevabi")
	public String getKatilimcicevabi() {
		return katilimcicevabi;
	}
	public void setKatilimcicevabi(String katilimcicevabi) {
		this.katilimcicevabi = katilimcicevabi;
	}
	@Column(length = 1000, name = "degerlendirme")
	public String getDegerlendirme() {
		return degerlendirme;
	}
	public void setDegerlendirme(String degerlendirme) {
		this.degerlendirme = degerlendirme;
	}
	
	

	
}
