package tuto2;

public class LibrarySystem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LibraryItem[] items = new LibraryItem[4];
		items[0] = new Book("1984", "George Orwell", "Dystopian");
		items[1] = new Magazine("National Geographic", "Various", 2023);
		items[2] = new Journal("IEEE Transactions", "John Doe","Engineering");
		items[3] = new EBook("title1", "author1", 250, "book");
		for (LibraryItem item : items) {
		item.displayInfo(); // Polymorphic call
		System.out.println(); // For better readability

		}
	}

}
