/*
class NumberMethods{
    public static void main(String Args[]) {
        Integer a=100,n=25;
        if(a==n){
            System.out.println("equal");
        }
        else{
            System.out.println("Not equal");
        }
    }
}

*/

/*

class NumberMethods{
    public static void main(String Args[]) {
        Integer a=100,n=25;
        if(a==n){
            System.out.println("equal");
        }
        else{
            if(a>n){
                System.out.println("A is Greater than n");
            }    
            else{
                System.out.println("A is less than N");
            }
        
        
        
        
        }
    }
}
*/

class NumberMethods{
    public static void main(String Args[]) {
        Integer a=100,n=25;
        System.out.println(a.compareTo(n));
       System.out.println("Smallest number is "+Math.min(a,n));
    }
}