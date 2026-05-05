package POO.SistemaDeEscola;

public class Employee extends Person{
    protected String employeeId;
    protected double baseSalary;
    protected String department;
    protected String roleDescription;

    public Employee(
            String name,
            int age,
            String email
    ){
        super(name, age, email);
    }

    public Employee(String name, int age, String email, String employeeId, double baseSalary, String department, String roleDescription) {
        super(name, age, email);
        this.employeeId = employeeId;
        this.baseSalary = baseSalary;
        this.department = department;
        this.roleDescription = roleDescription;
    }

    //  Setters
    public Person setName(String name){
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

    //  Getters
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
    public String getEmployeeDetail(){
            return "\nEmployee name: " + getName() +
                    "\nIdentifier: " + getUniqueIdentifier() +
                    "\nAge: " + getAge() +
                    "\nEmail: " + getEmail() +
                    "\nSalary: " + getBaseSalary() +
                    "\nDepartiment: "+ getDepartmentInfo();

    }
}