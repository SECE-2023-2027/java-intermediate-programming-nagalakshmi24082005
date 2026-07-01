public class Student {

    private String name;
    private int[] marks;

    // Parameterized Constructor
    public Student(String name, int[] marks) {
        this.name = name;
        this.marks = marks;
    }

    // Method to calculate average
    public double calculateAverage() {

        if (marks == null || marks.length == 0) {
            return 0.0;
        }

        int sum = 0;

        for (int mark : marks) {
            sum += mark;
        }

        return (double) sum / marks.length;
    }

    // Getter
    public String getName() {
        return name;
    }
}