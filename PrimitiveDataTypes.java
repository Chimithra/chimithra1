package com.company.Pract;

import java.math.BigInteger;
import java.util.*;
import java.util.function.*;
import java.util.stream.*;

class Datas{
    void Min_Max(){
        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;
        System.out.println("byteMin : "+byteMin);
        System.out.println("byteMax : "+ byteMax);
        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;
        System.out.println("shortMin : "+shortMin);
        System.out.println("shortMax : "+ shortMax);
        char charMin = Character.MIN_VALUE;
        char charMax = Character.MAX_VALUE;
        System.out.println("charMin : "+charMin);
        System.out.println("charMax : "+ charMax);
        int integerMin = Integer.MIN_VALUE;
        int integerMax = Integer.MAX_VALUE;
        System.out.println("integerMin : "+integerMin);
        System.out.println("integerMax : "+ integerMax);
        float floatMin= Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;
        System.out.println("floatMin : "+floatMin);
        System.out.println("floatMax : "+ floatMax);
        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;
        System.out.println("doubleMin : "+doubleMin);
        System.out.println("doubleMax : "+ doubleMax);
        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;
        System.out.println("longMin : "+longMin);
        System.out.println("longMax : "+ longMax);
    }
    void arrayToStream(){
        int [] arr = new int [] {24, 56, 34, 57};
        IntStream stream = IntStream.of(arr);
        stream.forEach(n -> System.out.println(n));
    }
    void streamToArray(){
        Stream<String> stream = Stream.of("chimi","charu");
        String [] strArr = stream.toArray(String [] :: new);
        Arrays.asList(strArr).forEach(n -> System.out.println(n));
    }
}
public class PrimitiveDataTypes {
    public static void main(String[] args) {
        Datas d = new Datas();
        d.Min_Max();
        d.streamToArray();
        d.arrayToStream();
    }
}
