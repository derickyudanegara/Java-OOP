// Derick Yudanegara
// 2201740565 - BD01
// Quiz Operating System LAB

//Class Premium Book

public class PremiumBook extends BookType{

	private String cover;
	
	public String getCover() {
		return cover;
	}

	public PremiumBook(String category, String name, int pages, String cover) {
		super(category, name, pages);
		// TODO Auto-generated constructor stub
		this.cover = cover;
	}

	public void setCover(String cover) {
		this.cover = cover;
	}

	public PremiumBook() {
		// TODO Auto-generated constructor stub
	}

	
	private int getVariationPrice() {
		// TODO Auto-generated method stub
		int variation;
		if(this.cover.equals("Soft"))
			variation = 15000;
		else
			variation = 10000;
		return variation;
	}
	

	

	
	@Override
	public int totalPrice() {
		// TODO Auto-generated method stub
		return this.getBasePrice() + getAdditionalPrice() + getVariationPrice();
	}

	@Override
	public void printTheSummary() {
		// TODO Auto-generated method stub
		int price = totalPrice();
		System.out.println("\n\n\n========================Deluxe Book Store=============================");
		System.out.println("======================================================================");
		System.out.println("Name" + " " + "Category"+ " " + "Total Pages"+ " " + "Cover" + " " + "Total Price");
		System.out.println("======================================================================");
		System.out.println(this.name + " " + this.category + " " + this.pages + " " + this.cover + " " + price);
		System.out.println("======================================================================\n");
	}
	

}
