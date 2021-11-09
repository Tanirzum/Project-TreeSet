import java.util.*;

public class Test {
    public static void main(String[] args) {
        Set<Student> students = new TreeSet<>();
        Student tanirbergen = new Student("Tanirbergen", 3);
        Student zhanibek = new Student("Zhanibek", 2);
        Student aman = new Student("Aman", 5);
        Student almas = new Student("Almas", 2);

        students.add(tanirbergen);
        students.add(zhanibek);
        students.add(aman);
        students.add(almas);

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
