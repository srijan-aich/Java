// String-buffer 
class strings2 {
    public static void main(String[] args) {

        StringBuffer sb = new StringBuffer("Srijan");
        sb.append(" Aich"); //StringBuffer is mutable, so the same string object is modified
        System.out.println(sb.length()); //prints the length of the string in the StringBuffer
        System.out.println(sb.capacity()); //prints the capacity of the StringBuffer, which is the amount of memory allocated for it
        System.out.println(sb); //prints the string in the StringBuffer
        sb.deleteCharAt(4); //deletes the character at index 4 (the 'a' in "Srijan")
        String str = sb.toString(); //converts the StringBuffer to a String
        System.out.println(str); //prints the string after deletion
    }
}
