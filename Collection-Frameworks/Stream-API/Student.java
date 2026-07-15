public class Student {

    int rollNo;
    String name;
    int mark;

    public Student(int rollNo, String name, int mark) {
        this.rollNo = rollNo;
        this.name = name;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student [rollNo=" + rollNo +
                ", name=" + name +
                ", mark=" + mark + "]";
    }
}