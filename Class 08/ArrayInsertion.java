import java.util.Scanner;
class ArrayInsert{
    public static void main(String Args[]) {
     Scanner sc = new Scanner(System.in);
     int[] numbers= new int[10];
     System.out.println("Enter 10 numbers");
     for(int i=0;i<10;i++){
        numbers[i]=sc.nextInt();
     }
     System.out.println("The Numbers are");
     for (int number : numbers) {
         System.out.println(number);
     }

    }
}