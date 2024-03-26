

![P1.webp](assest%2FP1.webp)

```java


import java.util.Scanner;

public class Question_1 {
    public static void main (String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

}

```

![P2.webp](assest%2FP2.webp)

```java
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

```