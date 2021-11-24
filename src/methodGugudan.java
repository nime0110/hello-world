
public class methodGugudan {
	
	//메서드 만들기 : 첫번째 메서드는 2라는 값을 전달해서, 2단의 곱셈 결과를 배열에 담아 배열에 반환해 주는 메서드를 만든다.
	public static int[] calculate(int times) {
	int[] result = new int[9];
	for(int i=0; i <result.length; i++) {
		result[i] = times * (i + 1);
	}
	return result;
	}
	public static void print(int[] result) {
		for(int i=0; i < result.length; i++) {			
			System.out.println(result[i]);
		}
	}
	public static void main(String[] args) {
		for(int j=2;j < 10; j++) {			
			int[] result= calculate(j);
			print(result);
		}
	}
	
	
	
	
	//데이터 타입 지정, 메서드 이ㅣ름 지정 int times<-입력값/ 출력int[]<-배열에 담아 출력해야 하므로.. 
	//void -> 출력되는, 메서드를 실행했을 때 반환되는 값이 없다는 뜻
	//2단 3단 4단 이렇게 되야하므로.. 단 란에 times 를 입력하고, 이 값이 ㅣ반환이 되야하므로 return을 꼭
	//result의 데이터 타입은 현재 int[] int배열이다.
	//메서드의 반환값을 타입과 일치시켜주면 된다.
	//이제 메인 메서드에서 calculate 메서드를 호출하면서 숫자를 담아서 반환할 수 있다. 
	
}