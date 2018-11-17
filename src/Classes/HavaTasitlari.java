package Classes;

public class HavaTasitlari extends DenizHavaTasitlari {

    public void Hizlan(int hiz)
	{
    	setHiz(hiz);
	}
	
	public void Yavasla(int hiz)
	{
		setHiz(hiz);
	}
	
	public void Dur()
	{
		Yavasla(5);
		setHiz(0);
	}
}
