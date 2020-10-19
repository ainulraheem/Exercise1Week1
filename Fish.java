 public class Fish {

	//Attribute or data member or fileds
	private String color = "blue"; //blue default value

	//Method 
	public void Swim () {
		System.out.println(color + " fish swim");
	}

	public void SetColor(String warna) {
		color = warna;
	}

	public String GetColor() {
		return color;
	}

}