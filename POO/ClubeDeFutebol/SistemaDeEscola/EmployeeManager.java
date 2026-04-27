package SistemaDeEscola;

public class EmployeeManager extends Employee {
    private double factorPayment = 2.5;

    public EmployeeManager(String name, int age, String email, String employeeId, double baseSalary, String department, String roleDescription) {
        super(name, age, email, employeeId, baseSalary, department, roleDescription);
    }

    protected double calculatePayment(Employee employee){
        return this.factorPayment * employee.getBaseSalary();
    }
    public void promoteEmployee(Employee employee, double salaryIncrease){
        employee.setBaseSalary(employee.getBaseSalary() + salaryIncrease);
    }
    public String generateEmployeeReport(Employee employee){
        return "\n===== Employee Report =====\n" +
                "Name: " + employee.getName() + "\n" +
                "Age: " + employee.getAge() + "\n" +
                "Email: " + employee.getEmail() + "\n" +
                "Employee ID: " + employee.getUniqueIdentifier() + "\n" +
                "Department: " + employee.getDepartmentInfo() + "\n" +
                "Role: " + employee.getRoleDescription() + "\n" +
                "Base Salary: $" + employee.getBaseSalary() + "\n" +
                "Reason: Fist time at Peixinho Dourado School" +
                "===========================\n";
    }public Person setName(String name){
        this.name = name;
        return this;
    }
    public Person setAge(int age){
        this.age = age;
        return this;
    }
    public Person setEmail(String email){
        this.email = email;
        return this;
    }

    public Employee setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }

    public Employee setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
        return this;
    }

    public Employee setDepartment(String department) {
        this.department = department;
        return this;
    }

    public Employee setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
        return this;
    }
    public String getName(){
        return this.name;
    }
    public int getAge(){
        return this.age;
    }
    public String getEmail(){
        return this.email;
    }
    public double getBaseSalary(){
        return this.baseSalary;
    }
    public String getRoleDescription(){
        return this.roleDescription;
    }
    public String getUniqueIdentifier(){
        return this.employeeId;
    }
    public String getDepartmentInfo(){
        return this.department;
    }
}