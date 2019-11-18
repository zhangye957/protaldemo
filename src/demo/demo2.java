package demo;

import java.util.Scanner;
public class demo2 {
    public static void main(String[] args) {
        Scanner sr=new Scanner(System.in);
        int x=sr.nextInt();
        int y=sr.nextInt();
        ys(x,y);


    }
        public static void ys(int a,int b){
             int sum=0,jian=0,cheng=0,chu=0,q=0;
             sum=a+b;
             jian=a-b;
             cheng=a*b;
             chu=a/b;
             q=a%b;
            System.out.println(sum);
            System.out.println(jian);
            System.out.println(cheng);
            System.out.println(chu);
            System.out.println(q);
    }
}
