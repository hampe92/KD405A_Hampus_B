import java.util.ArrayList;
import java.util.Random;

public class TestklassBike {

	public static void main(String[] args) {
		
		ArrayList<Bike>allBikes = new ArrayList<Bike>();
		Random sizeRandom = new Random();
		Random priceRandom = new Random();
		
		
		for(int i = 0; i<10; i++){
			int randomSize = sizeRandom.nextInt(31) + 10;
			int randomPrice = priceRandom.nextInt(9001) + 1000;
			
			
			String color = "Blue";
			
			allBikes.add(new Bike(color, randomSize, randomPrice));
		}
			int index = 0;
			for(Bike b:allBikes){
				
			System.out.println("Bike number " + index++ + " costs " + b.getPrice() + " SEK, and is " + b.getSize() + " inches long" + " and has the color " + b.getColor());
				
			}
		}

	}


