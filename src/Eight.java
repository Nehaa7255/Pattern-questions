/*
     *********
      *******
       *****
        ***
         *
 */

import java.util.Scanner;
public class Eight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*num)-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
