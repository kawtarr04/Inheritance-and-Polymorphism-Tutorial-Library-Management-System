package tuto2;

public class EBook extends LibraryItem{

	int fileSize;
	String format;
	public void getItemType(){
	     System.out.println("Book:");
	 }
	
	public EBook(String title, String author, int fileSize, String format) {
		super(title, author);
		this.fileSize=fileSize;
		this.format=format;
		// TODO Auto-generated constructor stub
		
	}

}
