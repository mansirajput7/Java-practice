// import java.util.*;

// public class TwoDarrays {
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int rows = sc.nextInt();
//         int cols = sc.nextInt();

//         int [] [] numbers = new int [rows] [cols];
        
//         // INPUT
//         // Rows
//         for(int i = 0; i<rows; i++) {
//             // Columns
//             for(int j = 0; j<cols; j++){
//                 numbers[i][j] = sc.nextInt();

//             }
//         }

//         // OUTPUT
//         for(int i = 0; i<rows; i++){
//             for(int j=0; j<cols;j++) {
//                 System.out.println(numbers[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }
    
// }


import java.util.*;

public class TwoDarrays {
    public static void main (String args[]) {
        Scanner sc = new Scanner(System.in);
        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int [] [] numbers = new int [rows] [cols];
        
        // INPUT
        // Rows
        for(int i = 0; i<rows; i++) {
            // Columns
            for(int j = 0; j<cols; j++){
                numbers[i][j] = sc.nextInt();

            }
        }

        int x = sc.nextInt();

        for(int i = 0;i<rows; i++) {
            for(int j = 0; j<cols; j++) {
                // compare with x
                if(numbers[i][j] == x) {
                    System.out.println("x found at location ("+ i + "," + j +")");
                }
            }
        }


    }
    
}