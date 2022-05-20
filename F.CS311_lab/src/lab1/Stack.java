package lab1;

import java.util.Scanner;

public class Stack {
	public static void main(String[] args) {

		System.out.println("Комманд сонгоно уу:");
		System.out.println("1. push");
		System.out.println("2. pop");
		System.out.println("3. peek");
		System.out.println("4. isFull");
		System.out.println("5. isEmpty");
		System.out.println("6. printStack");

		Scanner scan = new Scanner(System.in);
		MyStack st = new MyStack(10);

		while (true) {
			System.out.println("Сонголт:");
			int sc = scan.nextInt();

			switch (sc) {
			case 1: {
				System.out.println("\nСтект хэдэн утга нэмэх вэ? тоог оруулна уу:");
				int index = scan.nextInt();
				System.out.println("Стект утга оруулна уу : ");
				for (int i = 0; i < index; i++) {
					st.push(scan.nextInt());
				}
				System.out.println("Амжилттай нэмэгдлээ");
				break;
			}
			case 2: {
				System.out.println("\nСтекийн хасагдсан оройн утга:" + st.pop());
				break;
			}
			case 3: {
				System.out.println("\nСтекийн оройн утга:" + st.peek());
				break;
			}
			case 4: {
				System.out.println("\nСтек дүүрсэн эсэх:" + st.isFull());
				break;
			}
			case 5: {
				System.out.println("\nСтек хоосон эсэх:" + st.isEmpty());
				break;
			}
			case 6: {
				st.printStack();
				break;
			}
			default: {
				System.out.println("Сонголт олдсонгүй !");
				System.out.println("1-6 хооронд сонгоно уу");
			}
			}
		}
	}
}
