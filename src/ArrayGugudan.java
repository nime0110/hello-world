
public class arrayGugudan {
	public static void main(String[] args) {
		//�迭���� �� �迭�� ũ�� ���� - 9���� ������(int����)�� ������ �迭�� ����
        int[] result = new int[9];
        for(int i=2; i < result.length; i++) {
        	System.out.println("test");
        	//�迭�� ���� ����. �迭�� ù��°�� 0��
        	for(int j=0; j < result.length; j++) {        		
        		result[j] = i * (j + 1);
        		System.out.println(result[j]);        	
        	}
        }                 
	}
}
