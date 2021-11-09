public class Student implements Comparable<Student> {
    String name;
    int course;

    public Student(String name, int course) {
        this.name = name;
        this.course = course;
    }

    @Override
    public String toString() {
        return "Student" +
                "name='" + name + '\'' +
                ", course=" + course
                ;
    }

    @Override
    public int compareTo(Student o) {
        return this.course - o.course;
    }
}
