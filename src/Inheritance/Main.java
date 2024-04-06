package Inheritance;

public class Main {
    public static void main(String[] args) {
     //   Box box = new Box(4.6, 4.5,5.2);
      //  Box box2 = new Box(box);
      //  System.out.println(box.h+" "+box.l+" "+box.w);
     //   System.out.println(box2);
        BoxWeight boxWeight= new BoxWeight();
//        BoxWeight boxWeight1= new BoxWeight(2.2,3.2,4.2,45.2);
//
//        System.out.println(boxWeight.h+" "+boxWeight.l+" "+boxWeight.w+" "+boxWeight.weight);
//        System.out.println(boxWeight1.h+" "+boxWeight1.l+" "+boxWeight1.w+" "+boxWeight1.weight);

        BoxPrice price = new BoxPrice();
        Box box = new BoxWeight();
        box.greeting();
        System.out.println(boxWeight instanceof Box);
        System.out.println(boxWeight instanceof BoxWeight);

    }
}
