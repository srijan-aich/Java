abstract class Chicken {

    abstract void ButterChicken();
    abstract void Home_made_Chicken();
    abstract void Best_Food();

}

public class abstract_anonymousclass {
    public static void main(String args[]){

        Chicken obj = new Chicken()
        {
            public void ButterChicken(){
                System.out.println("Butter Chicken is very tasty");
            }

            public void Home_made_Chicken(){
                System.out.println("Home made Chicken is also very tasty");
            }

            public void Best_Food(){
                System.out.println("Best Food is Chicken, Chicken is the best food in the world.");  
            }

        };
        obj.ButterChicken();
        obj.Home_made_Chicken();
        obj.Best_Food(); 
}
} 


