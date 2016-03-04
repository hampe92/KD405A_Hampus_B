import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JTextArea;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.awt.event.ActionEvent;
import javax.swing.JScrollPane;

public class TrafikGUI extends JFrame {

	private JPanel contentPane;
	private JTextField fromField;
	private JTextField toField;
	private JTextField fieldStation;
	private JTextArea stationArea;
	private JTextArea tripArea;
	
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TrafikGUI frame = new TrafikGUI();
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
	public TrafikGUI() {
		setTitle("Sk\u00E5netrafiken S\u00F6k");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 503, 381);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		fieldStation = new JTextField();
		fieldStation.setBounds(79, 189, 107, 23);
		contentPane.add(fieldStation);
		fieldStation.setColumns(10);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(206, 177, 239, 107);
		contentPane.add(scrollPane);
		
		
		stationArea = new JTextArea();
		scrollPane.setViewportView(stationArea);
		stationArea.setRows(20);
        stationArea.setColumns(10);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(206, 60, 239, 99);
		contentPane.add(scrollPane_1);
		
		tripArea = new JTextArea();
		scrollPane_1.setViewportView(tripArea);
		tripArea.setRows(20);
        tripArea.setColumns(10);
		
		
		
		JButton btnHittaResa = new JButton("S\u00F6k");
		btnHittaResa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						stationArea.setText("Söker...");
		                new StationThread().start();
				
			}
		});
		btnHittaResa.setBounds(97, 236, 89, 23);
		contentPane.add(btnHittaResa);
		
		
		fromField = new JTextField();
		fromField.setBounds(79, 61, 117, 23);
		contentPane.add(fromField);
		fromField.setColumns(10);
		
		toField = new JTextField();
		toField.setBounds(78, 95, 118, 23);
		contentPane.add(toField);
		toField.setColumns(10);
		
		
		JButton btnSk = new JButton("S\u00F6k");
		btnSk.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			
				tripArea.setText("Hittar dina resor...");
				 new TripThread().start();
			
		}
			});
		btnSk.setBounds(87, 129, 89, 23);
		contentPane.add(btnSk);
		
		JLabel lblVljStad = new JLabel("V\u00E4lj Stad");
		lblVljStad.setBounds(20, 193, 58, 14);
		contentPane.add(lblVljStad);
		
		JLabel lblVljHllplats = new JLabel("V\u00E4lj Station");
		lblVljHllplats.setBounds(20, 36, 81, 14);
		contentPane.add(lblVljHllplats);
		
		JLabel lblFrn = new JLabel("Fr\u00E5n");
		lblFrn.setBounds(23, 65, 46, 14);
		contentPane.add(lblFrn);
		
		JLabel lblTill = new JLabel("Till");
		lblTill.setBounds(22, 99, 46, 14);
		contentPane.add(lblTill);
		
				
	}

private class TripThread extends Thread {
    
	@Override
    public void run() {

		
		String från = fromField.getText();
        String till = toField.getText();
        String searchURL = Constants.getURL(från, till, 5);
        Journeys journeys = Parser.getJourneys(searchURL);
        
        tripArea.setText("");
        for (Journey journey : journeys.getJourneys()) {
            System.out.print(journey.getStartStation() + " - ");
            System.out.print(journey.getEndStation());
            String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY) + ":"
                    + journey.getDepDateTime().get(Calendar.MINUTE);
            tripArea.append(" Departs " + time + " that is in " + journey.getTimeToDeparture()
                    + " minutes. And it is " + journey.getDepTimeDeviation() + " min late" + "\n");

        }
    }
}
public class StationThread extends Thread {
	   

	@Override
    public void run() {
        
		
		String hittaStation = fieldStation.getText();// tar strängen från
                                                        // fieldStation
        System.out.println("// Stations when searching for stations containing \"Malm\"");
        ArrayList<Station> searchStations = new ArrayList<Station>(); // Sätter
                                                                        // i
                                                                        // gång
                                                                        // arraylistan
                                                                        // och
                                                                        // söker
        searchStations.addAll(Parser.getStationsFromURL(hittaStation));
        
		stationArea.setText("");// Clearar sökrutan innan den börjar visa
                                // sökningen
        for (Station s : searchStations) {// sätter igång
            stationArea.append(s.getStationName() + " number:" + s.getStationNbr() + "\n");
        }

    }
}
}
