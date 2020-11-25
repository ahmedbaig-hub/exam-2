package javaleads.lesson2;

public interface product implements Vehicle {
	String productname();
	int quantity();
	
	public void addstock(String productname, int quantity) {
		
	}
}
