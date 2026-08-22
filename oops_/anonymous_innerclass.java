class Anonymous {

    public void show() {
        System.out.println("Anonymous show() method");
    }
}

public class anonymous_innerclass {
    public static void main(String args[]){

        Anonymous obj = new Anonymous() 
        // this is an anonymous inner class because it doesn't have a name and it is extending the Anonymous class and overriding the show() method
        {

        public void show(){
            System.out.println("Anonymous inner class show() method");
        } 

        };

        obj.show();

    }
}