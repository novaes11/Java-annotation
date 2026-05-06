package src.POO.SistemaDeEscola;

/**
 * Representa um estudante, estendendo a classe Pessoa com informações acadêmicas.
 */
public class Student extends Person{
    String registrationNumber;
    String course;
    double[] grades;
    int year;
    int attendancePercentage;
    String roleDescription;

    /**
     * Construtor para um estudante com apenas o número de matrícula.
     * @param registrationNumber O número de matrícula do estudante.
     */
    public Student(String registrationNumber){
        super(null, 0, null);
        if (registrationNumber == null || registrationNumber.trim().isEmpty()) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or empty.");
        this.registrationNumber = registrationNumber;
    }

    /**
     * Construtor para um estudante com número de matrícula e curso.
     * @param registrationNumber O número de matrícula.
     * @param course O curso do estudante.
     */
    public Student(String registrationNumber, String course){
        super(null, 0, null);
        if (registrationNumber == null || registrationNumber.trim().isEmpty()) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or empty.");
        if (course == null || course.trim().isEmpty()) throw new IllegalArgumentException("Invalid course! Course can't be null or empty.");
        this.registrationNumber = registrationNumber;
        this.course = course;
    }

    /**
     * Construtor completo para um estudante.
     * @param name O nome do estudante.
     * @param age A idade do estudante.
     * @param email O e-mail do estudante.
     * @param registrationNumber O número de matrícula.
     * @param course O curso do estudante.
     */
    public Student(String name, int age, String email, String registrationNumber, String course){
        super(name, age, email);
        if (registrationNumber == null || registrationNumber.trim().isEmpty()) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or empty.");
        if (course == null || course.trim().isEmpty()) throw new IllegalArgumentException("Invalid course! Course can't be null or empty.");
        this.registrationNumber = registrationNumber;
        this.course = course;
    }

    // Setters
    @Override
    public Student setName(String name){
        if (name == null || name.trim().isEmpty()) throw new IllegalArgumentException("Invalid name! Name can't be null or empty.");
        this.name = name;
        return this;
    }

    @Override
    public Student setAge(int age){
        if (age < 0 || age > 120) throw new IllegalArgumentException("Invalid age! Age can't be negative or bigger then 120.");
        this.age = age;
        return this;
    }

    @Override
    public Student setEmail(String email){
        if (email == null || email.trim().isEmpty()) throw new IllegalArgumentException("Invalid email! Email can't be null or empty.");
        this.email = email;
        return this;
    }

    public Student setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.trim().isEmpty()) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or empty.");
        this.registrationNumber = registrationNumber;
        return this;
    }

    public Student setCourse(String course) {
        if (course == null || course.trim().isEmpty()) throw new IllegalArgumentException("Invalid course! Course can't be null or empty.");
        this.course = course;
        return this;
    }

    public Student setGrades(double[] grades) {
        this.grades = grades;
        return this;
    }

    public Student setYear(int year) {
        this.year = year;
        return this;
    }

    public Student setAttendancePercentage(int attendancePercentage) {
        if (attendancePercentage >= 0 && attendancePercentage <= 100){
            this.attendancePercentage = attendancePercentage;
            return this;
        } else {
            throw new IllegalArgumentException("Invalid percentage. Enter a value between 0 and 100.");
        }
    }

    public Student setRoleDescription(String roleDescription){
        this.roleDescription = roleDescription;
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

    public String getCourse() {
        return this.course;
    }

    public double[] getGrades() {
        return this.grades;
    }

    public int getYear() {
        return this.year;
    }

    public int getAttendancePercentage() {
        return this.attendancePercentage;
    }

    @Override
    public String getUniqueIdentifier(){
        return this.registrationNumber;
    }

    /**
     * Calcula a média das notas do estudante.
     * @return A média das notas.
     */
    public double calculateAverageGrade() {
        if (grades == null || grades.length == 0) return 0.0;
        double sum = 0;
        for (double grade : grades) {
            sum += grade;
        }
        return sum / grades.length;
    }

    /**
     * Verifica se o estudante foi aprovado com base na média.
     * @return true se a média for maior ou igual a 6.0.
     */
    public boolean hasPassed(){
        return calculateAverageGrade() >= 6.0;
    }

    /**
     * Verifica se o estudante tem a frequência mínima necessária.
     * @return true se a frequência for maior ou igual a 75%.
     */
    public boolean hasMinimumAttendance(){
        return attendancePercentage >= 75;
    }

    /**
     * Gera as iniciais do nome do estudante.
     * @return As iniciais em maiúsculas.
     */
    public String getInicials(){
        if (getName() == null || getName().isBlank()) {
            return "";
        }
        String[] parts = getName().trim().split("\\s+");
        StringBuilder initials = new StringBuilder();
        for (String p : parts) {
            if (!p.isEmpty()) {
                initials.append(Character.toUpperCase(p.charAt(0)));
            }
        }
        return initials.toString();
    }

    /**
     * Formata o e-mail para minúsculas e sem espaços.
     * @return O e-mail formatado.
     */
    public String getFormattedEmail(){
        return this.email != null ? this.email.toLowerCase().replace(" ", "") : "";
    }

    /**
     * Gera um relatório completo sobre o status acadêmico do estudante.
     * @return Uma string com o status (aprovado/reprovado) e detalhes.
     */
    public String getAcademicStatus(){
        if(hasPassed() && hasMinimumAttendance()){
            return String.format("Registration number: %s\nInitials: %s\nCourse: %s\nYear: %d\nSituation: Approved",
                    getUniqueIdentifier(), getInicials(), getCourse(), getYear());
        } else {
            String reason = "";
            if (!hasPassed() && !hasMinimumAttendance()) {
                reason = "Minimum attendance and average grade not reached";
            } else if (!hasPassed()) {
                reason = "Minimum average grade not reached";
            } else {
                reason = "Minimum attendance not reached";
            }
            return String.format("\nRegistration number: %s\nInitials: %s\nCourse: %s\nYear: %d\nSituation: Reproved\nReason: %s\nContact: %s\nWarning: %s",
                    getUniqueIdentifier(), getInicials(), getCourse(), getYear(), reason, getFormattedEmail(), getRoleDescription());
        }
    }
}
