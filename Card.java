package finalProject;

public class Card {
	private int value;
	private String name;
	
	
	
	
	public void describe() {
		System.out.printf("card: %s with the of %d/n,", name, value);
	}
	
	public int getValue() {
		return value;
	}
	
	public void setValue(int value) {
		this.value = value;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
}

		
	

