import java.util.Scanner;

public class Circle{
	

	// Method to calculate the area of a circle, does't return a value, i.e void
	public void circleArea(double circle_radius) {
		double circle_area = Math.PI * (circle_radius * circle_radius);
		System.out.println("Area of circle:" + circle_area);
	}

	// Method to calculate the perimeter of a circle, doesn't return a value, i.e void
	public void circleCircumference(double circle_radius) {
		double circle_circumference = 2 * Math.PI * circle_radius;
		System.out.println("Circumference of circle:" + circle_circumference);
	}
	
    
}
