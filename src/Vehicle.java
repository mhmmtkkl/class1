
public class Vehicle {

//	Getters and setters 
	
/* 
 * 	public  --> I can access this variable or method in any class in my project
 * 
 * 	protected  --> I can access this variable or method in that package or parent class of that class
 * 
 * 	default  --> I can access this variable or method in that class or any class created object of that class
 * 
 * 	private  --> Just in the class
 * 
 */
	
	private String Brand;
	
	private String Model;
	
	private int wheel;
	
	private String color = "White"; 
	
	public void setModel(String Model) {
		
		this.Model = Model;
		
	}
	
	public void setBrand(String Brand) {
		
		this.Brand = Brand;
		
	}
	 
	public void setwheel(int wheel) {
		
		this.wheel = wheel;
		
	}
	
	public void setColor(String color) {
		
		this.color = color;
		
	}
	 
	
	
	
	
}
