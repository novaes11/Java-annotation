package src.POO.SistemaDeEscola;

import java.util.ArrayList;
import java.util.List;

/**
 * Representa uma sala de aula, contendo um professor e uma lista de alunos.
 */
public class Classroom {
    String className;
    Teacher teacher;
    List <Student> students;

    /**
     * Construtor que cria uma sala de aula com um nome específico.
     *
     * @param className O nome da sala de aula.
     */
    public Classroom(String className) {
        this.className = className;
        this.students = new ArrayList<>();
    }

    /**
     * Adiciona um aluno à lista da sala de aula.
     *
     * @param student O aluno a ser adicionado.
     */
    public void addStudent(Student student){
        this.students.add(student);
    }

    /**
     * Remove um aluno da lista da sala de aula.
     *
     * @param student O aluno a ser removido.
     */
    public void removeStudent(Student student){
        this.students.remove(student);
    }

    /**
     * Retorna a lista de todos os alunos na sala de aula.
     *
     * @return A lista de alunos.
     */
    public List<Student> getAllStudents(){
        return this.students;
    }

    /**
     * Retorna o número de alunos na sala de aula.
     *
     * @return O tamanho da turma.
     */
    public int getClassroomSize(){
        return this.students.size();
    }

    /**
     * Imprime os detalhes da sala de aula, incluindo o nome, professor e lista de alunos.
     *
     * @return Uma string vazia (a impressão é feita no console).
     */
    public String getClassDetails(){
        StringBuilder details = new StringBuilder();
        details.append("Class name: ").append(getClassName()).append("\n");
        if (getTeacher() != null) {
            details.append("Class teacher: ").append(getTeacher().getName()).append("\n");
        }
        details.append("All Students: \n");
        for (Student s : students) {
            details.append("- ").append(s.getName()).append("\n");
        }
        details.append("Class size: ").append(getClassroomSize()).append("\n");
        System.out.println(details);
        return " ";
    }

    // Setters
    public Classroom setClassName(String className) {
        this.className = className;
        return this;
    }
    public Classroom setTeacher(Teacher teacher) {
        this.teacher = teacher;
        return this;
    }

    // Getters
    public Teacher getTeacher() {
        return this.teacher;
    }
    public String getClassName() {
        return this.className;
    }
}
