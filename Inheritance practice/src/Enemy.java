
public class Enemy extends Main{
	int n;
	String name;
	String type;
	
	public void setNumber(int n) {
		this.n = n;
	}
	
	public int getNumber (){
		return n;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public Enemy(String name, int n) {
		
	}
	
	public void battleCry() {
		System.out.println("you wanna die, scum?");
	}
	public void attack() {
		System.out.println("enemy deals " + n +" damage to you.");
	}
	
}
