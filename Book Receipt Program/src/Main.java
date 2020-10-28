// Derick Yudanegara
// 2201740565 - BD01
// Quiz Operating System LAB

//Main Menu

import java.util.Scanner;

public class Main {
	Scanner scan = new Scanner(System.in);
	
	String category;
	String name;
	int pages = 0;
	String cover;
	public Main() {
		// TODO Auto-generated constructor stub
		
		int inputMenu = 0;
		
		int ngulang = 1;
		
		do {
			do {
				System.out.println("\n\n\nDeluXe BookStore");
				System.out.println("===============");
				System.out.println("Choose one of these items to buy");
				System.out.println("1. Regular Book");
				System.out.println("2. Premium Book");
				System.out.print(">> ");
				try {
					inputMenu = scan.nextInt();
				} catch (Exception e) {
					// TODO Auto-generated catch block
					inputMenu = 0;
				}
				scan.nextLine();
			} while (inputMenu != 1 && inputMenu != 2);
			if (inputMenu == 1) {
				regularBook();
			} else if (inputMenu == 2) {
				premiumBook();
			} 
		} while (ngulang == 1);
		
		
	}

	

	private void regularBook() {
		
		do {
			// TODO Auto-generated method stub
			System.out.print("Input book's category [Comedy | Romance | Fiction]: ");
			category = scan.nextLine();
		} while (!category.equals("Comedy") && !category.equals("Romance") && !category.equals("Fiction"));
		do {
			System.out.print("Input book's name [5 - 15 characters]: ");
			name = scan.nextLine();
		} while (name.length()<5 || name.length()>15);
		
		do {
			System.out.print("Input book's pages [more than or equals 50 pages]: ");
			try {
				pages = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				pages = 0;
			}
			scan.nextLine();
		} while (pages < 50);
		RegularBook objRegularBook = new RegularBook(category, name, pages);
		objRegularBook.printTheSummary();
		System.out.println("Press Enter..");
		scan.nextLine();
	}
	
	private void premiumBook() {
		// TODO Auto-generated method stub
		do {
			// TODO Auto-generated method stub
			System.out.print("Input book's category [Comedy | Romance | Fiction]: ");
			category = scan.nextLine();
		} while (!category.equals("Comedy") && !category.equals("Romance") && !category.equals("Fiction"));
		do {
			System.out.print("Input book's name [5 - 15 characters]: ");
			name = scan.nextLine();
		} while (name.length()<5 || name.length()>15);
		
		do {
			System.out.print("Input book's pages [more than or equals 50 pages]: ");
			try {
				pages = scan.nextInt();
			} catch (Exception e) {
				// TODO Auto-generated catch block
				pages = 0;
			}
			scan.nextLine();
		} while (pages < 50);
		do {
			// TODO Auto-generated method stub
			System.out.print("Input book's cover [Soft | Hard]: ");
			cover = scan.nextLine();
		} while (!cover.equals("Soft") && !cover.equals("Hard"));
		PremiumBook objPremiumBook = new PremiumBook(category, name, pages, cover);
		objPremiumBook.printTheSummary();
		System.out.println("Press Enter..");
		scan.nextLine();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();	
	}

}
