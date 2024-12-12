package groupmanager.model;

public class Student implements Comparable<Student> {
    private int studentId;
    private String firstName;
    private String lastName;

    // Конструкторы, геттеры и сеттеры
    public Student(int studentId, String firstName, String lastName) {
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    // Реализация метода compareTo
    @Override
    public int compareTo(Student other) {
        return Integer.compare(this.studentId, other.studentId);
    }

    @Override
    public String toString() {
        return "Student{id=" + studentId + ", firstName='" + firstName + "', lastName='" + lastName + "'}";
    }
}
