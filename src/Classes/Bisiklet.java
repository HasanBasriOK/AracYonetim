package Classes;

public class Bisiklet extends KaraTasitlari {
	private static int nesneSayisi;

    public Bisiklet() {
    	nesneSayisi++;
    	String Id="Bisiklet_"+nesneSayisi;
    	this.setID(Id);
    }
    
    public Bisiklet(String marka,String yakitTuru,int hiz,int yolcuSayisi,int tekerlekSayisi,double fiyat,int uretimYili,String aracRenk)
    {
    	String Id="Bisiklet_"+nesneSayisi;
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
