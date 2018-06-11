package algo.selectionSortUsingComparable;

public class Student implements Comparable<Student>{
    private int score;
    private String name;

    public Student(int s, String n) {
        score = s;
        name = n;
    }

    @Override
    public int compareTo(Student s) {
        int result;
        result = this.score - s.score;
        if (result != 0) {
            return result;
        } else {
            return this.name.compareTo(s.name);
        }
    }

    @Override
    public String toString() {
        return "Student: " + this.name + " Score: " + this.score;
    }
}
