import java.util.ArrayList;


public class MagicalStoreBike {
	
	public MagicalStoreBike(){
		
	}
	/**ArrayList*/
	private ArrayList<Bike> allBikes = new ArrayList<Bike>();
	
	/**Loopar igenom ArrayListen*/
	public String getAllBikes(){
		String returnString = "";
		
		for(int i =0; i<allBikes.size(); i++){
			returnString = returnString + "Bike nr: " + (i+1) + " price: " + allBikes.get(i).getPrice() + "SEK " + " size: " + allBikes.get(i).getSize()+ " inches " + "color: " + allBikes.get(i).getColor() + "\n";
		
			
			
			
		}
		return returnString;
		
	}
	public void addBike(String color, int size, int price){
		Bike b = new Bike(color, size, price);
		this.allBikes.add(b);
	}

}
