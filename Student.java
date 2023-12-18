package projects.com;
public  class Student {
    // Fields to store student information
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    // Default constructor initializes fields with default values
    public Student() {
        firstName = "";
        lastName = "";
        registration = 0;
        grade = 0;
        year = 0;
    }

    // Parameterized constructor to set values for all fields
    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    // Another constructor with fewer parameters (grade and year set to default values)
    public Student(String firstName, String lastName, int registration) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        grade = 0;
        year = 0;
    }

    // Method to print full name of the student
    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    // Method to check if the student is approved (grade >= 60)
    public boolean isApproved() {
        return grade >= 60;
    }

    // Method to increment the year if the student is approved
    public void changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations!");
        }
    }
}
