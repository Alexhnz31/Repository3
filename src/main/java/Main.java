import JavaCollectionLessons.JavaStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public void main(String[] args) {
        JavaStreams.Student st1 = new JavaStreams.Student(  "geyorgiy",12, 'm',1,9.2);
        JavaStreams.Student st2 = new JavaStreams.Student(  "andrey",17, 'f',1,10.0);
        JavaStreams.Student st3 = new JavaStreams.Student(  "sergey",10, 'm',1,6.4);
        JavaStreams.Student st4 = new JavaStreams.Student(  "alex",43, 'f',1,4.6);
        JavaStreams.Student st5 = new JavaStreams.Student(  "sdaaf",32, 'm',1,13.2);


        List<JavaStreams.Student> students = new ArrayList<>();
        students.add(st1);
        students.add(st2);
        students.add(st3);
        students.add(st4);
        students.add(st5);

        students = students.stream().filter(e
                ->e.getAge()>22&&e.getAvgGRade()<7.2).collect(Collectors.toList());
        System.out.println(students);

    }
}
