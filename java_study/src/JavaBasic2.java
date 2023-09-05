import java.math.BigDecimal;
import java.math.BigInteger;

public class JavaBasic2 {
    public static void main(String [] args){
        //increment();
        calcul();
        shift();
        bigNumbers();
    }
    public static void increment(){


        String[] strs = {"Java", "Study"};
        int idx1 = 0;
        int idx2 = 0;

        System.out.println("idx1 = " + idx1);
        System.out.println("idx2 = " + idx2);
        System.out.println("out with idx1++=" + strs[idx1++]);
        System.out.println("out with ++idx2=" + strs[++idx2]);
        System.out.println("idx1 = " + idx1);
        System.out.println("idx2 = " + idx2);

        double num = Math.pow(2,5);
        double x = 42;

    }
    public static void calcul(){
        int n = 0;
        int s = 10;
        //boolean cal = s+(100-s)/n < 50 && n!=0;
        boolean cal = n!=0 && s+(100-s)/n < 50 ;
        System.out.println(cal);

    }

    public static void shift(){
        int num1 = 0xFFFFFFFF;
        int num2 = num1 >> 1;
        //0x11111111
        int num3 = num1 >>> 1;
        int num4 = num1 << 1;

        System.out.println(num2);
        System.out.println(num3);
        System.out.println(num4);
    }

    public static void bigNumbers() {
        BigInteger n1 = BigInteger.valueOf(9_223_372_036_854_775_807L);
        BigInteger n2 = new BigInteger("9223372036854775807");
        //long n3 = 9_223_372_036_854_775_807L;
        //BigInteger sum2 = n2.add(n2);


        BigInteger sum = n1.add(n2);
        System.out.println(sum);

        BigDecimal d1 = BigDecimal.valueOf(2, 0);
        BigDecimal d2 = BigDecimal.valueOf(11, 1);
        BigDecimal sub = d1.subtract(d2);
        System.out.println(sub);
    }

}