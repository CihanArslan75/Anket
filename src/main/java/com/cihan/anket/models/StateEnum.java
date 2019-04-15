package com.cihan.anket.models;

public enum StateEnum {
	NULL,
	NORMAL,
	SILINMIS;
	
	 public String toString(){
        switch(this) {
            case NORMAL:
                return "NORMAL";
            case SILINMIS:
                return "SİLİNMİŞ";
            default: return " ";
        }
	 }

}