public class wrapper {
    public static void main(String args[]){

        int a = 10;
        Integer obj = a; // Autoboxing - converting primitive type to wrapper class object
        System.out.println(obj);

        //Integer obj1 = new Integer(20); // Boxing - converting primitive type to wrapper class object
        
        int b = obj; // Auto Unboxing - converting wrapper class object to primitive type
        System.out.println(b);

        String str = "30";
        int c = Integer.parseInt(str);
        System.out.println(c);

    }
}
