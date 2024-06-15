package Threads;
enum Constants{
    MONDAY,
    TUESDAY,
    WEDNESDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;

}


public class Main {
    public static void main(String[] args) {
        for(Constants cnst : Constants.values()){
            System.out.println(cnst);
        }

        Constants enumVar = Constants.valueOf("FRIDAY");
        System.out.println(enumVar);

    }

}
