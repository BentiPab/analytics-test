package second;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Students {
    private List<Student> students = new ArrayList<>();
    public Students() {
    }
    public Students(List<Student> students) {
        this.students = students;
    }

    public void sortStudents() {
        this.students.sort(Comparator.comparing(Student::getName));
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

}
