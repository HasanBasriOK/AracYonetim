package Classes;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Utilities {

	
	public static void verileriYaz(Arac arac)
	{
		 try {
			    String newLine = System.getProperty("line.separator");
	            String metin="";
	            metin+=arac.getID()+"~";
	            metin+=arac.getMarka()+"~";
	            metin+=arac.getFiyat()+"~";
	            metin+=arac.getRenk()+"~";
	            metin+=String.valueOf(arac.getHiz()) +"~";
	            metin+=String.valueOf(arac.getTekerlekSayisi()) +"~";
	            metin+=String.valueOf(arac.getUretimYili()) +"~";
	            metin+=String.valueOf(arac.getYakitTuru()) +"~";
	            metin+=String.valueOf(arac.getYolcuSayisi());
   
	            
	            Writer w = new BufferedWriter(new FileWriter("C:\\Users\\CCR Developer\\Desktop\\busram\\deneme.txt", true));
	            w.write(metin+newLine);
	            w.close();
	        } catch (IOException e) {
	        	JOptionPane.showMessageDialog(null, "Dosyaya yazma islemi sirasinda hata");
	        }
	}
	
	public static void verileriTemizle()
	{
		try {
			PrintWriter writer = new PrintWriter("C:\\Users\\CCR Developer\\Desktop\\busram\\deneme.txt");
			writer.print("");
			writer.close();
		}
		catch(FileNotFoundException ex)
		{
			
		} 
		catch (IOException e) {

		}
		
	}
	
	
	public static List<Arac> verileriGetir()
	{
		List<Arac> araclar=new ArrayList<Arac>();
		try
		{
			 String line;
			 BufferedReader bufferreader = new BufferedReader(new FileReader("C:\\Users\\aa\\Desktop\\deneme.txt"));

			 //satiri oku eger okudugun deger bos degil ise devam et
		        while ((line=bufferreader.readLine()) != null) {   
		        	//eger okudugum satir bisiklet ile basliyorsa bisiklet nesnesidir
		        	if (line.startsWith("Bisiklet")) {
		        		
		        		String[] veriler=line.split("~");
 		
						Bisiklet bisiklet=new Bisiklet();
						bisiklet.setID(veriler[0]);
						bisiklet.setMarka(veriler[1]);
						bisiklet.setFiyat(Double.parseDouble(veriler[2]));
						bisiklet.setRenk(veriler[3]);
						bisiklet.setHiz(Integer.parseInt(veriler[4]));
						bisiklet.setTekelekSayisi(Integer.parseInt(veriler[5]));
						bisiklet.setUretimYili(Integer.parseInt(veriler[6]));
						bisiklet.setYakitTuru(veriler[7]);
						bisiklet.setYolcuSayisi(Integer.parseInt(veriler[8]));
						
						araclar.add(bisiklet);
					}
		        	else if(line.startsWith("Otomobil"))
		        	{
		        		String[] veriler=line.split("~");
		        		
		        		Otomobil otomobil=new Otomobil();
		        		otomobil.setID(veriler[0]);
		        		otomobil.setMarka(veriler[1]);
		        		otomobil.setFiyat(Double.parseDouble(veriler[2]));
		        		otomobil.setRenk(veriler[3]);
		        		otomobil.setHiz(Integer.parseInt(veriler[4]));
		        		otomobil.setTekelekSayisi(Integer.parseInt(veriler[5]));
		        		otomobil.setUretimYili(Integer.parseInt(veriler[6]));
		        		otomobil.setYakitTuru(veriler[7]);
		        		otomobil.setYolcuSayisi(Integer.parseInt(veriler[8]));
		        		
		        		araclar.add(otomobil);
		        	}
		        	else if(line.startsWith("Gemi"))
		        	{
		        		String[] veriler=line.split("~");
		        		
		        		Gemi gemi=new Gemi();
		        		gemi.setID(veriler[0]);
		        		gemi.setMarka(veriler[1]);
		        		gemi.setFiyat(Double.parseDouble(veriler[2]));
		        		gemi.setRenk(veriler[3]);
		        		gemi.setHiz(Integer.parseInt(veriler[4]));
		        		gemi.setTekelekSayisi(Integer.parseInt(veriler[5]));
		        		gemi.setUretimYili(Integer.parseInt(veriler[6]));
		        		gemi.setYakitTuru(veriler[7]);
		        		gemi.setYolcuSayisi(Integer.parseInt(veriler[8]));
		        		
		        		araclar.add(gemi);
		        	}
		        	else if(line.startsWith("Ucak"))
		        	{
		        		String[] veriler=line.split("~");
		        		
		        		Ucak ucak=new Ucak();
		        		ucak.setID(veriler[0]);
		        		ucak.setMarka(veriler[1]);
		        		ucak.setFiyat(Double.parseDouble(veriler[2]));
		        		ucak.setRenk(veriler[3]);
		        		ucak.setHiz(Integer.parseInt(veriler[4]));
		        		ucak.setTekelekSayisi(Integer.parseInt(veriler[5]));
		        		ucak.setUretimYili(Integer.parseInt(veriler[6]));
		        		ucak.setYakitTuru(veriler[7]);
		        		ucak.setYolcuSayisi(Integer.parseInt(veriler[8]));
		        		
		        		araclar.add(ucak);
		        	}	            
		        	else if(line.startsWith("UcanGemi"))
		        	{
		        		String[] veriler=line.split("~");
		        		
		        		UcanGemi ucanGemi=new UcanGemi();
		        		ucanGemi.setID(veriler[0]);
		        		ucanGemi.setMarka(veriler[1]);
		        		ucanGemi.setFiyat(Double.parseDouble(veriler[2]));
		        		ucanGemi.setRenk(veriler[3]);
		        		ucanGemi.setHiz(Integer.parseInt(veriler[4]));
		        		ucanGemi.setTekelekSayisi(Integer.parseInt(veriler[5]));
		        		ucanGemi.setUretimYili(Integer.parseInt(veriler[6]));
		        		ucanGemi.setYakitTuru(veriler[7]);
		        		ucanGemi.setYolcuSayisi(Integer.parseInt(veriler[8]));
		        		
		        		araclar.add(ucanGemi);
		        	}	            
		        }
		}
		catch(FileNotFoundException ex)
		{
			return new ArrayList<Arac>();
		} 
		catch (IOException e) {

			return new ArrayList<Arac>();
		}
		return araclar;
		
	}
}
