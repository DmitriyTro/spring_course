package spring_introduction;

//@Component("catBean") //def id "cat"
public class Cat implements Pet {
	public Cat() {
		System.out.println("Cat bean is created.");
	}

	@Override
	public void say() {
		System.out.println("Meow-Meow!");
	}
}
