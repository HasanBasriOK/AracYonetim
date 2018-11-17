package Classes;

public class Gemi extends DenizTasitlari{
	private static int nesneSayisi;

    public Gemi() {
    	nesneSayisi++;
    	String Id="Gemi_"+nesneSayisi;
    	this.setID(Id);
    }
    
    public Gemi(String marka,String yakitTuru,int hiz,int yolcuSayisi,int tekerlekSayisi,double fiyat,int uretimYili,String aracRenk)
    {
    	String Id="Gemi_"+nesneSayisi;
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
