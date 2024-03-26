/*

 *****
 ****
 ***
 **
 *

 */

import java.util.Scanner;
public class Fifth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int num=5;
for(int i=num;i>0;i--){
    for(int j=0;j<i;j++){
        System.out.print("*");
    }
    System.out.println();
}
    }
}
