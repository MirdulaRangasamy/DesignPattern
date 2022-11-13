package creational;

import java.util.ArrayList;
import java.util.List;

class Book{
	private int bId;
	private String bName;
	public Book(int bId, String bName) {
		super();
		this.bId = bId;
		this.bName = bName;
	}
	public int getbId() {
		return bId;
	}
	public void setbId(int bId) {
		this.bId = bId;
	}
	public String getbName() {
		return bName;
	}
	public void setbName(String bName) {
		this.bName = bName;
	}
	@Override
	public String toString() {
		return "Book [bId=" + bId + ", bName=" + bName + "]";
	}	
}
class BookStore implements Cloneable{
	private String shopName;
	private List<Book> blist = new ArrayList<Book>();
	
	public void loadBooks() {
		blist.add(new Book(101,"C"));
		blist.add(new Book(102,"C++"));
		blist.add(new Book(103,"JAVA"));
	}
	
	public List<Book> getBlist() {
		return blist;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public void addBook(Book b) {
		blist.add(b);
	}
	

	@Override
	public String toString() {
		return "BookStore [shopName=" + shopName + ", blist=" + blist + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		return super.clone();
	}

	
	
}
public class PrototypeDemo {

	public static void main(String[] args) throws CloneNotSupportedException {
		BookStore store1 = new BookStore();
		store1.loadBooks();
		store1.setShopName("NIVEDITA BOOK SHOP");
		System.out.println(store1.hashCode()+" "+store1);
		BookStore store2 = (BookStore)store1.clone();
		System.out.println(store2.hashCode()+" "+store2);
		store2.setShopName("PRADNYA BOOK STORE");
		store2.addBook(new Book(104,"JS"));
		System.out.println(store2.hashCode()+" "+store2);
		
	}

}
