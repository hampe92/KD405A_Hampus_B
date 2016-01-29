import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JScrollBar;
import javax.swing.JTextArea;

public class HouseGUI extends JFrame {

	private JPanel contentPane;
	private House[] myHouse;
	private ArrayList<House> ListHouses = new ArrayList<House>();
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HouseGUI frame = new HouseGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * House.
	 */
	public HouseGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 461);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//Uppgift 1.2
		
		JScrollBar scrollBar = new JScrollBar();
		contentPane.add(scrollBar, BorderLayout.EAST);
		
		JTextArea textArea = new JTextArea();
		contentPane.add(textArea, BorderLayout.CENTER);
		
		House house1 = new House(1850, 100);
		House house2 = new House(1900, 200);
		House house3 = new House(1970, 300);
		
		
		
		int houseyearBuilt = house1.getYearBuilt();
		int houseSize = house1.getSize();
		int houseyearBuilt2 = house2.getYearBuilt();
		int houseSize2 = house2.getSize();
		int houseyearBuilt3 = house3.getYearBuilt();
		int houseSize3 = house3.getSize();
		
		System.out.println(houseSize + " kvm " + " " + " �r " + houseyearBuilt);
		System.out.println(houseSize2 + " kvm " + " " + " �r " + houseyearBuilt2);
		System.out.println(houseSize3 + " kvm " + " " + " �r " + houseyearBuilt3);
		
		textArea.append("Uppgift 1.2 \n");
		textArea.append("Det f�rsta huset �r byggt �r " + houseyearBuilt + " och �r " + houseSize + " kvm stort \n");
		textArea.append("Det andra huset �r byggt �r " + houseyearBuilt2 + " och �r " + houseSize2 + " kvm stort \n");
		textArea.append("Det tredje huset �r byggt �r " + houseyearBuilt3 + " och �r " + houseSize3 + " kvm stort \n");
		
	//Uppgift 1.3
		
		textArea.append("Uppgift 1.3 \n");
		
		myHouse = new House[10];
		
		myHouse[0] = new House(100, 1810);
		myHouse[1] = new House(200, 1820);
		myHouse[2] = new House(300, 1830);
		myHouse[3] = new House(400, 1840);
		myHouse[4] = new House(500, 1850);
		myHouse[5] = new House(600, 1860);
		myHouse[6] = new House(700, 1870);
		myHouse[7] = new House(800, 1880);
		myHouse[8] = new House(900, 1950);
		myHouse[9] = new House(1000, 2010);
		
		for(int i = 0; i < 100; i = i+1) {
		}
		for(int i = 0; i < myHouse.length; i = i+1) {
			textArea.append ("Detta huset �r byggt �r " + myHouse[i].getSize() + " och �r " + myHouse[i].getYearBuilt() + " kvm stort \n");
		}
		
		//Uppgift 1.4
		
		textArea.append("Uppgift 1.4 \n");
		
		Random random = new Random();
		
		for(int i = 0; i <100; i++) {
			
			int size = random.nextInt((1000-10) + 1) +10;
			int year = random.nextInt((2015-1800) + 1) +1800;
			
			ListHouses.add(new House(year, size));
			
			textArea.append(" Hus nummer " + (i+1) + " �r byggt " + ListHouses.get(i).getYearBuilt() + " och �r " + ListHouses.get(i).getSize() + " kvm " + " \n");
		}
		
		
		
	}

}
