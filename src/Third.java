/*
  1
  12
  123
  1234
  12345

 */

import java.util.Scanner;
public class Third {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);

        for(int i=0; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
