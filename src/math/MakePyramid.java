package math;
import java.io.*;

public class MakePyramid {
    public static void main(String[] args) {

        //   Implement a large Pyramid of stars in the screen with java.
        //
        //                    *
        //                   * *
        //                  * * *
        //                 * * * *
        //                * * * * *
        //               * * * * * *

        //Start Here
        int n =7;
        printPyramid(n);



         }
         public static void printPyramid( int n){
             int k = 2*n -2;
             for(int i=0; i <n; i++){
                 for(int j = 0; j<k; j++){
                     System.out.print(" ");
                 }
                 int K=k-1;
                         for (int j = 0; j<+i; j++){
                     System.out.print("* ");
                 }
                 System.out.println();
             }
             System.out.println();
         }

         }

