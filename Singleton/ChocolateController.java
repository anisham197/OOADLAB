public class ChocolateController {
	public static void main(String args[]) {
		ChocolateBoiler boiler = ChocolateBoiler.getInstance();
		boiler.fill();

		boiler.fill();
		boiler.pour();

		boiler.boil();
		boiler.boil();
		boiler.pour();

		boiler.pour();
		boiler.boil();

		boiler.fill();

		// will return the existing instance
		ChocolateBoiler boiler2 = ChocolateBoiler.getInstance();
		boiler2.fill();
	}
}

class ChocolateBoiler {

	private boolean empty;
	private boolean boiled;
	private static ChocolateBoiler uniqueInstance;

	private ChocolateBoiler() {
		empty = true;
		boiled = false;
	}

	private static class BoilerHousing {
		private static final ChocolateBoiler INSTANCE = new ChocolateBoiler();
	}

	public static ChocolateBoiler getInstance() {
		// if (uniqueInstance == null) {
		// 	System.out.println("Creating unique instance of Chocolate Boiler");
		// 	uniqueInstance = new ChocolateBoiler();
		// }
		// else {
		// 	System.out.println("Returning instance of Chocolate Boiler");
		// }
		return BoilerHousing.INSTANCE;
	}

	public void fill() {
		if (isEmpty()) {
			empty = false;
			boiled = false;
			System.out.println("Filled raw mixture");
			// fill the boiler with a milk/chocolate mixture
		}
		else{
				System.out.println("Boiler is already full");
		}
	}

	public void pour() {
		if (!isEmpty() && isBoiled()) {
				empty = true;
				boiled = false;
				System.out.println("Poured out");
		}
		else{
				if(isEmpty()){
						System.out.println("Not poured out : Boiler empty");
				}
				else {
						System.out.println("Not poured out : Boiler not heated");
				}
		}
	}

	public void boil() {
		if (!isEmpty() && !isBoiled()) {
			System.out.println("Boiled the choclate mixture");
			boiled = true;
		}
		else{
				if(isEmpty()){
						System.out.println("Not Heated : Boiler empty");
				}
				if(isBoiled()){
						System.out.println("Not Heated : Boiler already heated");
				}
		}
	}

	public boolean isEmpty() {
		return empty;
	}

	public boolean isBoiled() {
		return boiled;
	}
}
