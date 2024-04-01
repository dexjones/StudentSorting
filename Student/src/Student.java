public class Student {
    int rollno; //roll number
    String name, address;

    //parameterized constructor
    public Student(int rollno, String name, String address) {
        this.rollno = rollno;
        this.name = name;
        this.address = address;
    }

    @Override
    public String toString() {
        return "\nRoll # " + rollno + ", Name: " + name + ", Address: " + address;
    }
}
