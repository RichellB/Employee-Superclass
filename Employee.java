public class Employee {
    
    String firstName;
    String lastName;
    int employeeID;
    double salary;


    // Constructor method
    public Employee() {
        salary = 0;
    }


    // Setter methods
    public void setFirstName(String name){
        this.firstName = name;
    }

    public void setLastName(String name) {
        this.lastName = name;
    }

    public void setEmployeeID(int ID) {
        this.employeeID = ID;
    }


    // Getter methods
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getID() {
        return employeeID;
    }


    // Method to display employee information
    public void employeeSummary() {
        System.out.println("Employee's Name: " + firstName + " " + lastName);
        System.out.println("Employee's ID #: " + employeeID);
        System.out.println("Employee's Salary: " + salary);
    }

}