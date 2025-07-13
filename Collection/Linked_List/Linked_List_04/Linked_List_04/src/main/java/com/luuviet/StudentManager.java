package com.luuviet;

public class StudentManager {

    private LinkedList<Student> list;

    public StudentManager() {
        this.list = new LinkedList<Student>();
    }

    public void addStudent(Student student) {
        this.list.addLast(student);
    }

    public void printStudents() {
        this.list.traverse();
    }

    public boolean findStudent(Student student) {
        return list.findNode(student);
    }

    public boolean updateStudent(Student oldstudent, Student newStudent) {
        return list.updateNode(oldstudent, newStudent);
    }

    public void updateStudentById(Student student){
        Node<Student> tmp = this.list.getHead();

        while(tmp != null){
            Student stu = tmp.getData();
            if(stu.getId().equals(student.getId())){
                stu.setName(student.getName());
                stu.setAge(student.getAge());
                stu.setGpa(student.getGpa());
            }
            tmp = tmp.getNext();
        }
    }

    public void deleteStudent(Student student) {
        list.remove(student);
    }

    public int countStudents(String fullName) {
        int count = 0;
        Node<Student> tmp = this.list.getHead();
        while(tmp != null){
            if(tmp.getData().getName().equals(fullName)){
                count++;
            }
            tmp = tmp.getNext();
        }
        return count;
    }

}
