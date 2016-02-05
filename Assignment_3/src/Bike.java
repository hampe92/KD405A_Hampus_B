
public class Bike {
	
	private String color;
	private int price;
	private int size;
	/**konstruktor*/
	public Bike(String color, int size){ 
		this.color = color;
		this.size = size;
		
		
		boolean trueColor = false;
		for(int i=0; i<=Constants.APPROVED_COLOR.length; i++){
		if(Constants.APPROVED_COLOR[i].equals(color)){
		trueColor=true;
		}
		}
		if(trueColor == true){
			this.color = color;
		}else{
			this.color="Error404 - color not found";
			
		}
	}
	/**konstruktor*/
	public Bike(String color, int price, int size){ 
		this.color = color;
		this.price = price;
		this.size = size;
		/**If sats som ser till att du inte kan sätta vilket pris som helst*/
		if(price > Constants.MIN_PRICE && price < Constants.MAX_PRICE){
			this.price = price;
		}else{
			this.price = Constants.DEFAULT_PRICE;
		}
		if(size> Constants.MIN_SIZE && size < Constants.MAX_SIZE){
			this.size = size;
		}else{
			this.size = Constants.DEFAULT_SIZE;
		}
	}
	public String getColor(){
		
		return this.color;
	}
	public int getSize(){
		
		return this.size;
	}
	public int getPrice(){
		
		return this.price;
	}
	public void setPrice(int price){
		this.price = price;
	}
}



