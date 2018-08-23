class While{
    public static void main (String Args[]){
       int i=1; //initialization

            start:{
            System.out.println(i);
                i++;

                if(i<=100){
                    continue start;
                }
            }
    }

}