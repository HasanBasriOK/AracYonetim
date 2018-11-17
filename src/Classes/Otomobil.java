package Classes;

public class Otomobil extends KaraTasitlari {
	private static int nesneSayisi;

    public Otomobil() {
    	nesneSayisi++;
    	String Id="Otomobil_"+nesneSayisi;
    	this.setID(Id);
    }
    
    public Otomobil(String marka,String yakitTuru,int hiz,int yolcuSayisi,int tekerlekSayisi,double fiyat,int uretimYili,String aracRenk)
    {
    	String Id="Otomobil_"+nesneSayisi;
    	this.setID(Id);
    	this.setMarka(marka);
    	this.setYakitTuru(yakitTuru);
    	this.setHiz(hiz);
    	this.setYolcuSayisi(yolcuSayisi);
    	this.setTekelekSayisi(tekerlekSayisi);
    	this.setFiyat(fiyat);
    	this.setUretimYili(uretimYili);
    	this.setRenk(aracRenk);
    	
    }
}
