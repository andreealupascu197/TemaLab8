package ro.fastTrackIt.temaLab8.codeEx4;

public class Student {
    private static int sumOfGrades = 0;
    private static int numberOfStudents = 0;
    private String name;
    private int grade;

    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        sumOfGrades += grade;
        numberOfStudents++;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public static int averageGrade() {
        return sumOfGrades / numberOfStudents;
    }
}
