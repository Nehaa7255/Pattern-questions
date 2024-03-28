import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=0;i<num;i++){
            for(char j=0;j<num-i-1;j++) {
                System.out.print(" ");
            }

           for(char j='A';j<='A'+i;j++){
               System.out.print(j);
           }
           for(char j=2;j>='A';j--){
               System.out.print(j);
            }


            System.out.println();
        }
    }
    }

