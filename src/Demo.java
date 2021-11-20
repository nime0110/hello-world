public class Demo {
	public static void main(String[] args) {
		int number1 = 2;
		int number2 = 3;
		System.out.println("<구구단 2단 출력>");
		for(int i=1; i<10; i++) {
			System.out.println("2x" + i + "=" + number1 * i);
			if(i == 9) {
				System.out.println("<구구단 3단 출력>");
				for(int j=1; j<10; j++) {
				System.out.println("3x" + j + "=" + number2 * j);
			}
		}
	}
	}
}
