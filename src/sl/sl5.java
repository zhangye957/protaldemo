package sl;

public class sl5 {
    public static void main(String[] args) {
        int age1=24;
        int age2=18;
        int age3=36;
        int age4=27;
        int sum=0,avg=0,minus=0,newAge=0,a=4;
        sum=age1+age2+age3+age4;
        avg=(age1+age2+age3+age4)/4;
        minus=age2-age1;
        newAge=age1;
        System.out.println("年龄总和:"+sum);
        System.out.println("平均年龄:"+avg);
        System.out.println("年龄差值:"+minus);
        System.out.println("自减后的年龄:"+newAge);
    }
}
