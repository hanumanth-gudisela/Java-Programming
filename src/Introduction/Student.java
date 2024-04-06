package Introduction;

// create a class
public class Student {
    int rno;
    String name;
    float marks;
    void greeting(){
        System.out.println("hello, how are you," +name);
    }
    Student(Student other){
        this.name = other.name;
        this.rno=other.rno;
        this.marks=other.marks;
    }
    Student(){
        this(13,"default peron", 100.0f);
    }

    @Override
    public String toString() {
        return "Student{" +
                "rno=" + rno +
                ", name='" + name + '\'' +
                ", marks=" + marks +
                '}';
    }

    Student(int rno, String name, float marks) {
        this.rno = rno;
        this.name = name;
        this.marks = marks;
    }
}
