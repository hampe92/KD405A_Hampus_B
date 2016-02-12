import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;

public class AnimalGUI extends JFrame {

	private JPanel contentPane;
	private ArrayList<Animal> animallist = new ArrayList();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AnimalGUI frame = new AnimalGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
     private void addAnimals(){
    	 animallist.add(new Dog("Canis lupus", 3, true, "Pelle"));
    	 animallist.add(new Dog("Cans lupus", 3, false, "Totte"));
    	 animallist.add(new Cat("KitKat", 8, 9));
    	 animallist.add(new Snake("Snakey", true));
    	 animallist.add(new Snake("Snojk", false));
     }
	/**
	 * Create the frame.
	 */
	public AnimalGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(10, 11, 424, 239);
		contentPane.add(textArea);
		
		addAnimals();
		for(Animal a: animallist){
			String animalInfo = a.getInfo();
			
			textArea.append(animalInfo);
		}
	}
}
