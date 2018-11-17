import java.awt.BorderLayout;
import java.awt.EventQueue;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.border.EmptyBorder;
import Classes.Arac;
import Classes.Bisiklet;
import Classes.Gemi;
import Classes.Otomobil;
import Classes.Ucak;
import Classes.Utilities;

import java.beans.BeanInfo;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;




public class frmVeriListele extends JFrame {

	private JPanel contentPane;
	//araclari elimde tutmak icin liste tanimliyorum
	private List<Arac> araclar=new ArrayList<Arac>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVeriListele frame = new frmVeriListele();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	

	/**
	 * Create the frame.
	 */
	public frmVeriListele() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		////////////////////////////////////////////////////////////////////////////////////////////////////////7
		//araclar listemi dolduruyorum txt den
		araclar=Utilities.verileriGetir();
//		DosyaOku();
		 //headers for the table
		
		//tablomun kolonlarini tanimliyorum
        String[] columns = new String[] {
            "Id", "Marka", "Fiyat", "Renk","Hiz","Tekerlek Sayisi","Uretim Yili","Yakit Turu","Yolcu Sayisi"
        };
        
        //tabloda gosterecegim veriler icin dizi olusturuyorum
        String dizi[][]=new String[araclar.size()][];
        
        //araclar listemde dolanarak hepsini yukarida tanimladigim diziye ekliyorum
        for (int i = 0; i < araclar.size(); i++) {     
        	dizi[i]=new String[]{                                   
            araclar.get(i).getID().toString(),
            araclar.get(i).getMarka(),
            String.valueOf(araclar.get(i).getFiyat()) ,
            String.valueOf(araclar.get(i).getRenk()) ,
            String.valueOf(araclar.get(i).getHiz()),
            String.valueOf(araclar.get(i).getTekerlekSayisi()),
            String.valueOf(araclar.get(i).getUretimYili()),
            String.valueOf(araclar.get(i).getYakitTuru()),
            String.valueOf(araclar.get(i).getYolcuSayisi())
            };
                   
           }

        
        
        //create table with data
        
        //yukarida icini doldurdugum diziyi tabloya basiyorum
        JTable table = new JTable();
        TableModel tabloModeli=new DefaultTableModel(
                dizi,
                columns                                                );
                table.setModel(tabloModeli);
      
         /////////////////////////////////////////////////////////////////////////////////////////////////////7
        //add the table to the frame
        this.add(new JScrollPane(table));
         
        this.setTitle("Table Example");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);       
        this.pack();
        this.setVisible(true);
	}

}
