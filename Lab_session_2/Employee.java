
class Employee {
    String empName;
    int empId;
    String dept;
    double salary;

    Employee(String empName, int empId, String dept, double salary) {
        this.empName = empName;
        this.empId = empId;
        this.dept = dept;
        this.salary = salary;
    }

    void display() {
        System.out.println("Employee Name: " + empName.toUpperCase());
        System.out.println("Employee ID: " + empId);
        System.out.println("Department: " + dept);
        System.out.println("Salary: " + salary);
        System.out.println("---------------------");
    }
}
