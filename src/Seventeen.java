import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=1;i<num;i++){
            for(int j =1;j<num-i+1;j++) {
                System.out.print(" ");
            }
           for(int k=1;k<=i;k++){
               System.out.print(k);
           }
           for(char j=2;j>='A';j--){
               System.out.print(j);
            }
            System.out.println();
        }
    }
    }