package demo;

import java.util.Scanner;
public class adf {
    public static void main(String[] args) {
        Scanner sr= new Scanner(System.in);
        int x=sr.nextInt();
        int y=sr.nextInt();
        px(x,y);
    }
    public static void px(int m,int n){
        for (int i=0;i<m;i++) {
            for (int j=1; j<=(n-i);j++)  {
                System.out.print(" ");
            }
            for(int j=0;j<=(m+1);j++){
                System.out.print("*");
                }
            System.out.println();
            }
        }
    }

