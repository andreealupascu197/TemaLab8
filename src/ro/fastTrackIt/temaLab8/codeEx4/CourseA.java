package ro.fastTrackIt.temaLab8.codeEx4;

public class CourseA {
    public static void main(String[] args) {
        Student firstStudent = new Student("Andrei", 8);
        Student secondStudent = new Student("Matei", 10);

        System.out.println(firstStudent.getName());
        System.out.println(firstStudent.getGrade());
        System.out.println(secondStudent.getName());
        System.out.println(secondStudent.getGrade());
        System.out.println(Student.averageGrade());

    }
}
