package Comparing;

public class Student implements Comparable<Student>{
    int rollno;
    float marks;

    public Student(int rollno, float marks) {
        this.rollno = rollno;
        this.marks = marks;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    @Override
    public String toString() {
        return marks+ "" ;
    }

    @Override
    public int compareTo(Student o) {
        System.out.println("in compareTo method");
        int diff = (int)(this.marks-o.marks);
        return diff;
    }
}
