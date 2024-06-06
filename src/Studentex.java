public class Studentex {

    public static void main(String[] args) {
        // Declare students and grades
        Student s1 = new Student("Pierre", 33, new int[]{85, 90, 75});
        Student s2 = new Student("Paul", 28, new int[]{80, 88, 92});

        // Calculate and display average grades
        System.out.println("Average grade for " + s1.getName() + ": " + s1.calculateAverageGrade());
        System.out.println("Average grade for " + s2.getName() + ": " + s2.calculateAverageGrade());
    }

    public static class Student {
        // Attributes
        private String name;
        private int age;
        private int[] grades;

        // Constructor
        public Student(String name, int age, int[] grades) {
            this.name = name;
            this.age = age;
            this.grades = grades;
        }

        // Method to calculate average grade
        public double calculateAverageGrade() {
            if (grades.length == 0) {
                return 0; // Handle division by zero
            }

            int sum = 0;
            for (int grade : grades) {
                sum += grade;
            }

            return (double) sum / grades.length;
        }

        // Getters and setters
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

        public int[] getGrades() {
            return grades;
        }

        public void setGrades(int[] grades) {
            this.grades = grades;
        }
    }
}

