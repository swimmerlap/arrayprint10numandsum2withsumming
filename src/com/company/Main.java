// Create an array to hold the numbers 1-10. this program also sum. the previous program called arrayprint10numandsum
//doesnot sum although the program name says it does


package com.company;

public class Main {

    public static void main(String[] args) {



        int[] arrayNums;
        arrayNums = new int[10];


        arrayNums[0]=1;
        arrayNums[1]=2;
        arrayNums[2]=3;
        arrayNums[3]=4;
        arrayNums[4]=5;
        arrayNums[5]=6;
        arrayNums[6]=7;
        arrayNums[7]=8;
        arrayNums[8]=9;
        arrayNums[9]=10;


        for(int index=0; index< arrayNums.length; index++){

            System.out.println(arrayNums[index]);
        }

        int sum=0;
        for(int num:arrayNums ){
            sum = sum+num;
        }
        System.out.println ("Sum of array elements is: " +sum);

    }
}
