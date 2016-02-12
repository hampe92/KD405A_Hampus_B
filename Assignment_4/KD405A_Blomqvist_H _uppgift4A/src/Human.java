
public class Human {

	private Dog dog;
	private String name;
	
	/**Returnerar: "x äger en hund som heter y" eller " x äger inte en hund"*/ 
	public Human(String name){
		this.name = name;
}
	
	public String getName(){
		return this.name;
	}
	
	public void buyDog(Dog dog){
		this.dog = dog;
	}
	
	public String getInfo(){
		
		if(dog == null) {
			String info = getName() + "does not own a dog ";
			return info;
		}else{
			String info = getName() + " owns a dog named " + dog.getDogName();
			return info;
		}
	}
}
