
public class Dog extends Mammal {
	
	private boolean stupid;

	public Dog(String latinName, int gestationTime, boolean stupid) {
		super(latinName, gestationTime);
		this.stupid = stupid;
	}
	public Dog(String latinName, int gestationTime, boolean stupid, String friendlyName) {
		this(latinName, gestationTime, stupid);
		this.setFriendlyName(friendlyName);
	}
	/**Method that return the value of stupid*/
	public boolean isStupid(){
		return this.stupid;
	}

	@Override
	public String getInfo() {
		String smartOrStupid = "not stupid";
		if(stupid == true){
			smartOrStupid = "stupid";
		}
		String info = "The dog named \"" + getFriendlyName()+ "\" with the latin name \""+ latinName+ "\" nurses for " + gestationTime+ "\n months and is " +smartOrStupid+ "\n";
		
	
		return info;
	}

}
