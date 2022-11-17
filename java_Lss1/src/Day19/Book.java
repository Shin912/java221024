package Day19;

import java.text.DecimalFormat;

import lombok.Data;

@Data
public class Book {
	private String bookName, type, publisher, author;
	private int isbn, money;
	
	public String getMoneyStr() {
		DecimalFormat df = new DecimalFormat("###,###");
		return df.format(money);
	}
	
	public void print() {
		System.out.println("========================");
		System.out.println("책이름 : " + bookName);
		System.out.println("저자 : " + author);
		System.out.println("가격 : " + getMoneyStr() + "원");
		System.out.println("출판사 : " + publisher);
		System.out.println("ISBN : " + isbn);
		System.out.println("========================");
	}

	public Book(String bookName, String type, String publisher, String author, int isbn, int money) {
		this.bookName = bookName;
		this.type = type;
		this.publisher = publisher;
		this.author = author;
		this.isbn = isbn;
		this.money = money;
	}

	@Override
	public String toString() {
		return "ISBN : " + isbn + " 책이름 : " + bookName;
	}


}
