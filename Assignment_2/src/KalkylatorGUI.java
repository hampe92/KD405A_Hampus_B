import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.TextArea;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;

public class KalkylatorGUI extends JFrame {

	private JPanel contentPane;
	Kalkylator myCalculator;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					KalkylatorGUI frame = new KalkylatorGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Uppgift 2
	 */
	public KalkylatorGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		myCalculator = new Kalkylator();
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(67, 155, 298, 74);
		contentPane.add(textArea);

		

		JButton btnNewButton_1 = new JButton("+");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    //knapp + plus
				textArea.append("+");
				myCalculator.plus();
			}
		});
		btnNewButton_1.setBounds(249, 73, 89, 23);
		contentPane.add(btnNewButton_1);

		JButton btnNewButton_2 = new JButton("=");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {     //knapp = lika med
				myCalculator.equals();
				int i = myCalculator.getResult();
				textArea.setText(String.valueOf(i));
			}
		});
		btnNewButton_2.setBounds(345, 107, 89, 23);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("1");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  //knapp 1
				textArea.append("1");
				myCalculator.numberButtonPressed(1);
			}
		});
		btnNewButton_3.setBounds(35, 0, 89, 23);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  //knapp 2
				textArea.append("2");
				myCalculator.numberButtonPressed(2);
			}
		});
		btnNewButton_4.setBounds(138, 0, 89, 23);
		contentPane.add(btnNewButton_4);
		
		JButton btnNewButton_5 = new JButton("3");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  //knapp 3
				textArea.append("3");
				myCalculator.numberButtonPressed(3);
			}
		});
		btnNewButton_5.setBounds(249, 0, 89, 23);
		contentPane.add(btnNewButton_5);
		
		JButton btnNewButton_6 = new JButton("4");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {   //knapp 4
				textArea.append("4");
				myCalculator.numberButtonPressed(4);
			}
		});
		btnNewButton_6.setBounds(345, 0, 89, 23);
		contentPane.add(btnNewButton_6);
		
		JButton btnNewButton_7 = new JButton("5");
		btnNewButton_7.addActionListener(new ActionListener() { //knapp 5
			public void actionPerformed(ActionEvent arg0) {
				textArea.append("5");
				myCalculator.numberButtonPressed(5);
			}
		});
		btnNewButton_7.setBounds(35, 34, 89, 23);
		contentPane.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("6");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {     //knapp 6
				textArea.append("6");
				myCalculator.numberButtonPressed(6);
			}
		});
		btnNewButton_8.setBounds(138, 34, 89, 23);
		contentPane.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("7");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  //knapp 7
				textArea.append("7");
				myCalculator.numberButtonPressed(7);
			}
		});
		btnNewButton_9.setBounds(249, 34, 89, 23);
		contentPane.add(btnNewButton_9);
		
		JButton btnNewButton_10 = new JButton("8");
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {   //knapp 8
				textArea.append("8");
				myCalculator.numberButtonPressed(8);
			}
		});
		btnNewButton_10.setBounds(345, 34, 89, 23);
		contentPane.add(btnNewButton_10);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  //knapp 9
				textArea.append("9");
				myCalculator.numberButtonPressed(9);
			}
		});
		btnNewButton.setBounds(35, 73, 89, 23);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_11 = new JButton("0");
		btnNewButton_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {  //Knapp 0
				textArea.append("0");
				myCalculator.numberButtonPressed(0);
			}
		});
		btnNewButton_11.setBounds(134, 73, 89, 23);
		contentPane.add(btnNewButton_11);
		
		JButton btnNewButton_12 = new JButton("-");
		btnNewButton_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    //knapp - minus
				textArea.append("-");
				myCalculator.minus();
			}
		});
		btnNewButton_12.setBounds(249, 107, 89, 23);
		contentPane.add(btnNewButton_12);
		
		JButton btnNewButton_13 = new JButton("x");
		btnNewButton_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {    //knapp x multiplikation
				textArea.append("x");
				myCalculator.mult();
			}
		});
		btnNewButton_13.setBounds(348, 73, 89, 23);
		contentPane.add(btnNewButton_13);
		
		

	}
}
