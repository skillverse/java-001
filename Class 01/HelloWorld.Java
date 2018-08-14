class HelloWorld{

    public static void main(String args[]){

        System.out.println("Hello World");
        MyMessage m = new MyMessage();
        m.myMessage();
    }
}

class MyMessage{
    public void myMessage(){
        System.out.println("Hi How are you");
    }
}