import java.util.*;

class Student implements Comparable<Student> {
    int id;
    String name;
    int marks;

    Student(int id, String name, int marks) {
        this.id = id;
        this.name = name;
        this.marks = marks;
    }

    
    public int compareTo(Student s) {
        return this.marks - s.marks;
    }

    public String toString() {
        return id + " " + name + " " + marks;
    }
}

public class ArrayList1 {
    public static void main(String[] args) {

        ArrayList<Student> list = new ArrayList<>();

       
        list.add(new Student(1, "Arvind", 80));
        list.add(new Student(2, "Ravi", 90));
        list.add(new Student(3, "Sita", 70));

        
        System.out.println("Students:");
        for (Student s : list) {
            System.out.println(s);
        }

       
        System.out.println("\nUsing Iterator:");
        Iterator<Student> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

       
        Collections.sort(list);
        System.out.println("\nSorted by Marks:");
        System.out.println(list);

        
        Student key = new Student(0, "", 90);
        int index = Collections.binarySearch(list, key);
        System.out.println("\nSearch result index: " + index);

       
        TreeSet<Student> set = new TreeSet<>(list);
        System.out.println("\nTreeSet:");
        System.out.println(set);
    }
}
