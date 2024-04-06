package Cloning;

public class Human implements Cloneable{
    int age;
    String name;
    int[] arr;

    public Human(int age, String name) {
        this.age = age;
        this.name = name;
        this.arr = new int[] {3,4,5,6,2};
    }


//    public Human(Human other){
//        this.age =age;
//        this.name = name;
//    }
    @Override
    public Object clone() throws CloneNotSupportedException{
       // shallow copy
        Human twin = (Human)super.clone(); // shallow copy

        // make a deep copy
        twin.arr= new int[twin.arr.length];
        for (int i=0;i<twin.arr.length;i++){
            twin.arr[i] = this.arr[i];
        }
        return twin;

    }
}
