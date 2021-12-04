
public class GugudanMain {
	
	public static void main(String[] args) {
		for(int j=2; j < 10; j++) {
			int[] result= MethodGugudan.calculate(j);
			MethodGugudan.print(result);
		}
	}
}
