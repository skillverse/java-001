import java.io.*;
class ISR{
    public static void main(String Args[]) {
        InputStreamReader ir=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(ir);      
        try {
            System.out.println("Enter you name");
            String name = br.readLine();
            System.out.println("Hi "+name);
            System.out.println("How, Old are you?");
            int age=Integer.parseInt(br.readLine());
           // float age=Float.parseFloat(br.readLine());
            System.out.println("Age:"+age);
        } catch (Exception e) {
            System.out.println("Please enter age correctly");
        }
    }
}