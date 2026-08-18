import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

// ======================================================
// STUDENT CLASS
// ======================================================

class Student implements Comparable<Student> {

    private int id;
    private String name;
    private int age;
    private double marks;

    // Constructor
    Student(int id, String name, int age, double marks) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.marks = marks;
    }

    // Getters
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getMarks() {
        return marks;
    }

    // ==================================================
    // COMPARABLE
    // ==================================================
    // Comparable is used when we want to define the
    // DEFAULT / NATURAL sorting of our objects.
    //
    // Here, we decide that students should normally
    // be sorted by MARKS.
    //
    // this = current Student object
    // other = another Student object
    // ==================================================

    @Override
    public int compareTo(Student other) {

        return Double.compare(this.marks, other.marks);
    }

    @Override
    public String toString() {
        return id + " " + name + " " + age + " " + marks;
    }
}


// ======================================================
// MAIN CLASS
// ======================================================

public class Main {

    public static void main(String[] args) {

        // ==================================================
        // GENERICS
        // ==================================================
        //
        // List<Student>
        //
        // <Student> tells Java that this list can contain
        // ONLY Student objects.
        //
        // This is called GENERICS.
        // ==================================================

        List<Student> students = new ArrayList<>();

        students.add(new Student(1, "Rahul", 22, 85.5));
        students.add(new Student(2, "Priya", 21, 92.0));
        students.add(new Student(3, "Amit", 23, 70.5));
        students.add(new Student(4, "Neha", 20, 88.0));
        students.add(new Student(5, "Jay", 22, 65.0));


        // ==================================================
        // PRINT ALL STUDENTS
        // ==================================================

        System.out.println("All Students:");

        for (Student s : students) {
            System.out.println(s);
        }


        // ==================================================
        // COMPARABLE
        // ==================================================
        //
        // Student implements Comparable<Student>
        //
        // Therefore we can use:
        //
        // students.sort(null);
        //
        // null means:
        // "Use the natural ordering defined by Comparable"
        //
        // Our compareTo() sorts by MARKS.
        // ==================================================

        students.sort(null);

        System.out.println("\nSorted by Marks using Comparable:");

        for (Student s : students) {
            System.out.println(s);
        }


        // ==================================================
        // COMPARATOR
        // ==================================================
        //
        // Comparator allows us to create DIFFERENT ways
        // of sorting objects.
        //
        // For example:
        // Sort students by AGE.
        //
        // Comparator<Student> means:
        // "This comparator compares two Student objects."
        // ==================================================

        Comparator<Student> sortByAge =
                new Comparator<Student>() {

                    @Override
                    public int compare(Student s1, Student s2) {

                        return Integer.compare(
                                s1.getAge(),
                                s2.getAge()
                        );
                    }
                };


        students.sort(sortByAge);

        System.out.println("\nSorted by Age using Comparator:");

        for (Student s : students) {
            System.out.println(s);
        }


        // ==================================================
        // LAMBDA EXPRESSION
        // ==================================================
        //
        // The Comparator above can be written much more
        // simply using a Lambda.
        //
        // Instead of:
        //
        // new Comparator<Student>() {
        //     public int compare(Student s1, Student s2) {
        //         return Integer.compare(
        //             s1.getAge(),
        //             s2.getAge()
        //         );
        //     }
        // }
        //
        // We can write:
        //
        // (s1, s2) -> Integer.compare(s1.getAge(), s2.getAge())
        //
        // ==================================================

        students.sort(
                (s1, s2) -> Integer.compare(
                        s1.getAge(),
                        s2.getAge()
                )
        );

        System.out.println("\nSorted by Age using Lambda:");

        for (Student s : students) {
            System.out.println(s);
        }


        // ==================================================
        // LAMBDA + COMPARATOR
        // ==================================================
        //
        // Sort by NAME.
        //
        // Comparator.comparing() makes this even easier.
        // ==================================================

        students.sort(
                Comparator.comparing(Student::getName)
        );

        System.out.println("\nSorted by Name:");

        for (Student s : students) {
            System.out.println(s);
        }


        // ==================================================
        // STREAM API
        // ==================================================
        //
        // Suppose we only want students whose marks
        // are greater than or equal to 80.
        //
        // stream()
        //      ↓
        // filter()
        //      ↓
        // collect()
        //
        // ==================================================

        List<Student> highScorers = students
                .stream()

                // Keep only students with marks >= 80
                .filter(s -> s.getMarks() >= 80)

                // Convert Stream back into List
                .collect(Collectors.toList());


        System.out.println("\nStudents with Marks >= 80:");

        for (Student s : highScorers) {
            System.out.println(s);
        }


        // ==================================================
        // STREAM + LAMBDA
        // ==================================================
        //
        // We can directly print students whose marks
        // are greater than or equal to 80.
        //
        // forEach() accepts a Lambda.
        // ==================================================

        System.out.println("\nHigh Scorers using Stream + Lambda:");

        students
                .stream()
                .filter(s -> s.getMarks() >= 80)
                .forEach(s -> System.out.println(s));


        // ==================================================
        // STREAM + MAP
        // ==================================================
        //
        // Suppose we only want the NAMES of students.
        //
        // map() converts one object into another value.
        //
        // Student
        //    ↓
        // getName()
        //    ↓
        // String
        // ==================================================

        List<String> names = students
                .stream()
                .map(Student::getName)
                .collect(Collectors.toList());

        System.out.println("\nStudent Names:");

        System.out.println(names);


        // ==================================================
        // STREAM + COUNT
        // ==================================================
        //
        // Count how many students have marks >= 80.
        // ==================================================

        long count = students
                .stream()
                .filter(s -> s.getMarks() >= 80)
                .count();

        System.out.println("\nNumber of students with marks >= 80:");

        System.out.println(count);


        // ==================================================
        // STREAM + MAX
        // ==================================================
        //
        // Find the student with the highest marks.
        // ==================================================

        Student topper = students
                .stream()
                .max(Comparator.comparing(Student::getMarks))
                .orElse(null);

        System.out.println("\nTopper:");

        System.out.println(topper);
    }
}