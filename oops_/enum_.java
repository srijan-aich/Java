enum Status{

    Running, Failed, Again_running, Success; 
}

public class enum_{
    public static void main(String args[]){

        //Status s = Status.Running;
        //System.out.println(s); //prints Running

        //Status d = Status.Failed;
        //System.out.println(d.ordinal()); // gives element positon no...which is 1

        Status[] B = Status.values();

        for(Status dbs : B){
        System.out.println(dbs + ":" + dbs.ordinal());

        }

    }
}