package Classes;

public class Ucak extends HavaTasitlari {
	private static int nesneSayisi;

    public Ucak() {
    	nesneSayisi++;
    	String Id="Ucak_"+nesneSayisi;
    	this.setID(Id);
    }
    
    public Ucak(String marka,String yakitTuru,int hiz,int yolcuSayisi,int tekerlekSayisi,double fiyat,int uretimYili,String aracRenk)
    {
    	String Id="Ucak_"+nesneSayisi;
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
