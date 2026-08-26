@FunctionalInterface

interface ABC{

    void display();

}

/*class CD implements ABC{

    public void display(){
        System.out.println("In ABC Display");
    }

}*/

public class func_interface {
    public static void main(String args[]){

        //CD obj = new CD();
        //obj.display();

        ABC obj = new ABC()
        {
            public void display(){
                System.out.println("In ABC Display");
            }
        };
        obj.display();
    }
}
