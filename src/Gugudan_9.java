import java.util.Scanner;
//Scanner 호출
public class Gugudan_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 중 출력할 단은?(숫자만 입력하시오.) : ");
		int userNumber = sc.nextInt();
		for(int i=1; i<10; i++) {
			if(userNumber == 1) {				
				System.out.println("2이상, 9이하의 값만 입력할 수 있습니다. ");
				break;
			}
			if(userNumber > 9 ) {				
				System.out.println("2이상, 9이하의 값만 입력할 수 있습니다. ");
				break;
			}
			System.out.println(userNumber * i);
		}
	}
}
