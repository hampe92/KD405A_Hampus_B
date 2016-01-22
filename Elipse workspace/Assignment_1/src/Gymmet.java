import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;
import java.awt.Color;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.awt.Font;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.UIManager;

public class Gymmet extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField txtNamn;
	private JTextField txtAdress;
	private JTextField txtMedlemsNr;
	private JTextField txtPersonnr;
	private JTextField txtEpostHampusblivese;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gymmet frame = new Gymmet();
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
	public Gymmet() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 667, 429);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(Color.LIGHT_GRAY);
		setJMenuBar(menuBar);
		
		JMenu mnArkiv = new JMenu("Arkiv");
		menuBar.add(mnArkiv);
		
		JMenuItem mntmSkrivUt = new JMenuItem("Skriv ut");
		mnArkiv.add(mntmSkrivUt);
		
		JMenuItem mntmAvsluta = new JMenuItem("Avsluta");
		mnArkiv.add(mntmAvsluta);
		
		JMenu mnMeny = new JMenu("Meny");
		menuBar.add(mnMeny);
		
		JMenuItem mntmNyMedlem = new JMenuItem("Ny Medlem");
		mnMeny.add(mntmNyMedlem);
		
		JMenuItem mntmHittaMedlem = new JMenuItem("Hitta Medlem");
		mnMeny.add(mntmHittaMedlem);
		
		JMenu mnHjlp = new JMenu("Hj\u00E4lp");
		menuBar.add(mnHjlp);
		
		JMenuItem mntmHjlp = new JMenuItem("Hj\u00E4lp");
		mnHjlp.add(mntmHjlp);
		
		JMenuItem mntmOmProgrammet = new JMenuItem("Om Programmet");
		mnHjlp.add(mntmOmProgrammet);
		contentPane = new JPanel();
		contentPane.setBackground(Color.GRAY);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(43, 51, 220, 213);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setFont(new Font("Tahoma", Font.ITALIC, 11));
		table.setBackground(Color.LIGHT_GRAY);
		table.setModel(new DefaultTableModel(
			new Object[][] {
				{"1", "Hampus Blomqvist"},
				{"2", "Olga Svensson"},
				{"3", "Lars Larsson"},
				{"4", "Sven Svensson"},
				{"5", "Helena Olsson"},
				{"6", "Tore Thorsson"},
				{"7", "Lisa Nilsson"},
				{"8", "Helmert Hultsson"},
				{"9", "Jesper Nilsson"},
				{"10", "Gudrun Gunarsson"},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
				{null, null},
			},
			new String[] {
				"MedlemsNr", "Namn"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(95);
		table.getColumnModel().getColumn(1).setPreferredWidth(95);
		scrollPane.setViewportView(table);
		
		JLabel lblGetFitGym = new JLabel("Get Fit Gym & Fitness");
		lblGetFitGym.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 13));
		lblGetFitGym.setBackground(Color.PINK);
		lblGetFitGym.setBounds(251, 11, 146, 24);
		contentPane.add(lblGetFitGym);
		
		JLabel label = new JLabel("");
		label.setIcon(new ImageIcon(Gymmet.class.getResource("/images/y3cnwbp5.png")));
		label.setBounds(503, 51, 110, 102);
		contentPane.add(label);
		
		txtNamn = new JTextField();
		txtNamn.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtNamn.setBackground(Color.LIGHT_GRAY);
		txtNamn.setText("Hampus Blomqvist");
		txtNamn.setBounds(378, 51, 96, 42);
		contentPane.add(txtNamn);
		txtNamn.setColumns(10);
		
		txtAdress = new JTextField();
		txtAdress.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtAdress.setBackground(Color.LIGHT_GRAY);
		txtAdress.setText("Brobygatan 12");
		txtAdress.setBounds(378, 148, 96, 33);
		contentPane.add(txtAdress);
		txtAdress.setColumns(10);
		
		txtMedlemsNr = new JTextField();
		txtMedlemsNr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtMedlemsNr.setBackground(Color.LIGHT_GRAY);
		txtMedlemsNr.setText(" 5555-778811");
		txtMedlemsNr.setBounds(378, 192, 96, 35);
		contentPane.add(txtMedlemsNr);
		txtMedlemsNr.setColumns(10);
		
		txtPersonnr = new JTextField();
		txtPersonnr.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtPersonnr.setBackground(Color.LIGHT_GRAY);
		txtPersonnr.setText("19921127-0506");
		txtPersonnr.setBounds(378, 104, 96, 33);
		contentPane.add(txtPersonnr);
		txtPersonnr.setColumns(10);
		
		txtEpostHampusblivese = new JTextField();
		txtEpostHampusblivese.setFont(new Font("Tahoma", Font.PLAIN, 10));
		txtEpostHampusblivese.setBackground(Color.LIGHT_GRAY);
		txtEpostHampusblivese.setText("hampusb92@live.se");
		txtEpostHampusblivese.setBounds(378, 238, 96, 35);
		contentPane.add(txtEpostHampusblivese);
		txtEpostHampusblivese.setColumns(10);
		
		JButton btnSpara = new JButton("Spara");
		btnSpara.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		btnSpara.setBackground(Color.LIGHT_GRAY);
		btnSpara.setBounds(524, 198, 89, 23);
		contentPane.add(btnSpara);
		
		JLabel lblMedlemmar = new JLabel("Medlemmar");
		lblMedlemmar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMedlemmar.setBounds(107, 26, 121, 24);
		contentPane.add(lblMedlemmar);
		
		JLabel lblNamn = new JLabel("Namn");
		lblNamn.setBounds(330, 54, 46, 35);
		contentPane.add(lblNamn);
		
		JLabel lblPersonnr = new JLabel("PersonNr");
		lblPersonnr.setBounds(322, 113, 54, 14);
		contentPane.add(lblPersonnr);
		
		JLabel lblAdress = new JLabel("Adress");
		lblAdress.setBounds(322, 157, 54, 14);
		contentPane.add(lblAdress);
		
		JLabel lblTelefonnr = new JLabel("TelefonNr");
		lblTelefonnr.setBounds(318, 202, 68, 14);
		contentPane.add(lblTelefonnr);
		
		JLabel lblEpost = new JLabel("Epost");
		lblEpost.setBounds(330, 250, 46, 14);
		contentPane.add(lblEpost);
	}
}
