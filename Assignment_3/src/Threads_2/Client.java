package Threads_2;

import java.util.Scanner;

public class Client {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number : ");
        int n = sc.nextInt();
        TableCreator tc = new TableCreator(n);
        System.out.println("Stating the thread..." + Thread.currentThread().getName());
        Thread t1 = new Thread(tc);
        t1.start();
        System.out.println("Thread process ended..." + Thread.currentThread().getName());
    }
}
