package Singleton;

class Databaseconnection{
    private static Databaseconnection dbConn = null;
    private Databaseconnection(){
        System.out.println("Here in constructor");
    }
    //Double check locking using synchronized.
    public static Databaseconnection getInstance(){
        //Double checking...
        if(dbConn == null){
            synchronized (Databaseconnection.class){
                if(dbConn == null){
                    dbConn = new Databaseconnection();
                }
            }
        }
        return dbConn;
    }
}

public class Main {
    public static void main(String[] args) {
        while(true){
            Databaseconnection dbConn = Databaseconnection.getInstance();
        }

    }
}
