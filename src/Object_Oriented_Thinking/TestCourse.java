package Object_Oriented_Thinking;

public class TestCourse {

    public static void main(String[] args) {
        Course course1 = new Course("Data Structures");
        Course course2 = new Course("Database System");
        course1.addStudent("Perer");
        course1.addStudent("kim");
        course1.addStudent("Anne");

        course2.addStudent("Perer");
        course2.addStudent("kIm");

        System.out.println("Number of students in course1 : " + 
                course1.getNumberOfStudents());
        String students[] = course1.getStudents();

        for (int i = 0; i < course1.getNumberOfStudents(); i++) {
            System.out.print(students[i] + " ");
        }
        System.out.println("");
        System.out.println("Number of students in course2 : " + course2.getNumberOfStudents());
    }

}
