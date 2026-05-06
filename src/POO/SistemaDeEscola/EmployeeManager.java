package src.POO.SistemaDeEscola;

/**
 * Representa um gerente de funcionários, estendendo a classe Employee com
 * funcionalidades para calcular pagamentos, promover funcionários e gerar relatórios.
 */
public class EmployeeManager extends Employee {
    private double factorPayment = 2.5;

    /**
     * Construtor completo para um gerente de funcionários.
     *
     * @param name            O nome do gerente.
     * @param age             A idade do gerente.
     * @param email           O e-mail do gerente.
     * @param employeeId      O ID de funcionário.
     * @param baseSalary      O salário base.
     * @param department      O departamento.
     * @param roleDescription A descrição do cargo.
     */
    public EmployeeManager(String name, int age, String email, String employeeId, double baseSalary, String department, String roleDescription) {
        super(name, age, email, employeeId, baseSalary, department, roleDescription);
    }

    /**
     * Calcula o pagamento de um funcionário com base em um fator.
     *
     * @param employee O funcionário para o qual o pagamento será calculado.
     * @return O valor do pagamento calculado.
     */
    protected double calculatePayment(Employee employee){
        return this.factorPayment * employee.getBaseSalary();
    }

    /**
     * Promove um funcionário, aumentando seu salário base.
     *
     * @param employee       O funcionário a ser promovido.
     * @param salaryIncrease O valor do aumento salarial.
     */
    public void promoteEmployee(Employee employee, double salaryIncrease){
        employee.setBaseSalary(employee.getBaseSalary() + salaryIncrease);
    }

    /**
     * Gera um relatório detalhado para um funcionário específico.
     *
     * @param employee O funcionário sobre o qual o relatório será gerado.
     * @return Uma string contendo o relatório formatado.
     */
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
                "\n===========================\n";
    }

    // Setters
    @Override
    public EmployeeManager setName(String name){
        this.name = name;
        return this;
    }
    @Override
    public EmployeeManager setAge(int age){
        this.age = age;
        return this;
    }
    @Override
    public EmployeeManager setEmail(String email){
        this.email = email;
        return this;
    }
    @Override
    public EmployeeManager setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
        return this;
    }
    @Override
    public EmployeeManager setRoleDescription(String roleDescription) {
        this.roleDescription = roleDescription;
        return this;
    }
    @Override
    public EmployeeManager setDepartment(String department) {
        this.department = department;
        return this;
    }
    @Override
    public EmployeeManager setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
        return this;
    }

    // Getters
    @Override
    public String getName(){
        return this.name;
    }
    @Override
    public int getAge(){
        return this.age;
    }
    @Override
    public String getEmail(){
        return this.email;
    }
    @Override
    public double getBaseSalary(){
        return this.baseSalary;
    }
    @Override
    public String getRoleDescription(){
        return this.roleDescription;
    }
    @Override
    public String getUniqueIdentifier(){
        return this.employeeId;
    }
    @Override
    public String getDepartmentInfo(){
        return this.department;
    }
}
