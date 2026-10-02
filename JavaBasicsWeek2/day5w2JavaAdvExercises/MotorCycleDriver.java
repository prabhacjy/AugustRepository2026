package day5w2JavaAdvExercises;

public class MotorCycleDriver extends Driver  {

	public void start() {
		
		System.out.println("Start the MotorCyle");
	}


	public void stop() {
		
		System.out.println("Stop the MotorCyle");
	}

	
	public void drive() {
		
		System.out.println("Drive the MotorCyle");
	}

	private Motorcycle motorcycle;
	
	public void MotorcycleDriver(Motorcycle motorcycle) {
		this.motorcycle = motorcycle;
	}
	
	public void driveVehicle() {
		// TODO Auto-generated method stub
		System.out.println("MotorCyle is driving smoothly and carefully");
		motorcycle.start();
		motorcycle.stop();
		motorcycle.drive();
	}

}
