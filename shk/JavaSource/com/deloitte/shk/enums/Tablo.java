package com.deloitte.shk.enums;

public enum Tablo {
    VARLIK(1L, "Varlıklar"), 
    KAYNAK(2L, "Kaynaklar"), 
    KARZARAR(3L, "Kar Zarar"), 
    NAKITAKIM(4L, "Nakit Akım"),
    TOPLAMCALISAN(5L, "Toplam Çalışanlar"),
    BORCYASLANDIRMA(6L, "Borç Yaşlandırma"),
    TRAFIKSTAT(7L, "İstatistik"),
    UCAKGIDER(8L, "Uçak Gider"),
    DOVIZPOZISYON(9L, "Döviz Pozisyonu"),
    UCAKFILO(10L, "Uçak Filo Hareket"),
    ILISKILITARAFBAKIYE(11L, "İlişkili Taraf Açıklamaları 1.1"),
    ILISKILITARAFISLEM(12L, "İlişkili Taraf Açıklamaları 1.2"),
    ILISKILITARAFTO(13L, "İlişkili Taraf Açıklamaları 2"),
    ILISKILITARAFLAR(14L, "İlişkili Taraf Açıklamaları 3"),
    OZKAYNAK(15L, "Öz Kaynak Hareket"),
    KARNE(16L, "Karne"),
    EKSIKTABLO(17L, "Eksik Tablolar");
    
    private Long value;
    private String name;

    private Tablo(Long value, String name) {
        this.value = value;
        this.name = name;
    }
    
    public Long getValue(){
    	return this.value;
    }

    public void setValue(Long value){
    	this.value = value;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String toString(){
		return getName();
	}
    
};  

