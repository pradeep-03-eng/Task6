package task6;

public class Circleclass {
	 // Data member
    private double radius;

    // No-argument constructor
    public Circleclass() {
        this.radius = 3.0; 
    }

    // Constructor with radius as an argument
    public Circleclass(double radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    // Getter for radius 
    public double getRadius() {
        return radius;
    }

    // Main method for testing
    public static void main(String[] args) {
        
    	// Using no-argument constructor
        Circleclass defaultCircle = new Circleclass();
        System.out.println("Default Circle Radius: " + defaultCircle.getRadius());
        System.out.println("Circumference: " + defaultCircle.calculateCircumference());

        // Using constructor with radius
        Circleclass customCircle = new Circleclass(5.0);
        System.out.println(" Circle Radius: " + customCircle.getRadius());
        System.out.println("Circumference: " + customCircle.calculateCircumference());
        Circleclass customCircle1 = new Circleclass(9.0);
        System.out.println("My Circle Radius: " + customCircle1.getRadius());
        System.out.println("My Circumference: " + customCircle1.calculateCircumference());
    }
}

