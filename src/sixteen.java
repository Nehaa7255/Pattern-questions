import java.util.Scanner;
public class sixteen {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=5;
        for(int i=0;i<num;i++)
        {
            for(char j=0;j<=i;j++){
                System.out.print((char)((int)('A'+i)) + " ");
            }
            System.out.println();
        }
    }
}