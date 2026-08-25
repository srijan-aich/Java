enum Laptop{
    MacBook(2000), Dell(1300), ThinkPad(1800), HP(1500);

    private int price;

    private Laptop(int price){
        this.price = price;
    }

    public int getPrice(){
        return price;
    }

    public void setPrice(int price){
        this.price = price;

    }
}

public class enum_class{
    public static void main(String args[]){

        /*Laptop lap = Laptop.MacBook;
        System.out.println(lap + ":" + lap.getPrice());*/

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap + ":" + lap.getPrice());
        }
    }
}

    


