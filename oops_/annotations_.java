class Annotes{

    public void ShowTheDataOfThisMethod(){

        System.out.println("In A show");
    }
} 

class Annoted extends Annotes{

    @Override //annotation , overriding method ! 
    //public void ShowTheDataofThisMethod(){    error as we are overriding, if we see carefully, the "o" of - Of is in small, it is in capital in parent method, thus method name is diff so override is not possible..
    public void ShowTheDataOfThisMethod(){
        System.out.println("In B show");
    }
}

// there are many annotations..

public class annotations_{
    public static void main(String args[]){

        Annoted obj = new Annoted();
        obj.ShowTheDataOfThisMethod();

    }
}