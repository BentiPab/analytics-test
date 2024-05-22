package second;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.net.URL;
import java.util.*;
import java.util.regex.Pattern;

import static java.lang.Integer.parseInt;

public class Second {
    public static void main(String[] args) {
        Students students = new Students();
        try (BufferedReader br = new BufferedReader(new FileReader("src/second/inputData.csv"))) {
            String line;
            while ((line = br.readLine()) != null) {

                String[] values = line.split(",");
                if (!values[0].matches("ID")) {
                   students.addStudent(new Student(parseInt(values[0]), values[1]));
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        students.sortStudents();

        for (Student student:students.getStudents()) {
            System.out.println(student.toString());
        }
    }



}