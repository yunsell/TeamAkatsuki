package chap04.ex;
import java.util.Scanner;

public class Ex03 {
	public static void main(String[] args) {
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		int input;
		
		while(run) {
			System.out.println("=====================================");
			System.out.println("1. ���� | 2. ��� | 3. �ܰ� | 4. ����");
			System.out.println("=====================================");
			System.out.print("����>");
			input = scanner.nextInt();
			
				if (input == 1) {
					System.out.println(">> �� �������?");
					input = scanner.nextInt();
					balance += input;
				}
									
				else if (input == 2) {
					System.out.println(">> �� �����?");
					input = scanner.nextInt();
					balance -= input;
				}
					
				
				else if (input == 3) {
					System.out.println(balance + "�� �ִ�");
					}
				
				else if (input == 4) {
					break;
				}
					}
		}

	
	
	
}



			