package day3JavaBasicsExcercises;

public class Rectangle {
	// Program to find the are of the two Rectangles (4,5) and (5,8)

	int length;
	int width;
	
	private double Area(int length, int width)
	{
	    double area;
	    area = length*width;
		return area;
	}
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle();
	    System.out.println("Area of the rectangle with sides (4,5) is "+rectangle.Area(4,5));
		System.out.println("Area of the rectangle with sides (5,8) is "+rectangle.Area(5,8));

		
	}

}
