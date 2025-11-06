package SistemaDeEscola;

public class Student extends Person{
    String registrationNumber;
    String course;
    double[] grades;
    int year;
    int attendancePercentage;
    String roleDescription;

    public Student(String registrationNumber){
        if (registrationNumber == null || registrationNumber.trim().equals(" ")) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or equals 'null'.");
        super(null, 0, null);
        this.registrationNumber = registrationNumber;
    }

    public Student(String registrationNumber, String course){
        if (registrationNumber == null || registrationNumber.trim().equals(" ")) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or equals 'null'.");
        if (course == null || course.trim().equals(" ")) throw new IllegalArgumentException("Invalid course! Course can't be null or equals 'null'.");
        super(null, 0, null);
        this.registrationNumber = registrationNumber;
        this.course = course;
    }

    public Student(String name, int age, String email, String registrationNumber, String course){
        if (registrationNumber == null || registrationNumber.trim().equals(" ")) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or equals 'null'.");
        if (course == null || course.trim().equals(" ")) throw new IllegalArgumentException("Invalid course! Course can't be null or equals 'null'.");
        super(name, age, email);
        this.registrationNumber = registrationNumber;
        this.course = course;
    }

    // setters
    @Override
    public Person setName(String name){
        if (name == null || name.trim().equals(" ")) throw new IllegalArgumentException("Invalid name! Name can't be null or equals 'null'.");
        this.name = name;
        return this;
    }

    @Override
    public Person setAge(int age){
        if (age < 0 || age > 120) throw new IllegalArgumentException("Invalid age! Age can't be negative or bigger then 120.");
        this.age = age;
        return this;
    }

    @Override
    public Person setEmail(String email){
        if (email == null || email.trim().equals(" ")) throw new IllegalArgumentException("Invalid email! Email can't be null or equals 'null'.");
        this.email = email;
        return this;
    }

    public Student setRegistrationNumber(String registrationNumber) {
        if (registrationNumber == null || registrationNumber.trim().equals(" ")) throw new IllegalArgumentException("Invalid registration number! Registration number can't be null or equals 'null'.");
        this.registrationNumber = registrationNumber;
        return this;
    }

    public Student setCourse(String course) {
        if (course == null || course.trim().equals(" ")) throw new IllegalArgumentException("Invalid course! Course can't be null or equals 'null'.");
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
        if (attendancePercentage >= 0 && attendancePercentage <=100){
            this.attendancePercentage = attendancePercentage;
            return this;
        }else {
            throw new IllegalArgumentException("Numero Invalido. Insira um valor maior/igual a 0 e menor/igual a 100.");
        }

    }
    public Student setRoleDescription(String roleDescription){
        this.roleDescription = roleDescription;
        return this;
    }

    // getters
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

    public String getUniqueIdentifier(){
        return this.registrationNumber;
    }

    public double calculateAverageGrade() {
        return (grades[0] + grades[1])/2;
    }

    public boolean hasPassed(){
        return calculateAverageGrade() >= 6.0;
    }

    public boolean hasMinimumAttendance(){
        return attendancePercentage >= 75;
    }


    public String getInicials(){
        if (getName() == null || getName().isBlank()) {
            return "";
        }

        String[] parts = getName().trim().split("\\s+"); // divide por 1 ou + espaços
        StringBuilder initials = new StringBuilder();

        for (String p : parts) {
            initials.append(Character.toUpperCase(p.charAt(0)));
        }

        return initials.toString();
    }

    public String getFormattedEmail(){
        return this.email.toLowerCase().replace(" ", "");
    }

    public String getAcademicStatus(){
        if(hasPassed() && hasMinimumAttendance()){
            return "Registration number: "+ getUniqueIdentifier() + "\nInicials: "+ getInicials() + "\nCourse: "+ getCourse() +"\nYear: "+ getYear() + "\nSituation: Approved";
        }else {
            if (!hasPassed() && !hasMinimumAttendance()){
                return "\nRegistration number: "+ getUniqueIdentifier() + "\nInicials: "+ getInicials() +"\nCourse: "+ getCourse() +"\nYear: "+ getYear() + "\nSituation: Reproved\nReason: Minimum attendance and average grade not reached\n" + "Contact: " + getFormattedEmail()+ "\nWarning: " + getRoleDescription();
            }else if(!hasPassed()){
                return "\nRegistration number: "+ getUniqueIdentifier() + "\nInicials: "+ getInicials() + "\nCourse: "+ getCourse()  +"\nYear: "+ getYear() + "\nSituation: Reproved\nReason: Minimum average grade not reached\n" + "Contact: " + getFormattedEmail()+ "\nWarning: " + getRoleDescription();
            }else {
                return "\nRegistration number: "+ getUniqueIdentifier() + "\nInicials: "+ getInicials() + "\nCourse: "+ getCourse()  +"\nYear: "+ getYear() + "\nSituation: Reproved\nReason: Minimum attendance not reached\n" + "Contact: " + getFormattedEmail()+ "\nWarning: " + getRoleDescription();
            }
        }
    }
}
