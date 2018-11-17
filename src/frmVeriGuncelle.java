import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Classes.Otomobil;
import Classes.Arac;
import Classes.Bisiklet;
import Classes.Gemi;
import Classes.Otomobil;
import Classes.Ucak;
import Classes.Utilities;

import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JSpinner;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
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
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.awt.event.ActionEvent;

public class frmVeriGuncelle extends JFrame {

	private JPanel contentPane;
	private JTextField txtId;
	private JTextField txtMarka;
	private JTextField txtYakitTuru;
	//Txt icerisindeki araclari elimde tutmak icin liste tanimliyorum
	private List<Arac> araclar=new ArrayList<Arac>();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmVeriGuncelle frame = new frmVeriGuncelle();
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
	public frmVeriGuncelle() {
		setTitle("Veri G\u00FCncelle");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 424);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		//txt icerisindeki araclari aliyorum
		// bu islemi formun constructor inda yapiyorum,form acilirken araclar listem dolmus oluyor
		araclar=Utilities.verileriGetir();
		///////////////////////////////////////////
		
		txtId = new JTextField();
		txtId.setColumns(10);
		
		txtMarka = new JTextField();
		txtMarka.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Id");
		
		JLabel lblNewLabel_1 = new JLabel("Marka");
		
		JLabel lblNewLabel_2 = new JLabel("Hiz");
		
		JLabel lblNewLabel_3 = new JLabel("Yolcu Sayisi");
		
		JLabel lblNewLabel_4 = new JLabel("Tekerlek Sayisi");
		
		JLabel lblNewLabel_5 = new JLabel("Fiyat");
		
		JLabel lblUretimYili = new JLabel("Uretim Yili");
		
		JLabel lblNewLabel_6 = new JLabel("Renk");
		
		JLabel lblYakitTuru = new JLabel("Yakit Turu");
		
		JSpinner spnHiz = new JSpinner();
		
		JSpinner spnYolcuSayisi = new JSpinner();
		
		JSpinner spnTekerlekSayisi = new JSpinner();
		
		JSpinner spnFiyat = new JSpinner();
		
		JSpinner spnUretimYili = new JSpinner();
		
		txtYakitTuru = new JTextField();
		txtYakitTuru.setColumns(10);
		
		JComboBox cmbRenk = new JComboBox();
		
		JButton btnKaydet = new JButton("Kaydet");
		btnKaydet.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				/////////////////////////////////////////////////////////////
				if(txtId.getText().isEmpty())
				{
					//ID alani bos birakilmis ise hata mesaji verip alttaki kodlari okumamasini sagliyorum
					JOptionPane.showMessageDialog(null, "Id alani bos birakilamaz");
					return;
				}
				
				String Id=txtId.getText();
				
				Boolean varMi=false;
								
				for (int i = 0; i < araclar.size(); i++) {
					
					if(araclar.get(i).getID().equals(Id))
					{
						varMi=true;
					}
				}
		
				if(!varMi)
				{
					JOptionPane.showMessageDialog(null, "Girmis oldugunuz id degeri ile uyusan bir data bulunamamistir.");
					return;
				}
				
			for (int i = 0; i < araclar.size(); i++) {
					
					if(araclar.get(i).getID().equals(Id))
					{
						araclar.get(i).setFiyat(Double.parseDouble(spnFiyat.getValue().toString()));
						araclar.get(i).setHiz(Integer.parseInt(spnHiz.getValue().toString()));
						araclar.get(i).setMarka(txtMarka.getText());
						araclar.get(i).setRenk(cmbRenk.getSelectedItem().toString());
						araclar.get(i).setTekelekSayisi(Integer.parseInt(spnTekerlekSayisi.getValue().toString()));
						araclar.get(i).setUretimYili(Integer.parseInt(spnUretimYili.getValue().toString()));
						araclar.get(i).setYakitTuru(txtYakitTuru.getText());
						araclar.get(i).setYolcuSayisi(Integer.parseInt(spnYolcuSayisi.getValue().toString()));
					}
				}
			
			Utilities.verileriTemizle();
			
			for (int i = 0; i < araclar.size(); i++) {
				
				Utilities.verileriYaz(araclar.get(i));
			}
			
			JOptionPane.showMessageDialog(null, "Isleminiz basariyla gerceklesmistir.");
					/////////////////////////////////////////////////////////////////////////////////////////////////	
			}
		});
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(lblNewLabel_1, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_2, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_5, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
									.addComponent(lblNewLabel_3, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblUretimYili, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblNewLabel_6, GroupLayout.PREFERRED_SIZE, 48, GroupLayout.PREFERRED_SIZE)
								.addComponent(lblYakitTuru, GroupLayout.PREFERRED_SIZE, 68, GroupLayout.PREFERRED_SIZE))
							.addGap(4)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING, false)
									.addComponent(spnUretimYili)
									.addComponent(spnFiyat)
									.addComponent(spnTekerlekSayisi)
									.addComponent(spnYolcuSayisi)
									.addComponent(txtMarka)
									.addComponent(txtId)
									.addComponent(spnHiz))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING, false)
									.addComponent(cmbRenk, Alignment.LEADING, 0, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
									.addComponent(txtYakitTuru, Alignment.LEADING))))
						.addComponent(btnKaydet))
					.addContainerGap(284, Short.MAX_VALUE))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtId, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtMarka, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblNewLabel_1))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblNewLabel_2)
						.addComponent(spnHiz, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel_3)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_4, GroupLayout.PREFERRED_SIZE, 17, GroupLayout.PREFERRED_SIZE)
								.addComponent(spnTekerlekSayisi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_5)
								.addComponent(spnFiyat, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblUretimYili)
								.addComponent(spnUretimYili, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(lblNewLabel_6)
								.addComponent(cmbRenk, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
						.addComponent(spnYolcuSayisi, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtYakitTuru, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblYakitTuru))
					.addGap(35)
					.addComponent(btnKaydet)
					.addContainerGap(38, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
		////////////////////////////////////////////////////////////////77
		String[] renkler=new String[6];
        renkler[0]="Sari";
        renkler[1]="Yesil";
        renkler[2]="Mavi";
        renkler[3]="Kirmizi";
        renkler[4]="Beyaz";
        renkler[5]="Siyah";
        
        ComboBoxModel renkModel = new DefaultComboBoxModel(renkler);
        
        cmbRenk.setModel(renkModel);
        /////////////////////////////////////////////////////////////////////
	}
}
