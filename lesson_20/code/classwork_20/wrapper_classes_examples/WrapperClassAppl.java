package classwork_20.wrapper_classes_examples;

import java.math.BigInteger;

public class WrapperClassAppl {

    public static void main(String[] args) {

     int k = 1234567890;
        System.out.println(k);
        System.out.println("-----------");

        Integer integer = Integer.parseInt("1234567890"); //77 vytoscili integer iz stroki
        System.out.println(integer);
        integer = integer + 15;
        System.out.println(integer);

        int value1=123;
        Integer a = new Integer(value1);
        System.out.println(value1);
        System.out.println("--------------");

        // avtoupakovka  upakovali v objekt
        Integer x = 5;
        System.out.println(x * 10);

        // avtoraspokovka
        integer = 7;
        int z = x + integer;  // dve peremennyh u kotoryh objavlen tip integer
        System.out.println(z); // 5+7 = 12

        System.out.println("-------------");
        BigInteger myBigInt = new BigInteger("1234567890");// peredajetsia string
        System.out.println(myBigInt);

        //kol-vo cifr v cisle
        int b = 1234567890;
        Integer bInt = b;
        // smena tipa
        String str = myBigInt.toString();
        int l = str.length();




        System.out.println("Number:" + b + " contains " + l + " digits");

        System.out.println("------------");
        System.out.println("Max valume of int:" + bInt.MAX_VALUE);
        System.out.println("Max valume of int:");

        Double d = 0.0;
        System.out.println("Max valume of double:" + d.MAX_VALUE);
        System.out.println("Min valume of double:" + d.MAX_VALUE);

        System.out.println("-----------");

        int n = 20; // 20 TIP INT
        Integer m = 10; //10  UPAKAVALI V INTEGER

        m = m + n;
        System.out.println(m);
        n = n + m;
        System.out.println(n + 1);

        Double pi = 3.14;
        double circleLenth = 2 * pi * 10;
        System.out.println(circleLenth);

        System.out.printf("Length of circle: %2f", circleLenth);
        System.out.println();

        System.out.println("----------------------------");

        double p = 20 / 0.0;

        // Doubel s bolsoj bukvy tip i metod
        if(Double.isNaN(p) || Double.isInfinite(p)){ // POSLE TOCKI METOD
            System.out.println("Wrong operation, division by Zero");
        } else System.out.println(p);

        System.out.println("--------------------");
        //perevod String v cisle
        String str1 = "0098765432100";
        long num = Long.parseLong(str1);
        System.out.println(num);

        System.out.println();





        }


    }




