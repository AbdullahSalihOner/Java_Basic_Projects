public class Main {
    public static void main(String[] args) {

        Course math = new Course("Math", "101", "MTH101");
        Course physics = new Course("Physics", "102", "PHY101");
        Course chemistry = new Course("Chemistry", "103", "CHE101");
        // Course[] courses = {math, physics, chemistry};

        Teacher t1 = new Teacher("Mahmut Hoca", "90550000000", "MTH101");
        Teacher t2 = new Teacher("Fatma Ayse", "90550000001", "PHY101");
        Teacher t3 = new Teacher("Ali Veli", "90550000002", "CHE101");
        // Teacher[] teachers = {t1, t2, t3};

        math.addTeacher(t1);// we assign teacher to course
        physics.addTeacher(t2);
        chemistry.addTeacher(t3);

        Student s1 = new Student("Inek Saban", 4, "140144015", math, physics, chemistry);
        s1.addAllExamNote(100, 100, 50, 60, 90, 80);
        s1.isPass();

        Student s2 = new Student("Guduk Necmi", 4, "2211133", math, physics, chemistry);
        s2.addAllExamNote(50, 40, 50, 60, 85, 80);
        s2.isPass();

        Student s3 = new Student("Hayta Ismail", 4, "221121312", math, physics, chemistry);
        s3.addAllExamNote(50, 100, 50, 60, 90, 75);
        s3.isPass();

    }
}