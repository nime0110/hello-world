//scanner를 사용하기 위해서 import 를 통해 호출. 자바 패키지에 포함되어 있음.
import java.util.Scanner;

public class Gugudan_4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 중 출력할 단은?(숫자만 입력하시오.) : ");		
		//sc라는 객체 생성하여 System.in 으로 입력한 값을 바이트 단위로 읽음.
		int number =sc.nextInt();
		for(int i=1; i<10; i++) {			
			System.out.println(number + "x" + i + "=" + number *i);
		}
		sc.close();  
	}
}

