package POO.ClubeDeFutebol.SistemaDeEscola;

import java.util.ArrayList;
import java.util.List;

public class Classroom {
    String className;
    Teacher teacher;
    List <Student> students = new ArrayList<>();

    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student){
        this.students.add(student);
    }
    public void removeStudent(Student student){
        this.students.remove(student);
    }
    public List<Student> getAllStudents(){
        return this.students;
    }
    public int getClassroomSize(){
        return this.students.size();
    }
    public String getClassDetails(){
        System.out.println("Class name: "+ getClassName() +
                "\nClass teacher: "+ getTeacher().name +
                "\nAll Students: ");
        for (Student s : students) {
            System.out.println("- "+ s.getName());

        }
        System.out.println("Class size: "+ getClassroomSize());
        return " ";
    }

    //    Setters
    public Classroom setClassName(String className) {
        this.className = className;
        return this;
    }
    public Classroom setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }


    //  Getters
    public Teacher getTeacher() {
        return this.teacher;
    }
    public String getClassName() {
        return this.className;
    }
}