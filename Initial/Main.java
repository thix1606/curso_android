package Initial;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        //creating a integer variable
        int aNumberA = 11;

        //creating a double variable
        double aNumberB = 1.0;

        //creating a string variable
        String aCharChain = "Example text";

        //creating a boolean variable
        boolean bool = false;

        //creating a double array list
        List<Double> doubleArrayList = new ArrayList<>();
        doubleArrayList.add(10.0);
        doubleArrayList.add(20.0);
        doubleArrayList.add(30.0);
        doubleArrayList.add(40.0);
        doubleArrayList.add((double) aNumberA);
        doubleArrayList.add(aNumberB);

        //printing a string variable on console
        System.out.println("printing variable aCharChain on console");
        System.out.println(aCharChain);

        //printing variable umNumberA on console
        System.out.println("printing variable umNumberA on console");
        System.out.println(aNumberA);

        //printing variable umNumberB on console
        System.out.println("printing variable umNumberB on console");
        System.out.println(aNumberB);

        //using method addTwoNumbers and printing result
        System.out.println("using method addTwoNumbers and printing result");
        System.out.println(addTwoNumbers(aNumberA, aNumberB));

        //using method subtractTwoNumbers and printing result
        System.out.println("using method subtractTwoNumbers and printing result");
        System.out.println(subtractTwoNumbers(aNumberA, aNumberB));

        //using method compareTwoNumbers and printing result
        System.out.println("using method compareTwoNumbers and printing result");
        System.out.println(compareTwoNumbers(aNumberA, aNumberB));

        //using method isNumberOddAndBiggerThan10 and printing result
        System.out.println("using method isNumberOddAndBiggerThan10 and printing result");
        System.out.println(isNumberOddAndBiggerThan10(aNumberA));

        //using method sumDoubleArrayList and printing result
        System.out.println("using method sumDoubleArrayList and printing result");
        System.out.println(sumDoubleArrayList(doubleArrayList));

        //using method sumDoubleArrayListIfEven and printing result
        System.out.println("using method sumDoubleArrayListIfEven and printing result");
        System.out.println(sumDoubleArrayListIfEven(doubleArrayList));

        //using method filterEvenEntriesOfDoubleArrayList and printing result
        System.out.println("using method filterEvenEntriesOfDoubleArrayList and printing result");
        System.out.println("initial array:");
        System.out.println(Arrays.toString(filterEvenEntriesOfDoubleArrayList(doubleArrayList).toArray()));
        System.out.println("result array:");
        System.out.println(Arrays.toString(doubleArrayList.toArray()));

    }

    //creating a method that adds two numbers
    public static double addTwoNumbers(int numberA, double numberB) {
        return numberA + numberB;
    }

    //creating a method that subtracts two numbers
    public static double subtractTwoNumbers(int numberA, double numberB) {
        return numberA - numberB;
    }

    //creating a method that compares two numbers and tells which is higher
    private static String compareTwoNumbers(double numberA, double numberB){
        if(numberA == numberB){
            return  "numbers are equal";
        }else if(numberA > numberB){
            return "number A is bigger than number B";
        }else{
            return "number B is bigger than number A";
        }
    }

    //creating a method that checks if number is odd and bigger than 10
    private static boolean isNumberOddAndBiggerThan10(double number){
        if(number <= 10){
            return  false;
        }else if(number % 2 == 0){
            return false;
        }else{
            return true;
        }
    }

    //creating a method that sums a double array list
    private static double sumDoubleArrayList(List<Double> doubleArrayList){
        Double result = 0.0;
        for (Double item:doubleArrayList) {
            result = result + item;
        }
        return result;
    }

    //creating a method that sums a double array list if items are even
    private static double sumDoubleArrayListIfEven(List<Double> doubleArrayList){
        Double result = 0.0;
        for (Double item:doubleArrayList) {
            if(item % 2 == 0){
                result = result + item;
            }
        }
        return result;
    }

    //creating a method that filters even items of received array list
    private static List<Double> filterEvenEntriesOfDoubleArrayList(List<Double> doubleArrayList){
        List<Double> result = new ArrayList<>();

        for (Double item:doubleArrayList) {
            if(item % 2 == 0){
                result.add(item);
            }
        }
        return result;
    }

}