import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Dog_and_Human_GUI extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	
	private Human human;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dog_and_Human_GUI frame = new Dog_and_Human_GUI();
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
	public Dog_and_Human_GUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(10, 52, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(10, 86, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(10, 166, 246, 36);
		contentPane.add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(10, 219, 246, 31);
		contentPane.add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnNewHuman = new JButton("New Human");
		btnNewHuman.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(textField.getText().length()>3){
					human = new Human(textField.getText());
				}
				if(textField.getText().length()<3){
				
					textField_3.setText("ERROR: Name has to be longer than 3 characters.");
				}
			}
		});
		btnNewHuman.setBounds(167, 51, 89, 23);
		contentPane.add(btnNewHuman);
		
		JButton btnBuyDog = new JButton("Buy Dog");
		btnBuyDog.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				textField_2.setText("");
				
				Dog dog = new Dog(textField_1.getText());
				human.buyDog(dog);
			}
		});
		btnBuyDog.setBounds(167, 85, 89, 23);
		contentPane.add(btnBuyDog);
		
		JButton btnPrintInfo = new JButton("Print Info");
		btnPrintInfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField_2.setText(human.getInfo());
			}
		});
		btnPrintInfo.setBounds(167, 119, 89, 23);
		contentPane.add(btnPrintInfo);
		
		JLabel lblHumansAndDogs = new JLabel("Humans and Dogs");
		lblHumansAndDogs.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblHumansAndDogs.setBounds(119, 11, 146, 29);
		contentPane.add(lblHumansAndDogs);
		
		
		
		JLabel lblInfo = new JLabel("Info");
		lblInfo.setBounds(10, 152, 68, 14);
		contentPane.add(lblInfo);
		
		
		
		JLabel lblErrorMessage = new JLabel("Error Message");
		lblErrorMessage.setBounds(10, 205, 86, 14);
		contentPane.add(lblErrorMessage);
		
		
	}
}
