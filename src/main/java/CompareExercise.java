import java.util.*;

/**
 * Created by saoprb on 11/26/2016.
 */
public class CompareExercise {

    public static class Student implements Comparable<Student> {
        private final int id;
        private final String name;
        private final String grade;

        public Student(int id, String name, String grade) {
            this.id = id;
            this.name = name;
            this.grade = grade;
        }

        public int getId() {
            return id;
        }

        public String getName() {
            return name;
        }

        public int compareTo(Student student) {
            return this.id > student.getId() ? 1 : this.id == student.getId() ? 0 : -1;
        }

        public String toString() {
            return String.format("%s, %s, %s", id, name, grade);
        }
    }

    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();

        students.add(new Student(25,"Martha","Grade 3"));
        students.add(new Student(04,"Jerome","First year"));
        students.add(new Student(10,"Bernadette","Grade 1"));

        Collections.sort(students);

        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("");

//        students.sort(new Comparator<Student>() {
//            public int compare(Student o1, Student o2) {
//                return o1.getName().compareTo(o2.getName()) > 0 ? 1 : o1.getName().equals(o2.getName()) ? 0 : -1;
//            }
//        });

        students.sort((Student o1, Student o2) -> o1.getName().compareTo(o2.getName()) > 0 ? 1 : o1.getName().equals(o2.getName()) ? 0 : -1);

        for (Student student : students) {
            System.out.println(student);
        }
    }
}
