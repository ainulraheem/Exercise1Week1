public class Driver {

	public static void main(String [] arg) {
		//Fish is actually a data type
		//Fish nemo; == int x;
		Fish nemo = new Fish(); //nemo is an object. Fish is a class.

		nemo.Swim();
		//nemo.color = "red"; //tukar value
		nemo.SetColor("red");
		nemo.Swim();
		//nemo.Eat(); //superclass call subclass method

		Shark bruce = new Shark();
		bruce.Eat();
		bruce.Swim(); //original swim
		bruce.Swim(4); //overloading swim with one int parameter
		bruce.Swim(1.0); //overloading swim with one double parameter
		bruce.Swim(3,2); //overloading swim with two int parameter

		bruce.SetSharpTeeth(130);
		bruce.Eat();


		//Fish dory = new Fish(); //another object

		//dory.Swim();
		//dory.color = "yellow";
		//dory.SetColor("orange");
		//dory.Swim();

		//Aquirium fancyAquirium = new Aquirium();
		//fancyAquirium.fillFish();
	}
}