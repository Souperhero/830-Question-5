import java.util.ArrayList;


public abstract class SpaceShip {
	Int tonnage;
	String name;
	String franchise
}

public class StarWarsShips extends SpaceShip {

	public Acclamator(int tonnage, String name) {
		Acclamator myShip = new Acclamator("Acclamator Class");
		this.tonnage = 100,000,000
		this.name = "Clone 501"
		this.franchise = "Star Wars"
	}

	public StarDestroyer() {
		StarDestroyer myShip = new StarDestroyer("Imperial Star Destroyer");
		this.tonnage = 4,400,000,000
		this.name = "Vaders Destroyer"
		this.franchise = "Star Wars"
	}

	public CorellianCorvette() {
		CorellianCorvette myShip = new CorellianCorvette("Corellian Transport Corvette");
		this.tonnage = 6,000,000
		this.name = "Tantive IV"
		this.franchise = "Star Wars"
	}

	public StarWarsShipsData(String name, Int tonnage) {
		this.name = name;
		this.tonnage = tonnage;
		this.franchise = franchise
	}

	public String getName() {
		return this.name;
	}

	public Int getTonnage() {
		return this.tonnage;
	}

	public String getFranchise() {
	return this.franchise;
	}
}

public class StarTrekShips extends SpaceShip {

	public Enterprise(int tonnage, String name) {
		Enterprise myShip = new Enterprise("Enterprise Class");
		this.tonnage = 190,000
		this.name = "The USS Enterprise"
		this.franchise = "Star Trek"
	}

	public EnterpriseB() {
		EnterpriseB myShip = new EnterpriseB("Second Iteration Enterprise");
		this.tonnage = 185,000
		this.name = "The USS Enterprise B"
		this.franchise = "Star Trek"
	}

	public Voyager() {
		Voyager myShip = new Voyager("Voyager Class");
		this.tonnage = 192,000
		this.name = "The USS Voyager"
		this.franchise = "Star Trek"
	}

	public StarTrekShipsData(String name, Int tonnage) {
		this.name = name;
		this.tonnage = tonnage;
		this.franchise = franchise
	}

	public String getName() {
		return this.name;
	}

	public Int getTonnage() {
		return this.tonnage;
	}

	public String getFranchise() {
		return this.franchise;
	}
}

public class StarCitizenShips extends SpaceShip {


	public Buccaneer(int tonnage, String name) {
		Enterprise myShip = new Enterprise("Drake Class");
		this.tonnage = 10,000
		this.name = "Ita's Greatest"
		this.franchise = "Star Citizen"
	}

	public Constellation() {
		Constellation myShip = new Constellation("RSI Class");
		this.tonnage = 65,000
		this.name = "HMS Olisar"
		this.franchise = "Star Citizen"
	}

	public Aurora() {
		Aurora myShip = new Aurora("RSI Class");
		this.tonnage = 12,000
		this.name = "Assassin X"
		this.franchise = "Star Citizen"
	}

	public StarCitizenShipsData(String name, Int tonnage, String franchise) {
		this.name = name;
		this.tonnage = tonnage;
		this.franchise = franchise
	}

	public String getName() {
		return this.name;
	}

	public Int getTonnage() {
		return this.tonnage;
	}

	public String getFranchise() {
		return this.franchise;
	}
}

public class AddToList {

	public static void main(String[] s) {

		SpaceShip f1 = new StarWarsShips();
		SpaceShip f2 = new StarTrekShips();
		SpaceShip f2 = new StarCitizenShips();

		ArrayList<SpaceShip> foodList = new ArrayList<SpaceShip>();
		SpaceShipList.add(f1);
		SpaceShipList.add(f2);
		SpaceShipList.add(f3);
	}
}