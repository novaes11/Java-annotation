package POO.SistemaDeEscola;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int counter = 0;
        double[] grades1 = {7.5, 8.0};
        double[] grades2 = {9.0, 8.5};
        double[] grades3 = {6.0, 5.5};
        double[] grades4 = {8.0, 7.5};
        double[] grades5 = {5.5, 6.0};
        double[] grades6 = {7.0, 7.5};
        double[] grades7 = {9.0, 8.5};
        double[] grades8 = {6.5, 7.0};
        double[] grades9 = {8.5, 9.0};
        double[] grades10 = {7.0, 6.5};
        double[] grades11 = {5.0, 5.5};
        double[] grades12 = {8.0, 8.5};
        double[] grades13 = {8, 8};
        double[] grades14 = {7, 7};
        double[] grades15 ={5, 5};

        System.out.println("==============================\nPeixinho Dourado School Data\n==============================");

        Student st1 = new Student(
                "Ana Clara",
                18,
                "ana.clara@gmail.com",
                "251041001",
                "Ciencias da Comp.")
                .setYear(1)
                .setAttendancePercentage(80)
                .setGrades(grades1)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st2 = new Student(
                "Bruno Silva",
                20,
                "bruno.silva@gmail.com",
                "251041002",
                "Engenharia")
                .setYear(2)
                .setAttendancePercentage(90)
                .setGrades(grades2)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st3 = new Student(
                "João Novaes",
                19,
                "jvn.novaes@gmail.com",
                "251041070",
                "Ciencias da Comp.")
                .setYear(1)
                .setAttendancePercentage(55)
                .setGrades(grades3)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st4 = new Student(
                "Carla Mendes",
                21,
                "carla.mendes@gmail.com",
                "251041004",
                "Matematica")
                .setYear(3)
                .setAttendancePercentage(75)
                .setGrades(grades4)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st5 = new Student(
                "Pedro Costa",
                22, "pedro.costa@gmail.com",
                "251041005",
                "Fisica")
                .setYear(4)
                .setAttendancePercentage(60)
                .setGrades(grades5)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st6 = new Student("Laura Almeida",
                19,
                "laura.almeida@gmail.com",
                "251041006",
                "Quimica")
                .setYear(1)
                .setAttendancePercentage(85)
                .setGrades(grades6)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st7 = new Student(
                "Rafael Santos",
                20,
                "rafael.santos@gmail.com",
                "251041007", "Biologia")
                .setYear(2)
                .setAttendancePercentage(95)
                .setGrades(grades7)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st8 = new Student(
                "Mariana Lima",
                18, "mariana.lima@gmail.com",
                "251041008",
                "Ciencias da Comp.")
                .setYear(1)
                .setAttendancePercentage(70)
                .setGrades(grades8)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st9 = new Student(
                "Felipe Rodrigues",
                21,
                "felipe.rodrigues@gmail.com",
                "251041009",
                "Engenharia")
                .setYear(3)
                .setAttendancePercentage(88)
                .setGrades(grades9)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st10 = new Student(
                "Isabela Ferreira",
                19,
                "isabela.ferreira@gmail.com",
                "251041010",
                "Matematica")
                .setYear(1)
                .setAttendancePercentage(65)
                .setGrades(grades10)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st11 = new Student(
                "Lucas Martins",
                22,
                "lucas.martins@gmail.com",
                "251041011",
                "Fisica")
                .setYear(4)
                .setAttendancePercentage(55)
                .setGrades(grades11)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st12 = new Student(
                "Giovana Pereira",
                20,
                "giovana.pereira@gmail.com",
                "251041012",
                "Quimica")
                .setYear(2)
                .setAttendancePercentage(90)
                .setGrades(grades12)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st13 = new Student(
                "251041080"
        )
                .setCourse("Ciencias Sociais")
                .setYear(2)
                .setAttendancePercentage(75)
                .setRegistrationNumber("251041080")
                .setGrades(grades13)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st14 = new Student(
                "251041090",
                "Arquitetura"
        )
                .setYear(3)
                .setAttendancePercentage(80)
                .setGrades(grades14)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Student st15 = new Student(
                "João Novaes",
                19,
                "jvn.novaes@gmail.com",
                "251041070",
                "Ciencias da Comp."
        )
                .setYear(1)
                .setAttendancePercentage(55)
                .setGrades(grades15)
                .setRoleDescription("The student is responsible for studying, attending classes, and completing academic activities.");

        Classroom c1 = new Classroom(
                "Computer Science 101"
        )
                .setClassName("Computer Science Class");

        Classroom c2 = new Classroom(
                "Applied Mathematics 201"
        )
                .setClassName("Mathematics Class");;

        Classroom c3 = new Classroom(
                "Quantum Mechanics 301"
        )
                .setClassName("Physics Class");;

        Classroom c4 = new Classroom(
                "Mechanical Engineering 101"
        )
                .setClassName("Engineering");;

        Classroom c5 = new Classroom(
                "Molecular Biology 202"
        )
                .setClassName("Biology");;

        Classroom c6 = new Classroom(
                "Modern History 101"
        )
                .setClassName("History Class");;

        Classroom c7 = new Classroom(
                "English Literature 303"
        )
                .setClassName("Literature Class");;

        Classroom c8 = new Classroom(
                "Ethics and Philosophy 404"
        )
                .setClassName("Philosophy Class");;

        Teacher t1 = new Teacher(
                "Alice Johnson",
                35,
                "alice.johnson@university.com",
                "EMP1001",
                4800.00,
                "Computer Science",
                "Lecturer in Software Engineering"
        )
                .setSubject("Software Engineering")
                .setClassroomInfo("Class CS101 - Software Engineering, taught by Alice Johnson, with 30 students.")
                .setCountStudents(15);

        Teacher t2 = new Teacher(
                "Michael Brown",
                45,
                "michael.brown@university.com",
                "EMP1002",
                5500.00,
                "Mathematics",
                "Senior Lecturer in Applied Mathematics"
        )
                .setSubject("Mathematics")
                .setClassroomInfo("Class MATH201 - Mathematics, taught by Michael Brown, with 28 students.")
                .setCountStudents(15);

        Teacher t3 = new Teacher(
                "Sophia Davis",
                40,
                "sophia.davis@university.com",
                "EMP1003",
                5200.00,
                "Physics",
                "Professor of Quantum Mechanics"
        )
                .setSubject("Quantum Mechanics")
                .setClassroomInfo("Class PHY301 - Quantum Mechanics, taught by Sophia Davis, with 15 students.")
                .setCountStudents(15);

        Teacher t4 = new Teacher(
                "Daniel Smith",
                50,
                "daniel.smith@university.com",
                "EMP1004",
                6000.00,
                "Engineering",
                "Associate Professor in Mechanical Engineering"
        )
                .setSubject("Mechanical Engineering")
                .setClassroomInfo("Class ENGR401 - Mechanical Engineering, taught by Daniel Smith, with 23 students.")
                .setCountStudents(15);

        Teacher t5 = new Teacher(
                "Emma Wilson",
                38,
                "emma.wilson@university.com",
                "EMP1005",
                4900.00,
                "Biology",
                "Lecturer in Molecular Biology"
        )
                .setSubject("Molecular Biology")
                .setClassroomInfo("Class BIO501 - Molecular Biology, taught by Emma Wilson, with 27 students.")
                .setCountStudents(15);

        Teacher t6 = new Teacher(
                "James Miller",
                42,
                "james.miller@university.com",
                "EMP1006",
                5300.00,
                "History",
                "Senior Lecturer in Modern History"
        )
                .setSubject("Modern History")
                .setClassroomInfo("Class HIST601 - Modern History, taught by James Miller, with 32 students.")
                .setCountStudents(15);

        Teacher t7 = new Teacher(
                "Olivia Taylor",
                36,
                "olivia.taylor@university.com",
                "EMP1007",
                5000.00,
                "Literature",
                "Lecturer in English Literature"
        )
                .setSubject("English Literature")
                .setClassroomInfo("Class LIT701 - English Literature, taught by Olivia Taylor, with 27 students.")
                .setCountStudents(15);

        Teacher t8 = new Teacher(
                "William Anderson",
                55,
                "william.anderson@university.com",
                "EMP1008",
                6200.00,
                "Philosophy",
                "Professor of Ethics"
        )
                .setSubject("Ethics")
                .setClassroomInfo("Class PHIL801 - Ethics, taught by William Anderson, with 25 students.")
                .setCountStudents(15);

        Employee emp1 = new Employee(
                "Lucas Ferreira",
                29,
                "lucas.ferreira@university.com"
        )
                .setEmployeeId("EMP2001")
                .setBaseSalary(1500.00)
                .setDepartment("Administration")
                .setRoleDescription("Administrative Assistant");

        EmployeeManager em1 = new EmployeeManager(
                "Carlos Andrade",
                45,
                "carlos.andrade@university.com",
                "EMp3001",
                6500.00,
                "Human Resources",
                "HR Manager"
        );


        Student[] students = {st1, st2, st3, st4, st5, st6, st7, st8, st9, st10, st11, st12, st13, st14, st15};

        c1.setTeacher(t1);
        c2.setTeacher(t2);
        c3.setTeacher(t3);
        c4.setTeacher(t4);
        c5.setTeacher(t5);
        c6.setTeacher(t6);
        c7.setTeacher(t7);
        c8.setTeacher(t8);

