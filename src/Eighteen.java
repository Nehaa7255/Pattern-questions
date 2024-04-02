import java.util.Scanner;
import java.util.*;
public class Eighteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=0;i<num;i++){
            for(char ch =(char)(int)('A'+num-1-i);ch<=(char)(int)('A'+num-1);ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }
    }
