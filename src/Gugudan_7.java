
public class Gugudan_7 {
	public static void main(String[] args) {
		int i=1;
		int j=1;
		while(i < 10) {			
			//곱셈 결과 출력
			System.out.println(6 * i);
			// i 값을 1 증가
			i++;
			if(i == 10) {				
				System.out.println("7단 시작");
				while(j < 10) {					
					System.out.println(7 * j);
					j++;
				}
			}
		}
	}
}
