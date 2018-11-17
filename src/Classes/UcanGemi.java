package Classes;

public class UcanGemi extends DenizHavaTasitlari {
	
	private static int nesneSayisi;

    public UcanGemi() {
    	nesneSayisi++;
    	String Id="UcanGemi_"+nesneSayisi;
    	this.setID(Id);
    }
    
    public UcanGemi(String marka,String yakitTuru,int hiz,int yolcuSayisi,int tekerlekSayisi,double fiyat,int uretimYili,String aracRenk)
    {
    	String Id="UcanGemi_"+nesneSayisi;
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
