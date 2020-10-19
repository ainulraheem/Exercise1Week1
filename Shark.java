public class Shark extends Fish {
	private int sharpTeeth = 50;

	public void Eat() {
		System.out.println("Eat with " + sharpTeeth + " number of teeth");
	}

	public void SetSharpTeeth(int teeth) {
		sharpTeeth = teeth;
	}

	public void Swim () {
		System.out.println("fish swim with mouth open with " + sharpTeeth); //implementation
	}

	//overloading
	public void Swim (int fin) {
		System.out.println("fish swim " + fin + " fin"); //implementation
	}

	//overloading
	public void Swim (double tail) {
		System.out.println("fish swim with " + tail + " tail"); //implementation
	}

	//overloading
	public void Swim (int fin, double tail) {
		System.out.println("fish swim with " + fin + " fin and " + tail + " tail"); //implementation
	}
}