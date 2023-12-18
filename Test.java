public class Test {
    public static void main(String[] args) {

        Employee emp = new Employee();
        emp.setFirstName("Richell");
        emp.setLastName("Bonfield");
        emp.setEmployeeID(1);
        emp.employeeSummary();

        System.out.println("\n");

        Manager ceo = new Manager();
        ceo.setFirstName("Shaquille");
        ceo.setLastName("Blackwood");
        ceo.setEmployeeID(2);
        ceo.setDepartment("Management");
        ceo.employeeSummary();


    }
}