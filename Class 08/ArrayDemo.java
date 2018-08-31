import java.util.Scanner;
class ArrayDemo{
    public static void main(String Args[]) {
     Scanner sc = new Scanner(System.in);
     int[] numbers={};
     for(int i=0;i<10;i++){
        numbers[i]=sc.nextInt();
     }
     for (int number : numbers) {
         System.out.println(number);
     }

    }
}