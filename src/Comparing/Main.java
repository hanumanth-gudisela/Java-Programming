package Comparing;

import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        Student kannan = new Student(23,56f);
        Student rahul = new Student(5,98f);
        Student kunal = new Student(3,99f);
        Student vamsi = new Student(2,96f);
        Student karan = new Student(20,90f);
        Student bagat = new Student(25,97f);

        Student[] list = {kannan, rahul,kunal,vamsi,karan,bagat};
        System.out.println(Arrays.toString(list));
         Arrays.sort(list, (o1, o2) -> -(int)(o1.marks- o2.marks));
        System.out.println(Arrays.toString(list));

//        @Override
//        public int compare(Student o1, Student o2) {
//            return -(int)(o1.marks- o2.marks);
//        }
//    });
//        if (kannan.compareTo(rahul)<0){
//            System.out.println(kannan.compareTo(rahul));
//            System.out.println("rahul 2 has more marks");
//        }
    }
}
