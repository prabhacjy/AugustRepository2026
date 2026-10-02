package day5w2JavaAdvExercises;

public class Car implements Vehicle {

	@Override
	public void start() {
		
		System.out.println("Start the car - defined from class car");
		
	}

	@Override
	public void stop() {

		System.out.println("Stop the car - defined from class car");
		
	}

	@Override
	public void drive() {
		
		System.out.println("Drive the car - defined from class car");
		
	}

}
