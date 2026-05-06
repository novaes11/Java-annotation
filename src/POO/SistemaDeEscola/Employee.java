package src.POO.SistemaDeEscola;

/**
 * Representa um funcionário da escola, estendendo a classe Pessoa com
 * informações sobre ID, salário, departamento e cargo.
 */
public class Employee extends Person{
    protected String employeeId;
    protected double baseSalary;
    protected String department;
    protected String roleDescription;

    /**
     * Construtor para um funcionário com informações básicas.
     *
     * @param name  O nome do funcionário.
     * @param age   A idade do funcionário.
     * @param email O e-mail do funcionário.
     */
    public Employee(
            String name,
            int age,
            String email
    ){
        super(name, age, email);
    }

    /**
     * Construtor completo para um funcionário.
     *
     * @param name            O nome do funcionário.
     * @param age             A idade do funcionário.
     * @param email           O e-mail do funcionário.
     * @param employeeId      O ID de funcionário.
     * @param baseSalary      O salário base.
     * @param department      O departamento.
     * @param roleDescription A descrição do cargo.
     */
    public Employee(String name, int age, String email, String employeeId, double baseSalary, String department, String roleDescription) {
        super(name, age, email);
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.department = department;
        this.roleDescription = roleDescription;
    }

    // Setters
    @Override
    public Employee setName(String name){
        this.name = name;
        return this;
    }
    @Override
    public Employee setAge(int age){
        this.age = age;
        return this;
    }
    @Override
    public Employee setEmail(String email){
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
    public String getDepartmentInfo(){
        return this.department;
    }

    /**
     * Gera um relatório detalhado sobre o funcionário.
     *
     * @return Uma string com os detalhes do funcionário.
     */
    public String getEmployeeDetail(){
        return "\nEmployee name: " + getName() +
                "\nIdentifier: " + getUniqueIdentifier() +
                "\nAge: " + getAge() +
                "\nEmail: " + getEmail() +
                "\nSalary: " + getBaseSalary() +
                "\nDepartiment: "+ getDepartmentInfo();
    }
}
