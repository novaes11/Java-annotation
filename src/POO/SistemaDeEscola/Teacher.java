package src.POO.SistemaDeEscola;

/**
 * Representa um professor, estendendo a classe Employee com informações
 * específicas sobre a disciplina e a turma que leciona.
 */
public class Teacher extends Employee{
    protected String subject;
    protected Classroom classroom;
    protected String clasroomInfo;
    protected int countStudents;

    /**
     * Construtor completo para um professor.
     *
     * @param name            O nome do professor.
     * @param age             A idade do professor.
     * @param email           O e-mail do professor.
     * @param employeeId      O ID de funcionário.
     * @param baseSalary      O salário base.
     * @param department      O departamento ao qual o professor pertence.
     * @param roleDescription A descrição do cargo.
     */
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

    /**
     * Associa uma turma a este professor.
     *
     * @param classroom A turma a ser associada.
     */
    public void assignClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    // Setters
    @Override
    public Teacher setName(String name){
        this.name = name;
        return this;
    }
    @Override
    public Teacher setAge(int age){
        this.age = age;
        return this;
    }
    @Override
    public Teacher setEmail(String email){
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
    public String getRoleDescription(){
        return this.roleDescription;
    }
    @Override
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
