import java.util.Scanner;
//Scanner ȣ��
public class Gugudan_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("������ �� ����� ����?(���ڸ� �Է��Ͻÿ�.) : ");
		int userNumber = sc.nextInt();
		for(int i=1; i<10; i++) {
			if(userNumber == 1) {				
				System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�. ");
				break;
			}
			if(userNumber > 9 ) {				
				System.out.println("2�̻�, 9������ ���� �Է��� �� �ֽ��ϴ�. ");
				break;
			}
			System.out.println(userNumber * i);
		}
	}
}
