public class Gugudan_10 {
	public static void main(String[] args) {
		int[] result = new int[9];
		//int �����͸� 9�� ������ �� �ִ� ������ ������
		for(int i=0; i < result.length; i++) {
			for(int j=2; j < 9; j++) {
				result[i]= j * (i + 1);
			}
		}
		for(int i=0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}

