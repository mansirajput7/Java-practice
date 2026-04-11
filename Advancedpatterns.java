import java.util.*;

public class Advancedpatterns {
    public static void main(String args[]) {

        // BUTTERFLY PATTERN

        // int n = 5;

        // // FIRST HALF- UPPER HALF
        // for(int i=1; i<=n; i++) {
        //     // 1st PART
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }

        //     // SPACES
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     // 2nd PART
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // // LOWER HALF
        // for(int i=n; i>=1; i--) {
            
        //     // 1st PART

        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }

        //     // SPACES
        //     int spaces = 2 * (n-i);
        //     for(int j=1; j<=spaces; j++) {
        //         System.out.print(" ");
        //     }

        //     // 2nd PART
        //     for(int j=1; j<=i; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // STAR PATTERN 

        // int n = 5;

        // for(int i = 1; i<=n; i++) {
        //     // SPACE
        //     for(int j=1; j<=n-i; j++) {
        //         System.out.print(" ");
        //     }

        //     // STAR
        //     for(int j=1; j<=5; j++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }

        // NUMBER PYRAMID

        // int n = 5;

        // for(int i=1; i<=n; i++) {
        //     // SPACES
        //     for(int j=1; j<n-1; j++) {
        //         System.out.print(" ");
        //     }
        //     // NUMBERS -> Print row number, row number times
        //     for(int j=1;j<=i; j++) {
        //         System.out.print(i+" ");
        //     }
        //     System.out.println();
        // }

        // int n = 5;

        // for(int i=1; i<=n; i++) {
        //     // SPACES
        //     for(int j=1; j<=n-1; j++) {
        //         System.out.print(" ");
        //     }

        //     // 1st HALF NUMBERS
        //     for(int j=i; j>=1; j--) {
        //         System.out.print(j);
        //     }

        //     // 2nd HALF NUMBERS
        //     for(int j=2; j<=i; j++) {
        //         System.out.print(j);
        //     }
        //     System.out.println();

        // }

        int n = 4;

        // UPPER HALF
        for(int i = 1; i<=n; i++) {
            // SPACES
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // STARS
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
                System.out.println();
     
       }

        // INNER HALF
        
        for(int i = n; i>=1; i--) {
            // SPACES
            for(int j=1; j<=n-i; j++) {
                System.out.print(" ");
            }

            // STARS
            for(int j=1; j<=2*i-1; j++) {
                System.out.print("*");
            }
                System.out.println();
     
       }

    }
}
