@FunctionalInterface

interface Lam{

    void show();

    //void num(int i); func interface so another method not possible, just and ex of using values with lamda expression
}

public class lamda_ {
    public static void main(String[] args) {

        /*Lam obj = new Lam() {
            
            public void show(){
                System.out.println(" Not Lamda");
            }
        };
        obj.show();*/


        Lam obj = () -> System.out.println("Lamda");
        obj.show(); 

        /*Lam obj1 = i -> System.out.println("Lamda");
        obj1.num(); */   // for single int 

        // for double int or more - (i,j) / use brackets.. 

    }
       
}
