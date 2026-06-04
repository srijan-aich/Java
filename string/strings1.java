class strings {
    public static void main(String[] args) {
        String name = "Srijan"; 
        name = name + " Aich"; //strings are immutable, so a new string is created and name now points to it
        System.out.println("Hello " + name);

        String name2 = "srijan"; //string literals are stored in a string pool, so name2 will point to the same string object as name3
        String name3 = "srijan"; //name3 will also point to the same string object as name2
        System.out.println(name2 == name3); //true, because name2 and name3 point to the same string object
        System.out.println(name == name2); //false, because name points to a different string object than name2 and name3

    }
}