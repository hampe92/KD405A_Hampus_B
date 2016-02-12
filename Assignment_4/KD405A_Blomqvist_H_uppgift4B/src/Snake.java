
public class Snake extends Animal {
	
	private boolean poisonus = false;

	/**Konstruktor*/
	public Snake(String latinName, boolean poisonus) {
		
		super(latinName);
		this.poisonus = poisonus;
		
	}
	
	public boolean isPoisonus(){
		return this.poisonus;
		
	}

	@Override
	public String getInfo() {
		String poisonusOrNot = "not poisonus";
		if(isPoisonus()){
			poisonusOrNot = "poisonus";
		}
		String info = "The snake with the latin name \"" +latinName + "\" is " +poisonusOrNot + "."+"\n";
		return info;
		
	    	
	
	}

}
