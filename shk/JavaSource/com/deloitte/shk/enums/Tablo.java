package com.deloitte.shk.enums;

public enum Tablo {
    VARLIK(1L), 
    KAYNAK(2L), 
    KARZARAR(3L), 
    NAKITAKIM(4L),
    TOPLAMCALISAN(5L),
    BORCYASLANDIRMA(6L),
    TRAFIKSTAT(7L),
    UCAKGIDER(8L),
    DOVIZPOZISYON(9L),
    UCAKFILO(10L),
    ILISKILITARAFBAKIYE(11L),
    ILISKILITARAFISLEM(12L),
    ILISKILITARAFTO(13L),
    ILISKILITARAFLAR(14L),
    OZKAYNAK(15L),
    KARNE(16L);
    
    private Long value;

    private Tablo(Long value) {
            this.value = value;
    }
    
    public Long getValue(){
    	return this.value;
    }

    public void setValue(Long value){
    	this.value = value;
    }
};  

