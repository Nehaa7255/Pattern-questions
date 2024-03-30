

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
![p3.webp](assest%2Fp3.webp)

```java
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
```
![P4.webp](assest%2FP4.webp)
```java
import java.util.Scanner;
public class Forth {
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int num=5;

        for(int i=1;i<=num;i++)
        {
            for(int j=0;j<i;j++){
    System.out.print(i);
            }
            System.out.println();
        }
    }
}
```
![P5.webp](assest%2FP5.webp)
```java
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
```
![P6.webp](assest%2FP6.webp)
```java
import java.util.Scanner;
public class Sixth {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=num;i>0;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
```
![P7.webp](assest%2FP7.webp)
```java
import java.util.Scanner;
public class Seventh {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;

        for(int i=0;i<num;i++){
            for(int j=0;j<(num-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i +1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
![P8.webp](assest%2FP8.webp)
```java
import java.util.Scanner;
public class Eight {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=0;i<num;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*num)-(2*i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
![P9.webp](assest%2FP9.webp)
```java
public class nine {
    public static void main(String[] args){
int num=5;
        for(int i=0;i<num;i++){
            for(int j=0;j<(num-i-1);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(2*i +1);j++){
                System.out.print("*");
            }
            System.out.println();
    }
    for(int i=0;i<num;i++){
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        for(int j=0;j<(2*num)-(2*i+1);j++){
            System.out.print("*");
        }
        System.out.println();
    }
}
}
```
![P10.webp](assest%2FP10.webp)
```java
import java.util.Scanner;
public class Ten {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 5;
        for(int i=0;i<num;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
        System.out.println();
        }
        for(int i=num-1;i>0;i--){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
```
![P11.webp](assest%2FP11.webp)
```java
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
```
![P12.webp](assest%2FP12.webp)
```java
import java.util.Scanner;
public class Twelve {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 4;

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            for (int j = n; j > 0; j--) {
                if (j <= i) {
                    System.out.print(j);
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}


```
![P13.webp](assest%2FP13.webp)
```java
import java.util.Scanner;
public class Thirteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=1;

        for(int i=1; i<=5;i++){
            for(int j=1;j<=i;j++){
                System.out.print(num + " ");
                num =num+1;
            }
            System.out.println();
        }
    }
    }
```
![P14.webp](assest%2FP14.webp)
```java
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
```
![P15.webp](assest%2FP15.webp)
```java
import java.util.Scanner;
public class Fifteen {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int num=5;
        for(int i=0;i<=num;i++){
            for(char j='A';j<='A'+(num-i-1);j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
```
![P16.webp](assest%2FP16.webp)

```java
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
```
![P17.webp](assest%2FP17.webp)
```java
import java.util.Scanner;
public class Seventeen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N= 5;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            for (int j = 0; j < N - i - 1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
```
![P18.webp](assest%2FP18.webp)
```java
import java.util.Scanner;
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
```
![P19.webp](assest%2FP19.webp)
```java










