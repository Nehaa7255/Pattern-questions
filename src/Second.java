/*

  *
  **
  ***
  ****
  *****

 */
import java.util.Scanner;
public class Second {
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int num=5;

    for(int i=0;i<num;i++){
        for(int j=0;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

}
}
