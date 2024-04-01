import java.util.ArrayList;
public class TestDriver {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student(1001, "John Doe", "1st St, Laramie, Wyoming 82007"));
        students.add(new Student(1002, "Jane Doe", "2nd St, Laramie, Wyoming 82007"));
        students.add(new Student(1003, "Michael Scott", "3rd St, Laramie, Wyoming 82007"));
        students.add(new Student(1004, "Jim Halpert", "4th St, Laramie, Wyoming 82007"));
        students.add(new Student(1005, "Dwight Schrute", "5th St, Laramie, Wyoming 82007"));
        students.add(new Student(1006, "James Bond", "6th St, Laramie, Wyoming 82007"));
        students.add(new Student(1007, "Pam Halpert", "7th St, Laramie, Wyoming 82007"));
        students.add(new Student(1008, "Stewie Bript", "8th St, Laramie, Wyoming 82007"));
        students.add(new Student(1009, "Luke Skywalker", "9th St, Laramie, Wyoming 82007"));
        students.add(new Student(1010, "Tim Burton", "10th St, Laramie, Wyoming 82007"));

        CustomHeapSort.heapSort(students, new SortName());
        System.out.println("Sorted by name: " + students);

        CustomHeapSort.heapSort(students, new SortRollno());
        System.out.println("Sorted by roll number: " + students);
    }

}
