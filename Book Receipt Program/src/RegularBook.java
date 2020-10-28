// Derick Yudanegara
// 2201740565 - BD01
// Quiz Operating System LAB

//Class Regular Book


public class RegularBook extends BookType{

	
	
	
	public RegularBook(String category, String name, int pages) {
		super(category, name, pages);
		// TODO Auto-generated constructor stub
	}

	public RegularBook() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	



	
	@Override
	public void printTheSummary() {
		// TODO Auto-generated method stub
		int price = totalPrice();
		System.out.println("\n\n\n========================Deluxe Book Store=============================");
		System.out.println("======================================================================");
		System.out.println("Name" + " " + "Category"+ " " + "Total Pages"+ " " + "Total Price");
		System.out.println("======================================================================");
		System.out.println(this.name + " " + this.category + " " + this.pages + " " + price);
		System.out.println("======================================================================\n");
		
		
	}
	
	
	
	

}
