package chap04;

public class WhileKeyControlExample {
	public static void main(String [] args) throws Exception{
		boolean run = true;
		int speed = 0;
		int keyCode = 0;
		
		while(run) {
			if(keyCode != 13 && keyCode != 10) {
				
//				�ƽ�Ű�ڵ� 13�� -> ĳ���� ���� (���ڿ� ù �ڸ���)
//				�ƽ�Ű�ڵ� 10�� -> ���� �ǵ� (���� ����)
//				13 + 10 = Enter!
//				  --> Ÿ�ڱ⿡�� ����
//				���� Ű �ϳ� + Enter�� 3���� �ڵ�� �̷���� �ִ�.
//				�� ������ ���ۿ� ����ȴ�.
				
				System.out.println("===================");
				System.out.println("1. ���� | 2. ���� | 3. ����");
				System.out.println("===================");
				System.out.print("���� : ");
				
//				println�� ��� �� �ٹٲ�, print�� �� �� �ٲ�


			}
			
			keyCode = System.in.read();
//			���͸� ������ �ڵ带 keyCode�� �����Ѵ�
			
			if(keyCode == 49) {//1�� �о��� ���
				speed++;
				System.out.println("���� �ӵ� = " + speed);
			}else if(keyCode == 50) {//2�� �о��� ���
				speed--;
				System.out.println("���� �ӵ� = " + speed);
			}else if(keyCode == 51) {
				run = false;
				
			
			}
		}
	}

}