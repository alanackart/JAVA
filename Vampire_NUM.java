package com.company;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;



class HalfNum{
    BigInteger a;
    BigInteger b;
}

public class Main {
    static List<HalfNum> numbers = new ArrayList<>();

    public static void  checkMult(BigInteger n, HalfNum h){
        BigInteger s = n.sqrt();
//        System.out.println(s);
        if(s.compareTo(h.a) >= 0  && s.compareTo(h.b) <= 0  && h.a.multiply(h.b).compareTo(n) == 0){
          //  System.out.println("get result");
            numbers.add(h);
        }


    }
    public static void parsePermStr(BigInteger n, String str){
            HalfNum t = new HalfNum();
            t.a = new BigInteger(str.substring(0, str.length()/2));

            // System.out.println(str.substring(0, str.length()/2));
//         System.out.print(t.a + ",");
          t.b = new BigInteger(str.substring(str.length()/2, str.length() ));
//          System.out.print(t.b+ ",");
//          System.out.println(t.flag);
     //   System.90out.println(str.substring(str.length()/2, str.length()));
     //   System.out.println(t.a + "," + t.b);
        checkMult(n, t);
    }


    private static void permutation(BigInteger m, String prefix, String str) {
        int n = str.length();
        if (n == 0) {
           // System.out.println(prefix);
            parsePermStr(m, prefix);
        }
        else {
            for (int i = 0; i < n; i++)
                permutation(m, prefix + str.charAt(i), str.substring(0, i) + str.substring(i+1, n));
        }
    }

    public static void main(String[] args) {

            for (BigInteger i = new BigInteger("100000"); i.compareTo(new BigInteger("999900")) <= 0; ) {

                permutation(i, "", i.toString());

                if (numbers.size() >= 1) {
                    System.out.println(i);
                    //  System.out.println(numbers.size());
                    HashSet<String> set = new HashSet<String>();
                    for (HalfNum n : numbers) {
                        if (set.add(n.a.toString() + n.b.toString())) {  /*distincit*/
                            System.out.println(n.a + "*" + n.b);
                        }
                    }
                    numbers.clear();
                }
                i = i.add(new BigInteger("1"));
            }
        }
    }
    
    /*吸血鬼数*/


