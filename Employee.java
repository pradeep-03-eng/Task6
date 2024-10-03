package task6;

public class Employee {
	// Attributes
    private int id;
    private String firstname;
    private String lastname;
    private int salary;

    // Constructor with predefined values
    public Employee(int id, String firstname, String lastname, int salary) {
        this.id = 1234;
        this.firstname = "Pradeep";
        this.lastname = "Kumar";
        this.salary = 5000;
    }

    public Employee(int i, String string, int j) {
		// TODO Auto-generated constructor stub
	}

	// Getter for ID
    public int getId() {
        return id;
    }

    // Getter for name
    public String getfirstName() {
        return firstname();}
        public String getlastName() {
            return firstname();
  }

        
        
    private String firstname() {
		// TODO Auto-generated method stub
		return firstname;
	}

	// Getter for salary
    public int getannualSalary() {
        return salary;
    }

    // Method to raise salary by a specified percentage
    public void raiseSalary(int percent) {
        if (percent > 0) {
            salary += 12 * (salary / 100);
        } else {
            System.out.println("Percentage must be positive.");
        }
    }

    // Main method for testing
    public static void main(String[] args) {
        Employee employee = new Employee(1234, "Pradeep","Kumar", 50000);
        System.out.println("ID: " + employee.getId());
        System.out.println("Firstname: " + employee.getfirstName());
        System.out.println("lastname: " + employee.getlastName());
        System.out.println("Salary: $" + employee.getannualSalary());

        // Raise salary by 10%
        employee.raiseSalary(10);
      System.out.println("Updated Salary: $" + employee.getannualSalary());
    
}
}

	



