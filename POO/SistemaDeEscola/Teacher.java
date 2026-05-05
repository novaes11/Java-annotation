package POO.SistemaDeEscola;

public class Teacher extends Employee{
    protected String subject;
    protected Classroom classroom;
    protected String clasroomInfo;
    protected int countStudents;

    public Teacher(
            String name,
            int age,
            String email,
            String employeeId,
            double baseSalary,
            String department,
            String roleDescription
    ) {
        super(name, age, email, employeeId, baseSalary, department, roleDescription);
    }

    public void assignClassroom(Classroom classroom) {
        this.classroom = classroom;
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
    public Teacher setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public Teacher setClassroomInfo(String classroomInfo){
        this.clasroomInfo = classroomInfo;
        return this;
    }
    public Teacher setCountStudents(int countStudents){
        this.countStudents = countStudents;
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
    public String getRoleDescription(){
        return this.roleDescription;
    }
    public String getUniqueIdentifier(){
        return this.employeeId;
    }

    public String getClassroomInfo() {
        return clasroomInfo;
    }
    public int getCountStudents(){
        return countStudents;
    }

}