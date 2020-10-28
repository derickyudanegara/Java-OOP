// Derick Yudanegara
// 2201740565 - BD01
// Quiz Operating System LAB

//Class BookType

public abstract class BookType {

	public BookType() {
		// TODO Auto-generated constructor stub
	}
	
	protected String category;
	protected String name;
	protected int pages;
	
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	
	public BookType(String category, String name, int pages) {
		this.category = category;
		this.name = name;
		this.pages = pages;
	}

	protected int getBasePrice() {
		int basePrice = 0;
		if(this.category.equals("Comedy"))
			basePrice = 55000;
		else if(this.category.equals("Romance"))
			basePrice = 58000;
		else {
			basePrice = 60000;
		}
		return basePrice;
	}
	
	
	

	public int getAdditionalPrice() {
		// TODO Auto-generated method stub
		int additionalPrice = 0;
		if(this.pages >= 50 && this.pages <100)
			additionalPrice = this.getBasePrice() * 10 / 100;
		else if(this.pages >= 100 && this.pages < 150)
			additionalPrice = this.getBasePrice() * 20 / 100;
		else {
			additionalPrice = this.getBasePrice() * 30 / 100;
		}
		return additionalPrice;
	}
	
	public int totalPrice() {
		// TODO Auto-generated method stub
		return this.getBasePrice() + getAdditionalPrice();
	}
	
	
	
	public abstract void printTheSummary();
	

}
