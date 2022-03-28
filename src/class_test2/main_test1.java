package class_test2;

import  java.util.Scanner;

public class main_test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadTest1 over1 = new OverloadTest1();
		
		int sum1 = over1.sum();
		//sum1 = 0
		int sum2 = over1.sum(10.5, 20.7);
		//sum2 = 200
		
		
		
		
		
		
//		Book book1= new Book("홍길동전기","허균");
		
//		Book book_array[] = new Book[5];
//		
//		Scanner scann = new Scanner(System.in);
//		for(int i=0;i<book_array.length;i++) {
//			System.out.print("책제목을 입력하세요:");
//			String title = scann.nextLine();
//			System.out.print("책저자를 입력하세요:");
//			String author = scann.nextLine();
//			
//			book_array[i] = new Book(title,author);
//		}
//		
//		String a = book_array[3].author;
//		String b = book_array[3].title;
//		
//		System.out.println(a);
//		System.out.println(b);
//		
//		scann.close();
	}

}
