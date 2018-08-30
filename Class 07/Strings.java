class Strings{
    public static void main(String Args[]) {
        String name="Skillverse Computer Education C";
        String name2="    Skillverse     ";
        String course="Java Training";
        System.out.println("Institute Name :"+name);
        System.out.println("Course:"+course);
        System.out.println("Is empty String ="+name.isEmpty());
        System.out.println("Length of the string "+name+"="+name.length());
        String reverse = new StringBuilder(name).reverse().toString();
        if(name.equals(name2)){
            System.out.println("name and name2 are equal");
        }
        System.out.println("name starts with "+name.charAt(0));
        String fullname= name.concat(course);
        System.out.println("Full Name ="+fullname);
        System.out.println("Name in Reverse ="+reverse);
        System.out.println("S is at index "+name.indexOf('S'));
        System.out.println("Substring is "+name.substring(0, 5));
        System.out.println("Another Substring without defining end index ="+name.substring(5));
        System.out.println("Name has a computer "+name.contains("Computer"));
        System.out.println("C is found at"+name.indexOf("C"));
        System.out.println("C is also found last at"+name.lastIndexOf("c"));
        name.replace("c", "C");
        System.out.println(name);
        System.out.println("Before Trim"+name2);
        System.out.println(name2.trim());

    }
}