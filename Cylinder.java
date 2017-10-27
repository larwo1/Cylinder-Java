import java.lang.Math;
import java.util.Scanner;

// Create a child class cylinder, from the parent class cricle 
public class Cylinder extends Circle{
	
	// Method to calculate the volume of a cylinder, returns a value
	public double cylinderVolume(double cylinder_height, double cylinder_radius) {
		double cylinder_volume =  (Math.PI * (cylinder_radius * cylinder_radius)) * cylinder_height;
		return cylinder_volume;
	}
	
	// Method to calculate the surface area of a cylinder, returns a value
	public double cylinderSurfaceArea(double cylinder_height, double cylinder_radius) {
		double cylinder_surfaceArea = (2 * Math.PI * (cylinder_radius * cylinder_radius)) + 2*Math.PI * cylinder_radius * cylinder_height;
		return cylinder_surfaceArea;
	}
	
	
	public static void main(String[] args) {
		// Initalize objects scanner to get user input
		Scanner scan1 = new Scanner(System.in);	
		Scanner scan2 = new Scanner(System.in);
		Scanner scan3 = new Scanner(System.in);	
		Scanner scan4 = new Scanner(System.in);
		
		// Set variable ans2 to yes
		String ans2 = "yes";
		
		// Execute the code while ans2 is yes
		do {
		
			// Create a local variable
			double c1circumference;
						
			// Create a cylinder object (child class)
			Cylinder myCylinder = new Cylinder();
		
			// Create a circle object (parent class)
			Circle myCircle = new Circle();
	
			System.out.print("Enter the circle radius:");
			

			// Repeat until user enter for valid input
			while (!scan1.hasNextDouble()) {
				System.out.println("Invalid input");
				scan1.nextLine();
				System.out.print("Enter the circle radius:");
			}
			
			// Get user input for invalid number entry
			double circle_radius = scan1.nextDouble();

					
				// Make sure user enters a positive radius otherwise end program 
				if (circle_radius < 0) {
					System.out.println("Invalid input");
					break;
				}
				
				// Call circleArea method
				myCircle.circleArea(circle_radius);
				// Call circleCircumference
				myCircle.circleCircumference(circle_radius);	
		
			// Check for valid input
			try {
				System.out.print("Enter the cylinder raidus:");
				double cylinder_radius = scan2.nextDouble();
				
				// Make sure user enters a positive radius
				if (cylinder_radius < 0) {
					throw new IllegalArgumentException ("Invalid input");
				}
					
				System.out.print("Enter the cylinder height:");	
				double cylinder_height = scan3.nextDouble();	
				
				// Make sure user enters a positive height
				if (cylinder_height < 0) {
					throw new IllegalArgumentException ("Invalid input");
				}
	
			
				// Using cylinder class print out volume and surface area
				// Call cylinderVolume method
				myCylinder.cylinderVolume(cylinder_height, cylinder_radius);
				System.out.println("The volume of the cylinder is:" + myCylinder.cylinderVolume(cylinder_height, cylinder_radius));
			
				//call cylinderSurfaceArea method
				myCylinder.cylinderSurfaceArea(cylinder_height, cylinder_radius);
				System.out.println("The surface area of the cylinder is:" + myCylinder.cylinderSurfaceArea(cylinder_height, cylinder_radius));
			}
		
			// If there is an invalid input, print 
			catch(Exception e){
				System.out.println("Invalid input");
			}
		
			System.out.println("Would you like to try again?");
			ans2 = scan4.nextLine();
				
		} while (ans2.equals("yes") || ans2.equals("y"));
		
		System.out.println("Program is ended");
		
	}	
}
