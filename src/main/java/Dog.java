
public class Dog {
	
	int size;
	String name;



void bark() {

	if (size > 60) {
		System.out.println("Гав гав!");
	}
	else if (size > 14) {
		System.out.println("Вуф вуф!");
	}
	else {
		System.out.println("Тяф тяф!");
	}
}
void barkSeveralTimes(int numOfBarks) {

	while (numOfBarks > 0) {
		System.out.println("Гав");
		numOfBarks = numOfBarks - 1;
	}
}
}
