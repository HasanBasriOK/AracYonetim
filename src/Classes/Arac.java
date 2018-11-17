package Classes;

public abstract class Arac {
	//Butun classlardaki ortak ozellikler; properties; ortak ozellikler butun classlarda olacagi icin arac classi abstract classidir...
	private String ID;
	private String Marka;
	private String YakitTuru;
	private int Hiz;
	private int YolcuSayisi;
	private int TekerlekSayisi;
	private double Fiyat;
	private int UretimYili;
	private String AracRenk;
	
	//Polymorphism
	public void Hizlan(int hiz)
	{
		Hiz=hiz;
	}
	
	public void Yavasla(int hiz)
	{
		Hiz=hiz;
	}
	
	public void Dur()
	{
		Hiz=0;
	}
	
	//Encapsulation
	public String getID()
	{
		return ID;
	}
	
	public void setID(String id)
	{
		ID=id;
	}
	
	public String getMarka()
	{
		return Marka;
	}
	
	public void setMarka(String marka)
	{
		Marka=marka;
	}
	
	public String getYakitTuru()
	{
		return YakitTuru;
	}
	
	public void setYakitTuru(String yakitTur)
	{
		YakitTuru=yakitTur;
	}
	
	public int getHiz()
	{
		return Hiz;
	}
	
	public void setHiz(int hiz)
	{
		Hiz=hiz;
	}
	
	public int getYolcuSayisi()
	{
		return YolcuSayisi;
	}
	
	public void setYolcuSayisi(int yolcuSayisi)
	{
		YolcuSayisi=yolcuSayisi;
	}
	
	public int getTekerlekSayisi()
	{
		return TekerlekSayisi;
	}
	
	public void setTekelekSayisi(int tekerlekSayisi)
	{
		TekerlekSayisi=tekerlekSayisi;
	}
	
	public double getFiyat()
	{
		return Fiyat;
	}
	
	public void setFiyat(double fiyat)
	{
		Fiyat=fiyat;
	}
	
	public int getUretimYili()
	{
		return UretimYili;
	}
	
	public void setUretimYili(int uretimYili)
	{
		UretimYili=uretimYili;
	}
	
	public String getRenk()
	{
		return AracRenk;
	}
	
	public void setRenk(String renk)
	{
		AracRenk=renk;
	}
	
	
}
