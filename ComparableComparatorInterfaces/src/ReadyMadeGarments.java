
public class ReadyMadeGarments implements Comparable<ReadyMadeGarments>{

	private int ClothId;
	private String typeOfCloth;
	private int price;
	public int getClothId() {
		return ClothId;
	}
	public void setClothId(int clothId) {
		ClothId = clothId;
	}
	public String getTypeOfCloth() {
		return typeOfCloth;
	}
	public void setTypeOfCloth(String typeOfCloth) {
		this.typeOfCloth = typeOfCloth;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "ReadyMadeGarments [ClothId=" + ClothId + ", typeOfCloth=" + typeOfCloth + ", price=" + price + "]";
	}
	
	public ReadyMadeGarments(int clothId, String typeOfCloth, int price) {
		super();
		ClothId = clothId;
		this.typeOfCloth = typeOfCloth;
		this.price = price;
	}
	
	public ReadyMadeGarments() {
		super();
	}

	@Override
	public int compareTo(ReadyMadeGarments o) {
		return (this.ClothId > o.ClothId) ? 1 : ((this.ClothId < o.ClothId)? -1 : 0);
	
	}
	
	
	
}
