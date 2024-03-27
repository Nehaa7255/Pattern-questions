     import java.util.Scanner;
    public class Fourteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=0; i<=5;i++){
            for(char j='A';j<'A'+i;j++){
                System.out.print(j+"");
            }
            System.out.println();
        }
    }
    }
