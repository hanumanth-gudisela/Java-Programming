package Access;

public class ObjectDemo {
    int num;

    public ObjectDemo(int num) {
        this.num = num;
    }
// will go in details of how to create it in  hashmap video

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return this.num == ((ObjectDemo)obj).num;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    public static void main(String[] args) {
        ObjectDemo obj = new ObjectDemo(34);
        ObjectDemo ob2 = new ObjectDemo(34);
         if (obj.equals(ob2)){
             System.out.println("print object1 == obj2 ");
         }
     //   System.out.println(obj.hashCode ());
        System.out.println(obj.getClass());

    }
}
