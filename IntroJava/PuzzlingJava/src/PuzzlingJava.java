import java.util.*;

public class PuzzlingJava {
    public ArrayList<Integer> func1(int[] array) {
        int sum = 0;
        ArrayList<Integer> array2 = new ArrayList<>();

        for(int i = 0; i < array.length; i++) {
           sum = sum + array[i];

           if(array[i] > 10) {
               array2.add(array[i]);
           }

        }
        System.out.println(sum);
        return array2;
    }

    public ArrayList<String> func2(String[] arr) {
        ArrayList<String> array = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(array);

        for(int i = 0; i < array.size(); i++) {

            System.out.println(array.get(i)); //print values from array3

            if(array.get(i).length() <= 5) {
                array.remove(i);
                i--;
            }
        }
        return array;
    }

    public void func3(String[] arr) {
        ArrayList<String> array = new ArrayList<>(Arrays.asList(arr));
        Collections.shuffle(array);
        String[] vowels = {"a", "e", "i", "o", "u"};

        System.out.println(array.get(array.size() - 1));

        System.out.println(array.get(0));

        if(Arrays.asList(vowels).contains(array.get(0))){
            System.out.println("This is a vowel");
        }

    }

}