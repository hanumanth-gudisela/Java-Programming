package Introduction;

import java.util.Arrays;

 class Demo {
     public static void main(String[] args) {
         Student s1 = new Student(1,"Sunitha",20f);
         s1.greeting();
         System.out.println(s1);
         Student random = new Student(s1);
         System.out.println(random);
         Student random2 = new Student();
         System.out.println(random2.name);
        Student one = new Student();
        Student two = one;
        one.name ="something, something";
         System.out.println(two.name);
     }
 }
