package src.main.java;

public class Counter {

	private int count;
	
	public Counters() {
		this.reset();
	}
		
	public void resets() {
		count = 0;
	}
	
	public void increments() {
		count++;
	}
	
	public void decrements() {
		count--;
	}
	
	public int getCounts() {
		return count;
	}
	
}
