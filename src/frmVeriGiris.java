import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Arac;
import Classes.Bisiklet;
import Classes.Gemi;
import Classes.Otomobil;
import Classes.Ucak;
import Classes.UcanGemi;
import Classes.Utilities;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import java.awt.event.ActionListener;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.awt.event.ActionEvent;

public class frmVeriGiris extends JFrame {

	private JPanel contentPane;
	private JTextField txtMarka;
	private JTextField txtYakitTuru;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVeriGiris frame = new frmVeriGiris();
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
	public frmVeriGiris() {
		setTitle("Veri Giris");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 512, 380);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		txtMarka = new JTextField();
		txtMarka.setColumns(10);
		
		JLabel lblMarka = new JLabel("Marka");
		
		JLabel lblNewLabel = new JLabel("H\u0131z");
		
		JLabel lblYolcuSays = new JLabel("Yolcu Say\u0131s\u0131");
		
		JLabel lblTekerlekSays = new JLabel("Tekerlek Say\u0131s\u0131");
		
		JLabel lblFiyat = new JLabel("Fiyat");
		
		JLabel lblretimYl = new JLabel("\u00DCretim Y\u0131l\u0131");
		
		JComboBox cmbAracTur = new JComboBox();
        JLabel lblAraTr = new JLabel("Ara\u00E7 T\u00FCr\u00FC");
		
		JSpinner spnHiz = new JSpinner();
		
		JSpinner spnYolcuSayisi = new JSpinner();
		
		JSpinner spnTekerlekSayisi = new JSpinner();
		
		JSpinner spnFiyat = new JSpinner();
		
		JSpinner spnUretimYili = new JSpinner();
        JLabel lblRenk = new JLabel("Renk");
		
		JComboBox cmbRenk = new JComboBox();
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/////////////////////////////////////////////////////////////////////////////////
				//kaydet butonuna tiklaynca geliyor
				String aracTur=cmbAracTur.getSelectedItem().toString();
				
				switch(aracTur)
				{
				case "Bisiklet":
					Bisiklet bisiklet=new Bisiklet();
					bisiklet.setMarka(txtMarka.getText());
					bisiklet.setHiz((int)spnHiz.getValue());
					bisiklet.setYolcuSayisi((int)spnYolcuSayisi.getValue());
					bisiklet.setTekelekSayisi((int)spnTekerlekSayisi.getValue());
					bisiklet.setFiyat((int)spnFiyat.getValue());
					bisiklet.setUretimYili(((int)spnUretimYili.getValue()));
					bisiklet.setRenk(cmbRenk.getSelectedItem().toString());
					bisiklet.setYakitTuru(txtYakitTuru.getText());
					//olusturulan nesneyi txt ye yaziyoruz
					Utilities.verileriYaz(bisiklet);

					break;
				case "Otomobil":
					Otomobil otomobil=new Otomobil();
					otomobil.setMarka(txtMarka.getText());
					otomobil.setHiz((int)spnHiz.getValue());
					otomobil.setYolcuSayisi((int)spnYolcuSayisi.getValue());
					otomobil.setTekelekSayisi((int)spnTekerlekSayisi.getValue());
					otomobil.setFiyat((int)spnFiyat.getValue());
					otomobil.setUretimYili(((int)spnUretimYili.getValue()));
					otomobil.setRenk(cmbRenk.getSelectedItem().toString());
					otomobil.setYakitTuru(txtYakitTuru.getText());
					Utilities.verileriYaz(otomobil);
					//JOptionPane.showMessageDialog(null, aracTur);
					break;
				case "Ucak":
					Ucak ucak=new Ucak();
					ucak.setMarka(txtMarka.getText());
					ucak.setHiz((int)spnHiz.getValue());
					ucak.setYolcuSayisi((int)spnYolcuSayisi.getValue());
					ucak.setTekelekSayisi((int)spnTekerlekSayisi.getValue());
					ucak.setFiyat((int)spnFiyat.getValue());
					ucak.setUretimYili(((int)spnUretimYili.getValue()));
					ucak.setRenk(cmbRenk.getSelectedItem().toString());
					ucak.setYakitTuru(txtYakitTuru.getText());
					Utilities.verileriYaz(ucak);
					break;
				case "Gemi":
					Gemi gemi=new Gemi();
					gemi.setMarka(txtMarka.getText());
					gemi.setHiz((int)spnHiz.getValue());
					gemi.setYolcuSayisi((int)spnYolcuSayisi.getValue());
					gemi.setTekelekSayisi((int)spnTekerlekSayisi.getValue());
					gemi.setFiyat((int)spnFiyat.getValue());
					gemi.setUretimYili(((int)spnUretimYili.getValue()));
					gemi.setRenk(cmbRenk.getSelectedItem().toString());
					gemi.setYakitTuru(txtYakitTuru.getText());
					Utilities.verileriYaz(gemi);
					break;
				case "UcanGemi":
					UcanGemi ucanGemi=new UcanGemi();
					ucanGemi.setMarka(txtMarka.getText());
					ucanGemi.setHiz((int)spnHiz.getValue());
					ucanGemi.setYolcuSayisi((int)spnYolcuSayisi.getValue());
					ucanGemi.setTekelekSayisi((int)spnTekerlekSayisi.getValue());
					ucanGemi.setFiyat((int)spnFiyat.getValue());
					ucanGemi.setUretimYili(((int)spnUretimYili.getValue()));
					ucanGemi.setRenk(cmbRenk.getSelectedItem().toString());
					ucanGemi.setYakitTuru(txtYakitTuru.getText());
					Utilities.verileriYaz(ucanGemi);
					break;
				}
				
