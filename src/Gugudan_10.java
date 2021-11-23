public class Gugudan_10 {
	public static void main(String[] args) {
		int[] result = new int[9];
		//int 데이터를 9개 저장할 수 있는 공간을 생성함
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

