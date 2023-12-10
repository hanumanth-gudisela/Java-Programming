public class Example2 {
    int i = 0;

    public void Example2(String text) {
        i = 1;
    }


  static class Sub extends Example2 {
      public Sub(String text) {
          i = 2;
      }
  }
      public static void main(String[] args) {
          Sub sub = new Sub("HelloWorld");
          System.out.println(sub.i);
      }

}
