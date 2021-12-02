
public class arrayGugudan {
	public static void main(String[] args) {
		//배열생성 및 배열의 크기 지정 - 9개의 데이터(int정수)를 가지는 배열을 만듬
        int[] result = new int[9];
        for(int i=2; i < result.length; i++) {
        	System.out.println("test");
        	//배열에 담을 것임. 배열의 첫번째가 0임
        	for(int j=0; j < result.length; j++) {        		
        		result[j] = i * (j + 1);
        		System.out.println(result[j]);        	
        	}
        }                 
	}
}
