package day8;
abstract class CarDriving1{
	abstract void accelerator();
	abstract void Break();
}

class drive extends CarDriving1{
	public void accelerator() {
		System.out.println("the car is start moving");
	}
	public void Break() {
		System.out.println("the car is stopped ");
	}
}
public class CarDriving {

	public static void main(String[] args) {
		drive d = new drive();
		d.accelerator();
		d.Break();
	}

}
