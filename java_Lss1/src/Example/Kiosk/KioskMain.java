package Example.Kiosk;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Day28.Board;

public class KioskMain {

	static Scanner scan = new Scanner(System.in);
	static List<Product> productList = new ArrayList<Product>();

	public static void main(String[] args) {
		int menu = -1;
		
		while(menu != 7) {
			printMnue();
			menu = scan.nextInt();
			scan.nextLine();
			runMenu(menu);
		}
		
	}

	private static void runMenu(int menu) {
		switch(menu) {
		case 1:
			addProduct();
			break;
		case 2:
			updateProduct();
			System.out.println("2. 제품 수정");
			break;
		case 3:
			System.out.println("3. 제품 삭제");
			break;
		case 4:
			System.out.println("4. 제품 구매");
			break;
		case 5:
			System.out.println("5. 제품 판매");
			break;
		case 6:
			System.out.println("6. 매출액 확인");
			break;
		case 7:
			System.out.println("프로그램 종료...!");
			break;
		default:
			System.out.println("잘못된 메뉴 입력!");
		}
		
	}

	private static void updateProduct() {
		System.out.print("분류 : ");
		String categoey = scan.nextLine();
		System.out.print("제품명 : ");
		String product = scan.nextLine();
		
		int index = productList.indexOf(new Product(categoey, product));
		if(index == -1) {
			System.out.println("등록되지 않았거나 삭제된 상품입니다.");
			return;
		}
		Product goods = productList.get(index);
		
		System.out.print("분류 : ");
		categoey = scan.nextLine();
		System.out.print("제품명 : ");
		product = scan.nextLine();
		System.out.print("수량 : ");
		int quantity = scan.nextInt();
		System.out.print("구매가격 : ");
		int buyprice = scan.nextInt();
		System.out.print("판매가격 : ");
		int saleprice = scan.nextInt();
		
		goods = new Product(categoey, product, quantity, buyprice, saleprice);
		productList.set(index, goods);
		System.out.println("제품 수정 완료..");
	}

	private static void addProduct() {
		System.out.print("분류 : ");
		String categoey = scan.nextLine();
		System.out.print("제품명 : ");
		String product = scan.nextLine();
		System.out.print("수량 : ");
		int quantity = scan.nextInt();
		System.out.print("구매가격 : ");
		int buyprice = scan.nextInt();
		System.out.print("판매가격 : ");
		int saleprice = scan.nextInt();
		
		Product goods = new Product(categoey, product, quantity, buyprice, saleprice);
		productList.add(goods);
	}

	private static void printMnue() {
		System.out.println("1. 제품 등록");
		System.out.println("2. 제품 수정");
		System.out.println("3. 제품 삭제");
		System.out.println("4. 제품 구매");
		System.out.println("5. 제품 판매");
		System.out.println("6. 매출액 확인");
		System.out.println("7. 프로그램 종료");
		System.out.println("==================");
		System.out.print("메뉴 입력 : ");
		
	}

}
