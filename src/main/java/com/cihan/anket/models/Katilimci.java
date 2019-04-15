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
@Table(name = "katilimci")
public class Katilimci extends BaseEntity{
	private int id ; 
	private String adiSoyadi  ;
	private Sektor sektor;
	private IL il;
	private Ilce ilce ;
	private Meslek meslek; 
	private Cinsiyet cinsiyet ; 
	private Yas yas;
	private OgrenimDurumu  ogreninDurumu; 
	private MedeniHali medeniHali ;
	private String kaydiAlan;
	private String Ekalan;
	
	@Id
	@SequenceGenerator(name = "seq_katilimci", allocationSize = 1, sequenceName = "seq_katilimci")
	@GeneratedValue(generator = "seq_katilimci", strategy = GenerationType.SEQUENCE)
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	@Column(length = 100, name = "adisoyadi")
	public String getAdiSoyadi() {
		return adiSoyadi;
	}
	public void setAdiSoyadi(String adiSoyadi) {
		this.adiSoyadi = adiSoyadi;
	}
	
	@ManyToOne
	@JoinColumn(name = "sektorid", referencedColumnName = "id")
	public Sektor getSektor() {
		return sektor;
	}
	public void setSektor(Sektor sektor) {
		this.sektor = sektor;
	}
	
	@ManyToOne
	@JoinColumn(name = "ilid", referencedColumnName = "id")
	public IL getIl() {
		return il;
	}
	public void setIl(IL il) {
		this.il = il;
	}
	
	@ManyToOne
	@JoinColumn(name = "ilceid", referencedColumnName = "id")
	public Ilce getIlce() {
		return ilce;
	}
	public void setIlce(Ilce ilce) {
		this.ilce = ilce;
	}
	
	@ManyToOne
	@JoinColumn(name = "meslekid", referencedColumnName = "id")
	public Meslek getMeslek() {
		return meslek;
	}
	public void setMeslek(Meslek meslek) {
		this.meslek = meslek;
	}
	
	@Column(name = "cinsiyet")
	public Cinsiyet getCinsiyet() {
		return cinsiyet;
	}
	public void setCinsiyet(Cinsiyet cinsiyet) {
		this.cinsiyet = cinsiyet;
	}
	
	@Column(name = "yas")
	public Yas getYas() {
		return yas;
	}
	public void setYas(Yas yas) {
		this.yas = yas;
	}
	
	@Column(name = "ogrenimdurumu")
	public OgrenimDurumu getOgreninDurumu() {
		return ogreninDurumu;
	}
	public void setOgreninDurumu(OgrenimDurumu ogreninDurumu) {
		this.ogreninDurumu = ogreninDurumu;
	}
	@Column(name = "medenihali")
	public MedeniHali getMedeniHali() {
		return medeniHali;
	}
	public void setMedeniHali(MedeniHali medeniHali) {
		this.medeniHali = medeniHali;
	}
	
	@Column(length = 100, name = "kaydialan")
	public String getKaydiAlan() {
		return kaydiAlan;
	}
	public void setKaydiAlan(String kaydiAlan) {
		this.kaydiAlan = kaydiAlan;
	}
	@Column(length = 1000, name = "ekalan")
	public String getEkalan() {
		return Ekalan;
	}
	public void setEkalan(String ekalan) {
		Ekalan = ekalan;
	}


}
