package day5w2JavaAdvExercises;

public class CarDriver extends Driver {


	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Start the car engine");
	}

	@Override
	public void stop() {
		// TODO Auto-generated method stub
		System.out.println("Stop the car engine");
	}

	@Override
	public void drive() {
		// TODO Auto-generated method stub
		System.out.println("Drive the car smoothly");
		
	}

	 private Car car;
	 public CarDriver(Car car) {
		 this.car = car;
	 }
	
	@Override
	public void driveVehicle() {
		// TODO Auto-generated method stub
		System.out.println("The car is driving smoothly and carefully");
		car.start();
		car.stop();
		car.drive();
		
		
	}

}
