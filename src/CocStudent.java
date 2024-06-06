import java.util.Arrays;

public class CocStudent {

    public static void main(String[] args) {
        // Create students
        Student s1 = new Student(333, "paul", 3);
        Student s3= new Student (1, "Marie", 1);
        Student s4= new Student (2, "John", 1);

        // Create courses
        Course c1 = new Course("Math", 334);
        Course c2 = new Course("Geo", 33);
        c1.enrollStudent(new Student(1, "John", 1));
        c1.enrollStudent(new Student(2, "Anna", 1));
        c1.enrollStudent(new Student(3, "Mike", 2));
        c1.enrollStudent(new Student(4, "Emily", 2));
        c1.enrollStudent(new Student(5, "Sophia", 3));
        c1.enrollStudent(new Student(6, "Daniel", 3));
        c1.enrollStudent(new Student(7, "Olivia", 4));
        c1.enrollStudent(new Student(8, "James", 4));
        c1.enrollStudent(new Student(9, "Emma", 5));
        c1.enrollStudent(new Student(10, "William", 5));
        c1.enrollStudent(new Student(11, "Ava", 6));
        c1.enrollStudent(new Student(12, "Michael", 6));

        // Enroll students in courses
        c1.enrollStudent(s1);
        c1.enrollStudent(s3);
        c1.enrollStudent(s4);

        c2.enrollStudent(s1);
        c2.enrollStudent(s4);
        c2.enrollStudent(s3);

        // List students by grade
        c1.listStudentsByGrade();
    }
}

class Student {
    private int id ;
    private String name;
    private int grade;  // their class grade (1, 2, 3.._)

    public Student(int id, String name, int grade) {
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class Course {

    private String courseName;
    private int courseCode;
    private Student[] students; //list of students

    public Course(String courseName, int courseCode) {
        this.courseName = courseName;
        this.courseCode = courseCode;
        this.students = new Student[0]; // Initialize students array
    }

    public void enrollStudent(Student student) {  //one student
        // Create a new array with length one greater than the current array
        Student[] newStudents = Arrays.copyOf(students, students.length + 1);
        //or Student[] newStudents = new Student[students.length + 1];
        //for (int i = 0; i < students.length; i++) { newStudents[i] = students[i];
        // Add the new student at the end
        newStudents[students.length] = student;
        // Update the students array reference to the new array
        students = newStudents;
    }

    public void listStudentsByGrade() {
        // Iterate over each grade from 1 to 6
        for (int i = 1; i <= 6; i++) {
            System.out.println("Students in grade " + i + ":");
            // Iterate over students and print names if their grade matches the current iteration
            for (Student student : students) {
                if (student.getGrade() == i) {
                    System.out.println(student.getName());
                }
            }
            System.out.println(); // Add a blank line between grades
        }
    }
}
