@FunctionalInterface

interface Lamda_add{

    public int add(int i, int j);
}

public class lamda_return {
    public static void main(String[] args) {
        
        /*Lamda_add obj = new Lamda_add()
        {
            public int add(int i, int j){
                return i+j;
            }
        };
    

        int result = obj.add(5,5);
        System.out.println(result);

    }*/
    
    
    Lamda_add obj1 = (i,j) -> i+j;  // does the same job but so short... 

    int result = obj1.add(5,5);
    System.out.println(result);
    
    }
}
