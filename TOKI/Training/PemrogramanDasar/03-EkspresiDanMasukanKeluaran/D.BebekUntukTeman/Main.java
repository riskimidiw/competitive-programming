// Status : Accepted

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        System.out.println("masing-masing " + n/m);
        System.out.println("bersisa " + n%m);
    }
}