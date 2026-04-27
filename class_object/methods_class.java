class Methods {

    public void playGames(){
        System.out.println("I like to play games");
    }
    public String playSports(int score){
        System.out.println("I like to play sports");
        System.out.println("My sports score is: " + score);

        if(score < 5){
            return "bad";
        }
        else if(score < 8){
            return "good";
        }
        else
        return "wonderful";
    }
}

    public class methods_class {
    public static void main(String args[]){
        Methods obj = new Methods();
        obj.playGames();
        String str = obj.playSports(10);
        System.out.println(str);
    }
}

