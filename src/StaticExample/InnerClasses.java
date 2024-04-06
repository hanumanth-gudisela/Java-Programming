package StaticExample;

import java.util.Arrays;

public class InnerClasses {
    //outside classes cannot be static, but inner classes can be static
   static class Test {
        String name;

        public Test(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return name;
        }
    }

    public static void main(String[] args) {
        Test a = new Test("Sunitha");
        Test b = new Test("Krishna");
      //  Arrays.toString(new int[]{1,2,3,});
        System.out.println(a);
        System.out.println(a.name);
        System.out.println(b.name);

    }
}
