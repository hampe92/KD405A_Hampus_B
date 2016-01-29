
//Uppgift 1
public class House{
	 private int yearBuilt; 
	 private int size; 
	 private final int minSize = 10; 
	 private final int maxSize = 1000;
	 private final int minyearBuilt = 1800;
	 private final int maxyearBuilt = 2015;
	 
	 public House(int yearBuilt,int size){ 
	 this.yearBuilt = yearBuilt;
	 this.size = size;
	 }
	 public int getYearBuilt(){
	 return this.yearBuilt;
	 }
	 public int getSize(){
	 return this.size;
	 }
	}
