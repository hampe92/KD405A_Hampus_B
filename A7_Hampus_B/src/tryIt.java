import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3.klara.PixelController;
import se.mah.k3.klara.PixelController.Screen;

public class tryIt extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					tryIt frame = new tryIt();
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
	public tryIt() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		PixelController px = PixelController.getInstance(Screen.MEDEA_2);
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i =0; i<25; i++){
			      //Y   //X för att skärmarna ligger ner.
		px.setPixel(20, 20, Color.CYAN); //1
		px.setPixel(21, 21, Color.CYAN);
		px.setPixel(22, 22, Color.CYAN);
		px.setPixel(23, 23, Color.CYAN);
		
		px.setPixel(24, 14, Color.CYAN); //2
		px.setPixel(25, 15, Color.CYAN);
		px.setPixel(26, 16, Color.CYAN);
		px.setPixel(27, 17, Color.CYAN);
		
		px.setPixel(28, 18, Color.CYAN); //3
		px.setPixel(29, 19, Color.CYAN);
		px.setPixel(30, 20, Color.CYAN);
		px.setPixel(31, 21, Color.CYAN);
		
		px.setPixel(32, 22, Color.CYAN); //4
		px.setPixel(33, 23, Color.CYAN);
		px.setPixel(34, 24, Color.CYAN);
		px.setPixel(35, 25, Color.CYAN);
		
		px.setPixel(36, 26, Color.CYAN); //5
		px.setPixel(37, 27, Color.CYAN);
		px.setPixel(38, 28, Color.CYAN);
		px.setPixel(39, 29, Color.CYAN);
		
		px.setPixel(40, 30, Color.CYAN); //6
		px.setPixel(41, 31, Color.CYAN);
		px.setPixel(42, 32, Color.CYAN);
		px.setPixel(43, 33, Color.CYAN);
		
		px.setPixel(50, 40, Color.GREEN); //7
		px.setPixel(51, 41, Color.GREEN);
		px.setPixel(52, 42, Color.GREEN);
		px.setPixel(53, 43, Color.GREEN);
		
		px.setPixel(54, 44, Color.GREEN); //8
		px.setPixel(55, 45, Color.GREEN);
		px.setPixel(56, 46, Color.GREEN);
		px.setPixel(57, 47, Color.GREEN);
		
		px.setPixel(58, 48, Color.GREEN); //9
		px.setPixel(59, 49, Color.GREEN);
		px.setPixel(60, 50, Color.GREEN);
		px.setPixel(61, 51, Color.GREEN);
		
		px.setPixel(62, 52, Color.GREEN); //10
		px.setPixel(63, 53, Color.GREEN);
		px.setPixel(64, 54, Color.GREEN);
		px.setPixel(65, 55, Color.GREEN);
		
		px.setPixel(66, 56, Color.GREEN); //11
		px.setPixel(67, 57, Color.GREEN);
		px.setPixel(68, 58, Color.GREEN);
		px.setPixel(69, 59, Color.GREEN);
		
		px.setPixel(70, 60, Color.GREEN); //12
		px.setPixel(71, 61, Color.GREEN);
		px.setPixel(72, 62, Color.GREEN);
		px.setPixel(73, 63, Color.GREEN);
		}
	}
	

}
