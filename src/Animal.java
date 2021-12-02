
public class animal {
	String name;
	public void setName(String name) {
		this.name = name;
	}
	
	public static void main(String[] args) {
		animal cat = new animal();
		cat.setName("body");
		System.out.println(cat.name);
	}
}
