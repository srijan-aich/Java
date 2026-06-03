class strings {
    public static void main(String[] args) {
        String name = "Srijan"; //mainly used way to create a string
        System.out.println(name);

        String name2 = new String("Srijan Aich"); 
        System.out.println(name2);

        System.out.println(name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.length());
    }
}