//      Setting first student remaining data
        st13.setName("Maria Silva");
        st13.setEmail("maria.silva@gmail.com");
        st13.setAge(16);

//      Setting second student remaining data
        st14.setName("Alberto Pinto");
        st14.setEmail("alberto.pinto@gmail.com");
        st14.setAge(13);



        System.out.println("Registered Students:");
        System.out.println("1. "+ st1.getName());
        System.out.println("Email: "+ st1.getEmail());
        System.out.println("Age: "+ st1.getAge());
        System.out.println("Registration number: "+ st1.getUniqueIdentifier()+ "\n");

        System.out.println("2. "+ st2.getName());
        System.out.println("Email: "+ st2.getEmail());
        System.out.println("Age: "+ st2.getAge());
        System.out.println("Registration number: "+ st2.getUniqueIdentifier()+ "\n");

//      Setting remaining data from third student
        System.out.println("3. "+ st3.getName());
        System.out.println("Email: "+ st3.getEmail());
        System.out.println("Age: "+ st3.getAge());
        System.out.println("Registration number: "+ st3.getUniqueIdentifier()+ "\n");

        System.out.println("\n=====Grades/Attendance Sheet=====");
        System.out.println("Registration number: "+ st1.getUniqueIdentifier());
        System.out.println("Grades: "+ Arrays.toString(st1.getGrades()));
        System.out.println("Attendance percentage: "+ st1.getAttendancePercentage() + "%\n");

        System.out.println("Registration number: "+ st2.getUniqueIdentifier());
        System.out.println("Grades: "+ Arrays.toString(st2.getGrades()));
        System.out.println("Attendance percentage: "+ st2.getAttendancePercentage() + "%\n");

        System.out.println("Registration number: "+ st3.getUniqueIdentifier());
        System.out.println("Grades: "+ Arrays.toString(st3.getGrades()));
        System.out.println("Attendance percentage: "+ st3.getAttendancePercentage() + "%\n");

        System.out.println("\n=====ACADEMIC STATUS=====");
        String message = st1.getAcademicStatus();
        System.out.println(message);
        message = st2.getAcademicStatus();
        System.out.println(message);
        message = st3.getAcademicStatus();
        System.out.println(message);

        System.out.println("\n====CLASS DETAILS====\n");

        for (Student s : students) {
            c1.addStudent(s);
        }
        message = c1.getTeacher().getClassroomInfo();
        System.out.println(message);
        String classdetail = c1.getClassDetails();
        System.out.println(classdetail);

        for (Student s : students) {
            c2.addStudent(s);
        }
        message = c2.getTeacher().getClassroomInfo();
        System.out.println(message);
        classdetail = c2.getClassDetails();
        System.out.println(classdetail);

        for (Student s : students) {
            c3.addStudent(s);
        }
        message = c3.getTeacher().getClassroomInfo();
        System.out.println(message);
        classdetail = c3.getClassDetails();
        System.out.println(classdetail);

        for (Student s : students) {
            c4.addStudent(s);
        }
        message = c4.getTeacher().getClassroomInfo();
        System.out.println(message);
        classdetail = c4.getClassDetails();
        System.out.println(classdetail);

        for (Student s : students) {
            c5.addStudent(s);
        }
        message = c5.getTeacher().getClassroomInfo();
        System.out.println(message);
        classdetail = c5.getClassDetails();
        System.out.println(classdetail);

        for (Student s : students) {
            c6.addStudent(s);
        }
        message = c6.getTeacher().getClassroomInfo();
        System.out.println(message);
        classdetail = c6.getClassDetails();
        System.out.println(classdetail);

        for (Student s : students) {
            c7.addStudent(s);
        }
        message = c7.getTeacher().getClassroomInfo();
        System.out.println(message);
        classdetail = c7.getClassDetails();
        System.out.println(classdetail);

        for (Student s : students) {
            c8.addStudent(s);
        }
        message = c8.getTeacher().getClassroomInfo();
        System.out.println(message);
        classdetail = c8.getClassDetails();
        System.out.println(classdetail);


        System.out.println("\n====REGISTERED EMPLOYEES====");
        String employeeDetail = emp1.getEmployeeDetail();
        System.out.println(employeeDetail);


        employeeDetail = t1.getEmployeeDetail();
        System.out.println(employeeDetail);
        int number = t1.getCountStudents();
        System.out.println("Number of students: "+ number);

        employeeDetail = t2.getEmployeeDetail();
        System.out.println(employeeDetail);
        number = t2.getCountStudents();
        System.out.println("Number of students: "+ number);

        employeeDetail = t3.getEmployeeDetail();
        System.out.println(employeeDetail);
        number = t3.getCountStudents();
        System.out.println("Number of students: "+ number);

        employeeDetail = t4.getEmployeeDetail();
        System.out.println(employeeDetail);
        number = t4.getCountStudents();
        System.out.println("Number of students: "+ number);

        employeeDetail = t5.getEmployeeDetail();
        System.out.println(employeeDetail);
        number = t5.getCountStudents();
        System.out.println("Number of students: "+ number);

        employeeDetail = t6.getEmployeeDetail();
        System.out.println(employeeDetail);
        number = t6.getCountStudents();
        System.out.println("Number of students: "+ number);

        employeeDetail = t7.getEmployeeDetail();
        System.out.println(employeeDetail);
        number = t7.getCountStudents();
        System.out.println("Number of students: "+ number);

        employeeDetail = t8.getEmployeeDetail();
        System.out.println(employeeDetail);
        number = t8.getCountStudents();
        System.out.println("Number of students: "+ number);


        System.out.println("\n=======SALARY INCREASE=======");
        double newSalary = em1.calculatePayment(emp1);
        em1.promoteEmployee(emp1, t1.getBaseSalary());
        System.out.println(em1.getName() + "\nActual payment: R$"+ newSalary + "\nNew Salary: R$" + emp1.getBaseSalary() + "\nFunction: "+ emp1.getDepartmentInfo());

        message = em1.generateEmployeeReport(t5);
        System.out.println(message);


    }

}