				//message box ile bilgi veriyoruz
				JOptionPane.showMessageDialog(null, "Isleminiz basariyla gerceklesmistir.");
				///////////////////////////////////////////////////////////////////////////////////////////////////
			}
		});
		
		JLabel lblYakitTuru = new JLabel("Yakit Turu");
		
		txtYakitTuru = new JTextField();
		txtYakitTuru.setColumns(10);
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(lblMarka, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
											.addComponent(lblYolcuSays))
										.addGap(34)
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
											.addComponent(spnYolcuSayisi, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)
											.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
												.addComponent(txtMarka)
												.addComponent(cmbAracTur, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
												.addComponent(spnHiz))))
									.addGroup(gl_contentPane.createSequentialGroup()
										.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblTekerlekSays)
												.addGap(18))
											.addGroup(gl_contentPane.createSequentialGroup()
												.addComponent(lblFiyat, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
												.addGap(43)))
										.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
											.addComponent(spnUretimYili, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
											.addComponent(spnTekerlekSayisi, GroupLayout.DEFAULT_SIZE, 96, Short.MAX_VALUE)
											.addComponent(cmbRenk, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
											.addComponent(spnFiyat))
										.addPreferredGap(ComponentPlacement.RELATED)))
								.addComponent(lblretimYl, GroupLayout.PREFERRED_SIZE, 65, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblAraTr, GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE))
							.addGap(263))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblRenk, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
							.addContainerGap(430, Short.MAX_VALUE))))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(50)
					.addComponent(btnKaydet)
					.addContainerGap(371, Short.MAX_VALUE))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(lblYakitTuru, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
					.addGap(19)
					.addComponent(txtYakitTuru, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(292, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblAraTr)
						.addComponent(cmbAracTur, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblMarka)
						.addComponent(txtMarka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel)
						.addComponent(spnHiz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblYolcuSays)
						.addComponent(spnYolcuSayisi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblTekerlekSays)
						.addComponent(spnTekerlekSayisi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblFiyat)
						.addComponent(spnFiyat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblretimYl)
						.addComponent(spnUretimYili, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblRenk)
						.addComponent(cmbRenk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtYakitTuru, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYakitTuru, GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE))
					.addGap(18)
					.addComponent(btnKaydet)
					.addContainerGap())
		);
		contentPane.setLayout(gl_contentPane);
		
		
		
		
		///////////////////////////////////////////////////////////////////
		//combobox un icinde gorunmesini istedigimiz veriler icin string array tanimladik
		    String[] araclar = new String[4]; 
		    araclar[0] = "Bisiklet";
		    araclar[1] = "Gemi";
		    araclar[2] = "Otomobil";
		    araclar[3] = "Ucak";
		    araclar[3] = "UcanGemi";
	       
		    //tanimaldigimiz string array icin model olusturduk
	        ComboBoxModel aracModel = new DefaultComboBoxModel(araclar);
	        
	        //olusturdugumuz modeli combobox a set ettik
	        cmbAracTur.setModel(aracModel);
	        
	        //renkler combobox inda gostermek istedigimiz veriler icin array tanimladik
	        String[] renkler=new String[6];
	        renkler[0]="Sari";
	        renkler[1]="Yesil";
	        renkler[2]="Mavi";
	        renkler[3]="Kirmizi";
	        renkler[4]="Beyaz";
	        renkler[5]="Siyah";
	        
	        //model olusturduk
            ComboBoxModel renkModel = new DefaultComboBoxModel(renkler);
	        //renklerin oldugu combobox i doldurduk
	        cmbRenk.setModel(renkModel);

	}
}
