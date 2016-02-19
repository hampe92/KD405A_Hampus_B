import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.swing.BoxLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import com.jgoodies.forms.factories.DefaultComponentFactory;
import java.awt.Font;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.awt.event.ActionEvent;
import java.awt.Toolkit;

public class digitalClockGUI extends JFrame {

	private JPanel contentPane;
	private ClockLogic clockLogic;
	private JLabel lblTime;
	private JLabel lblAlarm;
	DecimalFormat timeFormat = new DecimalFormat("00");
	private JLabel lblAlarmmessage;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblHour;
	private JLabel lblMinutes;
    
    public void DigitalClockGUI(){
    }
    
    public void setTimeOnLabel(String time){
    	lblTime.setText(time);
    }
    public void setAlarmOnLabel(String alarmTime){
        lblAlarm.setText(alarmTime);
    }
    public void activateAlarm(boolean activate){  
    	if(activate)
        {
            lblAlarmmessage.setText(" WAKE UP!");
        }else{
            //lblAlarmmessage.setText("");
        }
    }

	/**
	 * Launch the application.
	 */
    public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					digitalClockGUI frame = new digitalClockGUI();
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
	public digitalClockGUI() {
		setTitle("AlarmClock");
		setIconImage(Toolkit.getDefaultToolkit().getImage(digitalClockGUI.class.getResource("/image/depositphotos_23877383-Alarm-clock.jpg")));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		lblAlarmmessage = new JLabel("Alarm at:");
		lblAlarmmessage.setBounds(282, 151, 106, 44);
		contentPane.add(lblAlarmmessage);
		
		lblTime = new JLabel("Time");
		lblTime.setFont(new Font("DokChampa", Font.PLAIN, 20));
		lblTime.setBounds(282, 56, 116, 79);
		contentPane.add(lblTime);
		
		textField = new JTextField();
		textField.setBounds(43, 224, 39, 26);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(138, 224, 39, 26);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		lblHour = new JLabel("Hour:");
		lblHour.setBounds(10, 230, 46, 14);
		contentPane.add(lblHour);
		
		lblMinutes = new JLabel("Minutes:");
		lblMinutes.setBounds(88, 230, 57, 14);
		contentPane.add(lblMinutes);
		
		/** Knappen som ställer Alarmet*/
		JButton btnSetAlarm = new JButton("Set Alarm");
		btnSetAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String hourString = textField.getText();
				int hour = Integer.parseInt(hourString);
				String minuteString = textField_1.getText();
				int minute = Integer.parseInt(minuteString);
				clockLogic.setAlarm(hour, minute);
				
				lblAlarmmessage.setText("Alarm at: " + textField.getText() + " : " + textField_1.getText());
			}
		});
		btnSetAlarm.setBounds(205, 224, 99, 23);
		contentPane.add(btnSetAlarm);
		
		/** Knappen som Tar bort ditt Alarm*/
		JButton btnClearAlarm = new JButton("Clear Alarm");
		btnClearAlarm.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				clockLogic.clearAlarm();
				lblAlarmmessage.setText(" No Alarm ");
			}
		});
		btnClearAlarm.setBounds(318, 224, 106, 23);
		contentPane.add(btnClearAlarm);
		
		JLabel lblNewLabel = new JLabel("Image");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\Hampus\\Desktop\\Elipse workspace1\\A5_Hampus_Blomqvist\\img\\coffee.png"));
		lblNewLabel.setBounds(10, 11, 218, 198);
		contentPane.add(lblNewLabel);
		

		
		clockLogic = new ClockLogic(this);
	}
}
