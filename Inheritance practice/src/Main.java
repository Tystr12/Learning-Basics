
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		Raider Jack = new Raider("Jack", 150);
		Necromancer Phil = new Necromancer("Phil", 200);
		
		
		
		System.out.println("You are being attacked by a Raider and a Necromancer!\n"
				+ "They scream:");
		
		Jack.battleCry();
		Phil.battleCry();
		
		Jack.setNumber(155);
		
		Jack.attack();
		
		Phil.setNumber(250);
		Phil.attack();
		
		Enemy Destro = new Enemy("Destro", 100);
		
		Destro.setNumber(80);
		Destro.attack();
		
		Priest Arthur = new Priest("Arthur", 200, "Priest");
		
		Arthur.sayType();
		Arthur.holyPrayer(200);
	}

}
