package Class10;

import Initial.Array;

import java.util.ArrayList;

public class ExerciseError {
    public static void main(String args[]){
        ArrayList<String> list = new ArrayList<>();
        list.add("Duck");
        list.add("Dog");
        list.add("Cat");

        try {
            System.out.println(list.get(3));
        }catch (IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }

        ArrayList<String> nullArrayList = null;

        try {
            nullArrayList.add("Duck");
            nullArrayList.add("Dog");
            nullArrayList.add("Cat");

            System.out.println(nullArrayList.get(2));
        }catch (NullPointerException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }

        ArrayList<String> notNullArrayList = new ArrayList<>();

        try {
            notNullArrayList.add("Duck");
            notNullArrayList.add("Dog");
            notNullArrayList.add("Cat");

            System.out.println(notNullArrayList.get(5));
        }catch (NullPointerException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }catch (IndexOutOfBoundsException exception){
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }

        try {
            System.out.println(divideNumbers(4,0));
        }catch (ArithmeticException exception) {
            System.out.println(exception.getMessage());
            System.out.println(exception.getStackTrace());
        }
    }

    private static int divideNumbers(int numberA, int numberB){
        return numberA/numberB;
    }
}

