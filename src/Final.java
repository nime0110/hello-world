import java.util.Scanner;

public class Final {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 중 출력할 단은?(숫자만 입력하시오.) : ");		
		String inputValue = sc.nextLine();
		String[] splitedValue = inputValue.split(",");
		int first = Integer.parseInt(splitedValue[0]);
		int second = Integer.parseInt(splitedValue[1]);
		for(int i=1; i< second; i++) {			
			System.out.println(first + "x" + i + "=" +  second *i);
		}
		sc.close();  
	}
}
