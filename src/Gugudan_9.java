import java.util.Scanner;
//Scanner 호출
public class Gugudan_9 {
	public static void main(String[] args) {
		System.out.println("구구단 중 출력할 단은?(숫자만 입력하시오.) : ");
		Scanner sc = new Scanner(System.in);
		int userNumber = sc.nextInt();
		System.out.println("사용자가 입력한 값 : " + userNumber);
		
		if(userNumber < 2) {				
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다. ");
		} else if (userNumber > 9) {
			System.out.println("2이상, 9이하의 값만 입력할 수 있습니다. ");				
		} else {			
			for(int i=1; i<10; i++) {
				System.out.println(userNumber * i);
			}
		}
	}
}
