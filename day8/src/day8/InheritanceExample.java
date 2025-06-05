package day8;
class Animal{
	public void Display() {
		System.out.println("Animal makes sounds");
	}
	public void eat() {
		System.out.println("Cat Drinks milk");
	}
	public void sleep() {
		System.out.println("Cat sleeps at night");
	}
	public void eat1() {
		System.out.println("Dog eat bones");
	}
	public void sleep1() {
		System.out.println("Dog sleeps at night");
	}
}
class Dog extends Animal{
	public void bark() {
		System.out.println("The Dog barks Bow");
	}
}
class Cat extends Dog{
	public void meow() {
		System.out.println("the Cat sounds meow");
	}
}
public class InheritanceExample {

	public static void main(String[] args) {
		Cat c = new Cat();
		c.Display();
		c.bark();
		c.meow();
		c.eat();
		c.eat1();
		c.sleep();
		c.sleep1();
	}

}
