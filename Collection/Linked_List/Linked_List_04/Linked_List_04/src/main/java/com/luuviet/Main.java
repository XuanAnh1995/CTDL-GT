package com.luuviet;

public class Main {

    public static void main(String[] args) {
        StudentManager studentManager = new StudentManager();

        Student s1 = new Student("MS01", "Le Nhat Tung", 18, 9.8f);
        Student s2 = new Student("MS02", "Le Nhat Nam", 19, 9.7f);
        Student s3 = new Student("MS03", "Le Nhat Anh", 15, 9.6f);
        Student s4 = new Student("MS04", "Le Nhat Tuan", 16, 9.5f);

        Student s5 = new Student("MS04", "Le Toan Thang", 30, 9.0f);

        studentManager.addStudent(s1);
        studentManager.addStudent(s2);
        studentManager.addStudent(s3);
        studentManager.addStudent(s4);

        studentManager.printStudents();
        System.out.println("Find : "+ studentManager.findStudent(s5));

//        studentManager.updateStudent(s4, s5);
        studentManager.updateStudentById(s5);
        System.out.println("List after update: -----------------");
        studentManager.printStudents();

        System.out.println("List after remove: -----------------");
        studentManager.deleteStudent(s5);
        studentManager.printStudents();

        Student s7 = new Student("MS07", "Le Nhat Tung", 18, 9.8f);
        studentManager.addStudent(s7);
        System.out.println("Count find by : -----------------");
        System.out.println(studentManager.countStudents("Le Nhat Tung"));
    }
}
