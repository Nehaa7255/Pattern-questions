/*
  1
  22
  333
  4444
  55555
 */

import java.util.Scanner;
public class Forth {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=5;

        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++){
    System.out.print(i);
            }
            System.out.println();
        }
    }

}
