package Test;

public class Item {
	
	private String Description;
	private Boolean purchased;
	
	public Item(String Desc) {
		this.Description = Desc;
		setPurchased(false);
	}

	public Boolean getPurchased() {
		return purchased;
	}

	public void setPurchased(Boolean purchased) {
		this.purchased = purchased;
	}

	public String getDescription() {
		return Description;
	}
}
