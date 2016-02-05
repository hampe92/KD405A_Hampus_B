import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class MagicBikeGUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private MagicalStoreBike bikeStore;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MagicBikeGUI frame = new MagicBikeGUI();
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
	public MagicBikeGUI() {
		
		bikeStore = new MagicalStoreBike();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 590, 322);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		/**textfield 1*/
		textField = new JTextField();
		textField.setBounds(10, 44, 86, 38); 
		contentPane.add(textField);
		textField.setColumns(10);
		/**textfield 2*/
		textField_1 = new JTextField();
		textField_1.setBounds(10, 187, 86, 38); 
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		/**textfield 3*/
		textField_2 = new JTextField();
		textField_2.setBounds(10, 119, 86, 32); 
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(261, 11, 303, 261);
		contentPane.add(scrollPane);
		
		/**text arean där infom om cyklarna skrivs ut*/
		JTextArea textArea = new JTextArea(); 
		scrollPane.setViewportView(textArea);
		
		/**hämtar värderna från textfield textColor och sätter in den i en string, bikeColor*/
		/**hämtar värden från textfield textPrice, konverterar int till string*/
		/**hämtar värden från textfield textSize, konverterar int till string*/
		JButton btnNewButton = new JButton("New Bike");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String bikeColor = textField_1.getText();
				int bikePrice = Integer.parseInt(textField_2.getText());
				int bikeSize = Integer.parseInt(textField.getText());
				/**lägg till cyklar i arrayList*/
				bikeStore.addBike(bikeColor, bikeSize, bikePrice);
				/**hämtar alla cyklarna från ArrayList getAllBikes*/
				textArea.setText(bikeStore.getAllBikes());
			}
		});
		btnNewButton.setBounds(141, 95, 110, 56);
		contentPane.add(btnNewButton);
		
	
		JLabel lblPrice = new JLabel("Price");
		lblPrice.setBounds(10, 11, 86, 24);
		contentPane.add(lblPrice);
		
		JLabel lblSize = new JLabel("Size");
		lblSize.setBounds(10, 95, 46, 14);
		contentPane.add(lblSize);
		
		JLabel lblColor = new JLabel("Color");
		lblColor.setBounds(10, 162, 46, 14);
		contentPane.add(lblColor);
		
		JLabel lblMagicBikeShop = new JLabel("Magic Bike Shop");
		lblMagicBikeShop.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblMagicBikeShop.setBounds(141, 11, 136, 24);
		contentPane.add(lblMagicBikeShop);
		
		
	}
}
