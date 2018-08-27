import java.io.Console;
class ConsoleDemo{
    public static void main(String Args[]){
        Console cnsl = System.console();
        if (cnsl != null) {
            name = cnsl.readLine("Name: ");
            System.out.println("Name entered: " + name);
        }
    }
}