package level_6_kyu;

import java.util.List;
import java.util.Arrays;
import java.util.Objects;
import java.util.stream.Collectors;
/*
https://www.codewars.com/kata/550498447451fbbd7600041c

Given two arrays a and b write a function comp(a, b) (orcompSame(a, b)) that checks whether the two arrays
have the "same" elements, with the same multiplicities (the multiplicity of a member is the number of times
it appears). "Same" means, here, that the elements in b are the elements in a squared, regardless of the order.

Ex: First example does not work due to 36100 is not a valid square number of the "a" list elements
a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [121, 14641, 20736, 36100, 25921, 361, 20736, 361]

a = [121, 144, 19, 161, 19, 144, 19, 11]
b = [132, 14641, 20736, 361, 25921, 361, 20736, 361]

*/
public class AreSame {

    public static Boolean comp(int[] a, int[] b) {

        final boolean isNullVal =  (Objects.isNull(a) || Objects.isNull(b));
        if(isNullVal) return false;

        List<Integer> squaredSortedListA = Arrays.stream(a)
                .map(e -> e * e)
                .boxed() //boxed() converts int to Integer
                .sorted() //sorts the list
                .collect(Collectors.toList());

        List<Integer> sortedListB = Arrays.stream(b)
                .boxed()
                .sorted()
                .collect(Collectors.toList());

        return squaredSortedListA.equals(sortedListB);
    }



    public static void main(String[] args) {
        //test1
        int[] a = {2, 2, 3};
        int[] b = {4, 9, 9};

        //test2
        int[] e =  {121, 144, 19, 161, 19, 144, 19, 11};
        int[] d = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};

        //

        System.out.println("isSame ed: " + comp(e,d));
        System.out.println("isSame ab: " + comp(a,b));

    }

}









