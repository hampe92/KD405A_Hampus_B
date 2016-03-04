package se.mah.k3lara.skaneAPI.view;

import java.util.ArrayList;
import java.util.Calendar;

import javax.swing.JTextArea;
import javax.swing.JTextField;

import se.mah.k3lara.skaneAPI.control.Constants;
import se.mah.k3lara.skaneAPI.model.Journey;
import se.mah.k3lara.skaneAPI.model.Journeys;
import se.mah.k3lara.skaneAPI.model.Line;
import se.mah.k3lara.skaneAPI.model.Lines;
import se.mah.k3lara.skaneAPI.model.Station;
import se.mah.k3lara.skaneAPI.xmlparser.Parser;


public class TestClass {

	public static void main(String[] args) {
		String searchURL = Constants.getURL("80000","81216",20); //Deklarerar en String som hämtar info från Constants, nummer på stationerna. Malmö C = 80000,  Lund C, 81216 Malmö Gatorg 80100, Hässleholm C 93070
		System.out.println(searchURL);
		System.out.println("// Results when searching:");
		
		Journeys journeys = Parser.getJourneys(searchURL); //Journeys klassen hämtar de olika metoderna, för att få ut reseinfo.
		for (Journey journey : journeys.getJourneys()) {
			System.out.print(journey.getStartStation()+" - ");
			System.out.print(journey.getEndStation());
			String time = journey.getDepDateTime().get(Calendar.HOUR_OF_DAY)+":"+journey.getDepDateTime().get(Calendar.MINUTE);
			System.out.println(" Departs " + time +" that is in "+journey.getTimeToDeparture()+ " minutes. And it is "+journey.getDepTimeDeviation()+" min late");
		} 
		
	   System.out.println("// Stations when searching for stations containing \"Malm\"");
		ArrayList<Station> searchStations = new ArrayList<Station>(); //Arraylisten letar igenom alla stationer i Station variabeln.
		searchStations.addAll(Parser.getStationsFromURL("Malm")); //säger till att arraylisten ska hitta station som börjar på "Malm".
		for (Station s: searchStations){
			System.out.println(s.getStationName() +" number:" +s.getStationNbr());
		}
		
		System.out.println("// Busses departing from Ubåtshallen stationsnummer 80046 ");
		Lines lines = Parser.getStationResults(new Station("80046"));
		for (Line l : lines.getLines()) {
			System.out.println("Line " + l.getLine() +" departs: "+l.getDepTime().get(Calendar.HOUR_OF_DAY)+":"+l.getDepTime().get(Calendar.MINUTE)+
					" and is "+l.getDepTimeDeviation()+" minutes late");
		}
	}
}

