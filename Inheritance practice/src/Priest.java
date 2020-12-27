
public class Priest extends Friendly{
	
	String type = "Priest";

	public Priest(String friendName, int heal,String type) {
		super(friendName, heal);
		// TODO Auto-generated constructor stub
		this.type=type;
	}
	
	public void sayType() {
		System.out.println("I am a " + type);
	}
	
	public int holyPrayer(int heal) {
		System.out.println("Priest heals you for " + heal);
		return heal;
	}
	
	

}
