
public class Gugudan_7 {
	public static void main(String[] args) {
		int i=1;
		int j=1;
		while(i < 10) {			
			//���� ��� ���
			System.out.println(6 * i);
			// i ���� 1 ����
			i++;
			if(i == 10) {				
				System.out.println("7�� ����");
				while(j < 10) {					
					System.out.println(7 * j);
					j++;
				}
			}
		}
	}
}
