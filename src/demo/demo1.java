package demo;

import java.util.Scanner;
public class demo1 {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        int a=sr.nextInt();
        if(a==1||a==2){
            System.out.println("这个是质数");
            return;
        }
        int sum,i=0;
        for(sum=1;sum<=a;sum++) {
            if (a % sum == 0) {
                i++;
            }
        }if(i==2){
            System.out.println("这个是质数");
        }else
            System.out.println("这个不是质数");
    }
}
