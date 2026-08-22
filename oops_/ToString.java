class Laptop{

    String model;
    int price;

    @Override
    public String toString() {
        return "Laptop [model=" + model + ", price=" + price + "]"; // source action -> Generate -> toString() method
    }

    @Override
    public int hashCode() { //source action -> Generate -> hashCode() and equals() method
        final int prime = 31;
        int result = 1;
        result = prime * result + ((model == null) ? 0 : model.hashCode());
        result = prime * result + price;
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Laptop other = (Laptop) obj;
        if (model == null) {
            if (other.model != null)
                return false;
        } else if (!model.equals(other.model))
            return false;
        if (price != other.price)
            return false;
        return true;
    }

    

    
}

public class ToString{
    public static void main(String args[]){

        Laptop obj = new Laptop();
        obj.model = "Dell"; 
        obj.price = 10_000;
        //System.out.println(obj); // will print the reference/hashcode of the object because we have not overridden the toString() method in Laptop class 
        System.out.println(obj.toString()); 

        Laptop obj1 = new Laptop();
        obj1.model = "Dell";
        obj1.price = 10_000;
        System.out.println(obj1.toString());

        System.out.println(obj.equals(obj1));
    }
}