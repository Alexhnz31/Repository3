package JavaCollectionLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

public class JavaStreams {

    public static class Student{
        private String name;
        private int age;
        private char sex;
        private int course;
        private double avgGRade;

        public Student(String name, int age, char sex, int course, double avgGRade) {
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.course = course;
            this.avgGRade = avgGRade;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    ", course=" + course +
                    ", avgGRade=" + avgGRade +
                    '}';
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public char getSex() {
            return sex;
        }

        public void setSex(char sex) {
            this.sex = sex;
        }

        public int getCourse() {
            return course;
        }

        public void setCourse(int course) {
            this.course = course;
        }

        public double getAvgGRade() {
            return avgGRade;
        }

        public void setAvgGRade(double avgGRade) {
            this.avgGRade = avgGRade;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (!(o instanceof Student student)) return false;
            return course == student.course && name.equals(student.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name, course);
        }

//        @Override
//        public void run() {
//            System.out.println("Hi i'm " + name+ " I on" + course +" i'm "+ age);
//        }

//        @Override
//        public int compareTo(Object o) {
//
//        }
    }


    public void main(String[] args) {
        Student st1 = new Student(  "geyorgiy",12, 'm',1,9.2);
        Student st2 = new Student(  "andrey",17, 'f',1,10.0);
        Student st3 = new Student(  "sergey",10, 'm',1,6.4);
        Student st4 = new Student(  "alex",43, 'f',1,4.6);
        Student st5 = new Student(  "sdaaf",32, 'm',1,13.2);


        List<Student> students = new ArrayList<>();
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