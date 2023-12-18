public class Manager extends Employee {

    // Manager specific attibute
    String department;

    
    // Constructor method
    public Manager() { }


    // setter methods
    public void setDepartment(String departmentName) {
        this.department = departmentName;
    }


    // getter methods
    public String getDepartment() {
        return department;
    }


    // employeeSummary method override - Prints all Employee and Manager attributes
    public void employeeSummary() {
        System.out.println("Manager's Name: " + firstName + " " + lastName);
        System.out.println("Manager's ID #: " + employeeID);
        System.out.println("Manager's Salary: " + salary);
        System.out.println("Manager's department: " + department);
    }

}
