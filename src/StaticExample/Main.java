package StaticExample;

public class Main {
    public static void main(String[] args) {
//        Human human = new Human(23,"sunitha",10000, false);
//        Human human1 = new Human(22,"suni",100, false);
//        System.out.println(human.population);


    }
    // this is not dependent on objects
      static void fun(){
       // greeting(); // you cannot use this becuase it requires an instance
          // but the function you are using it does not depend on instances

          // hence, i'm referencing it
          Main obj = new Main();
          obj.greeting();
    }

       void fun2(){
        greeting();
       }
       // we know that something which is not static, belongs to an object
        void greeting(){
        // fun();
            System.out.println("Hello world");
        }
}
