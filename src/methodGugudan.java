
public class methodGugudan {
	
	//�޼��� ����� : ù��° �޼���� 2��� ���� �����ؼ�, 2���� ���� ����� �迭�� ��� �迭�� ��ȯ�� �ִ� �޼��带 �����.
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
	
	
	
	
	//������ Ÿ�� ����, �޼��� �̤Ӹ� ���� int times<-�Է°�/ ���int[]<-�迭�� ��� ����ؾ� �ϹǷ�.. 
	//void -> ��µǴ�, �޼��带 �������� �� ��ȯ�Ǵ� ���� ���ٴ� ��
	//2�� 3�� 4�� �̷��� �Ǿ��ϹǷ�.. �� ���� times �� �Է��ϰ�, �� ���� �ӹ�ȯ�� �Ǿ��ϹǷ� return�� ��
	//result�� ������ Ÿ���� ���� int[] int�迭�̴�.
	//�޼����� ��ȯ���� Ÿ�԰� ��ġ�����ָ� �ȴ�.
	//���� ���� �޼��忡�� calculate �޼��带 ȣ���ϸ鼭 ���ڸ� ��Ƽ� ��ȯ�� �� �ִ�. 
	
}