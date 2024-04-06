package Introduction;

public class WrapperExample {
    public static void main(String[] args) {
//        int a =10;
//        int b=20;
//        // wrapper class are conversion of primitive into object
//        Integer num = 45;
        Integer a = 10;
        Integer b = 20;
        swap(a, b); //  it will not swap,
        //because primitives willhave call by value
        System.out.println(a + " " + b);
        final int bonus = 3;
        final A kunal = new A("kunal");
           kunal.name = "other name";
         //  when a non-primitive is final you cannot reassign it
        //   kunal = new A("new object");

          A obj;
          for(int i=0; i<1000000000;i++){
              obj=new A("random name");
          }
    }

    static void swap(Integer a, Integer b) {
        Integer temp = a;
        a = b;
        b = temp;
    }
}
    class A{
        final int num = 10;
        String name;
        public A(String name){
            this.name = name;
        }

        @Override
        protected void finalize() throws Throwable {
            System.out.println("object is destroyed");
        }
    }

