package chap06.method;

public class Car {

	//�ʵ�
	
	int gas = 15;
	
	//������
	
	
	
	//�޼ҵ�
	
	void setGas(int gas) {
		this.gas = gas;
	}
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("�⸧ ����");
			return false;
		}
		
		System.out.println("�⸧ �ִ�");
		return true;
	}
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("�޷���~~~~~~~~~~~~(�⸧ :" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����~~~~~~!(�⸧ : " + gas + ")");
				return;
			}
		}
	}
}