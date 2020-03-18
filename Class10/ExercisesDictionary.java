package Class10;

import Initial.Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class ExercisesDictionary {

    public static void main(String args[]){
        HashMap<Integer, String> lotteryNumbers = new HashMap<>();
        fillDictionaryWithLotteryNumbers(lotteryNumbers);

        System.out.println("********************************************");
        System.out.println("LOTTERY NUMBERS:");
        for (Integer entry: lotteryNumbers.keySet()) {
            System.out.println("Id: " + entry + " | Value: " + lotteryNumbers.get(entry));
        }

        System.out.println("********************************************");
        System.out.println();
        System.out.println("********************************************");
        System.out.println("FRIEND NAMES AND NICKNAMES:");

        HashMap<String, ArrayList<String>> names = new HashMap<>();
        fillDictionaryWithFriends(names);

        for (String name: names.keySet()) {
            System.out.println(name);
            for (String nickname: names.get(name)) {
                System.out.println("\t" + nickname);
            }
        }

        System.out.println("********************************************");
        System.out.println();
        System.out.println("********************************************");
        System.out.println("LIST OF NUMBERS");

        ArrayList<Integer> listOfNumbers = new ArrayList<>();
        fillListWithNumbers(listOfNumbers);

        for (Integer number: listOfNumbers) {
            System.out.println(number);
        }
        System.out.println("List sum is: "+ sumValues(listOfNumbers));

        System.out.println("********************************************");
        System.out.println();
        System.out.println("********************************************");
        System.out.println("HASH OF NUMBERS");

        HashSet<Integer> hashOfNumbers = new HashSet<>();
        fillHashWithNumbers(hashOfNumbers);

        for (Integer number: hashOfNumbers) {
            System.out.println(number);
        }
        System.out.println("Hash sum is: "+ sumValues(hashOfNumbers));

    }

    private static void fillDictionaryWithFriends(HashMap input){

        ArrayList<String> johnNickNames = new ArrayList<>();
        ArrayList<String> miguelNickNames = new ArrayList<>();
        ArrayList<String> maryNickNames = new ArrayList<>();
        ArrayList<String> lukeNickNames = new ArrayList<>();

        johnNickNames.add("Juan");
        johnNickNames.add("Fissura");
        johnNickNames.add("Maromba");

        miguelNickNames.add("Night Watch");
        miguelNickNames.add("Bruce Wayne");
        miguelNickNames.add("Tampinha");

        maryNickNames.add("Wonder Woman");
        maryNickNames.add("Mary");
        maryNickNames.add("Marilene");

        lukeNickNames.add("Lukinha");
        lukeNickNames.add("Jorge");
        lukeNickNames.add("George");

        input.put("John", johnNickNames);
        input.put("Miguel", miguelNickNames);
        input.put("Mary", maryNickNames);
        input.put("Luke", lukeNickNames);

    }

    private static void fillDictionaryWithLotteryNumbers(HashMap lotteryNumbers){

        lotteryNumbers.put(0, "Eggs");
        lotteryNumbers.put(1, "Water");
        lotteryNumbers.put(2, "Shotgun");
        lotteryNumbers.put(3, "Horse");
        lotteryNumbers.put(4, "Dentist");
        lotteryNumbers.put(5, "Fire");

    }

    private static void fillListWithNumbers(ArrayList<Integer> list){
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(8);

    }

    private static void fillHashWithNumbers(HashSet<Integer> list){
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(8);
        list.add(8);

    }

    private static int sumValues(HashSet<Integer> inputSet){
        ArrayList<Integer> newList = new ArrayList<Integer>(inputSet);
        return sumValues(newList);
    }

    private static int sumValues(ArrayList<Integer> inputSet){
        int result = 0;
        for (Integer number: inputSet) {
            result = result + number;
        }
        return result;
    }
}
