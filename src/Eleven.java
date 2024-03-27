import java.util.Scanner;
public class Eleven {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
int num=5;
        for(int i=0; i<=num;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.println();
        }
    }

    }