

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class MainForm {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainForm window = new MainForm();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public MainForm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.addWindowListener(new WindowAdapter() {
			@Override
			public void windowClosed(WindowEvent arg0) {
			}
		});
		frame.setBounds(100, 100, 369, 90);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnVeriListele = new JButton("Veri Listele");
		btnVeriListele.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//veri listeleme formunun nesnesini olustur
				frmVeriListele veriListele=new frmVeriListele();
				//veri listeleme formunda kapat tusuna basinca uygulamayi kapatma sadece veri listeleme ekranini kapat
				veriListele.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				//veri listeleme ekranini gorunur yap
				veriListele.setVisible(true);
			}
		});
		
		JButton btnVeriGuncelle = new JButton("Veri G\u00FCncelle");
		btnVeriGuncelle.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//biz doldurduk
				frmVeriGuncelle veriGuncelle=new frmVeriGuncelle();
				veriGuncelle.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				veriGuncelle.setVisible(true);
			}
		});
		
		JButton btnVeriGiris = new JButton("Veri Giris");
		btnVeriGiris.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				//biz doldurduk
				frmVeriGiris veriGiris=new frmVeriGiris();
				veriGiris.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
				veriGiris.setVisible(true);
			}
		});
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(15)
					.addComponent(btnVeriGiris)
					.addGap(18)
					.addComponent(btnVeriListele)
					.addGap(18)
					.addComponent(btnVeriGuncelle)
					.addContainerGap(120, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGap(19)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnVeriListele)
						.addComponent(btnVeriGuncelle)
						.addComponent(btnVeriGiris))
					.addContainerGap(222, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
	}

}
