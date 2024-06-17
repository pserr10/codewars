package org.example.CMAS;

import java.util.ArrayList;

/*prints out the following for a contiguous range of numbers:
'CMAS' for numbers that are multiples of 3,
'systems' for numbers that  are multiples of 5,
'CMASsystems' for numbers that are multiples of 15,
 e.g. if I run  the program over a range from 1-20
 I should get the following output:
 1 2 CMAS 4 systems CMAS 7 8 CMAS systems 11 CMAS 13 14 CMASsystems 16 17 CMAS 19 systems.*/
public class TechnicalStepOne {
    static final String CMAS = "CMAS";
    static final String SYSTEMS = "systems";
    static final String CMAS_SYSTEMS = "CMASsystems";
    public static void main(String[] args){

        int[] inputArr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        System.out.println(stepOne(inputArr));
    }

//int[] numbersRange
    private static ArrayList<String> stepOne(int[] inputArr){
        ArrayList<String> resultStepOne = new ArrayList<>();

        for(int number : inputArr){
            final boolean isMultipleThree = number % 3 == 0;
            final boolean isMultipleFive = number % 5 == 0;
            final boolean isMultipleFifteen = number % 15 == 0;

            //add numbers that do not go into problem condition
            if(!isMultipleThree && !isMultipleFive && !isMultipleFifteen) resultStepOne.add(String.valueOf(number));

            //take care of multiples
            if(isMultipleThree) resultStepOne.add(CMAS);

            else if (isMultipleFive) resultStepOne.add(SYSTEMS);

            else if (isMultipleFifteen) resultStepOne.add(CMAS_SYSTEMS);

        }
        return resultStepOne;
    }

    private static ArrayList<String> stepTwo(int[] inputArr){
        ArrayList<String> resultStepTwo = new ArrayList<>();
    }
}
