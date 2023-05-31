import java.util.Arrays;

public class Anagram {

    public boolean areAnagrams(String phrase1, String phrase2) {

        if (phrase1.equals(phrase2)){
            return false;
        }

        char[] readyToAnagram = phrase2
                .toLowerCase()
                .replace(" ", "")
                .replace("'","")
                .replace("-","")


                .toCharArray();
        Arrays.sort(readyToAnagram);

        char[] readyToAnagram1 = phrase1
                .toLowerCase()
                .replace(" ", "")
                .replace("'","")
                .replace("-","")

                .toCharArray();
        Arrays.sort(readyToAnagram1);

        return Arrays.equals(readyToAnagram1, readyToAnagram);


    }

}
