import java.util.Scanner;
//Scanner ȣ��
public class Gugudan_9 {
	public static void main(String[] args) {
		System.out.println("������ �� ����� ����?(���ڸ� �Է��Ͻÿ�.) : ");
		Scanner sc = new Scanner(System.in);
		int userNumber = sc.nextInt();
		System.out.println("����ڰ� �Է��� �� : " + userNumber);
		
		if(userNumber < 2) {				
			System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�. ");
		} else if (userNumber > 9) {
			System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�. ");				
		} else {			
			for(int i=1; i<10; i++) {
				System.out.println(userNumber * i);
			}
		}
	}
}
