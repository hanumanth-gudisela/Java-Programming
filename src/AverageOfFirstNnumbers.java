import java.util.Scanner;

public class AverageOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter How Many Numbers : ");//input
        int n, num,sum=0;
         n= input.nextInt();
        System.out.println("Enter the number");
         for (int i=0;i<n;i++){
             num= input.nextInt();
             sum +=num;

 }
         Double average = (double)sum/n;
      System.out.println("Average of " + n + " numbers " + average);
    }
}
