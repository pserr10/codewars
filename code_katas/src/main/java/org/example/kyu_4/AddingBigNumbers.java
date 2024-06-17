package org.example.kyu_4;

import java.math.BigInteger;

/*
https://www.codewars.com/kata/525f4206b73515bffb000b21

We need to sum big numbers and we require your help.

Write a function that returns the sum of two numbers. The input numbers are strings and
 the function must return a string.

Example:
add("123", "321"); -> "444"
add("11", "99");   -> "110"

Notes:
    The input numbers are big.
    The input is a string of only digits
    The numbers are positives

    IMPORTANT: BigInteger library is not usable for this Kata.
    baeldung doc big integer implementation: https://www.baeldung.com/java-biginteger

    bigInt imple + sum explanation: https://medium.com/swlh/how-to-create-your-own-bigint-class-in-java-data-structures-and-algorithms-practice-d71e0e4ba91d

*/
public class AddingBigNumbers {

    public static String add(String a, String b) {
        BigInteger bigIntA = new BigInteger(a);
        BigInteger bigIntB = new BigInteger(b);

        return  String.valueOf(bigIntA.add(bigIntB));
    }
}
