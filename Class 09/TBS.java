import java.util.Scanner;
class Customer{
public int id;
private static String Name;
private static String Mobile;
private static String Email;
Scanner sc = new Scanner(System.in);
void Register(){
    System.out.println("Enter Name");
    Name=sc.nextLine();
    System.out.println("Enter Mobile");
    Mobile=sc.nextLine();
    System.out.println("Enter Email");
    Email=sc.nextLine();
}
void Viewdetails(){
    System.out.println("Name:"+Name);
    System.out.println("Mobile:"+Mobile);
    System.out.println("Email:"+Email);    
}
}
class test{

public static void main(String args[]){
    Customer cu = new Customer();
    int oper;
    try(Scanner sc = new Scanner(System.in)){
        System.out.println("1. register\n");
        System.out.println("2. viewdetails\n");
        System.out.println("3. Select An Operation Number");
        oper=sc.next().charAt(0);
            switch(oper)
            {
            case '1':cu.Register();
            break;
            case '2':cu.Viewdetails();
            break;
            }
        }   
    }

}
