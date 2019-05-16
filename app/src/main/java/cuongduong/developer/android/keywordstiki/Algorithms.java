package cuongduong.developer.android.keywordstiki;

import java.util.ArrayList;

public class Algorithms {
    public static ArrayList<String> displayKeywordsInTwoLines(String[] keywordsArray) {
        ArrayList<String> keywords = new ArrayList<>();

        for (String keyword : keywordsArray) {

            if (checkMoreThanOneWord(keyword)) {

                ArrayList<String> allCasesWords = getAllCaseWordsInTwoLines(keyword.split(" "));
                String keywordLessDifference = getKeywordLessDifference(allCasesWords);
                keywords.add(keywordLessDifference);

            } else {
                keywords.add(keyword);
            }
        }
        return keywords;
    }

    private static boolean checkMoreThanOneWord(String s) {
        if (!s.contains(" "))
            return false;
        else
            return true;
    }

    private static ArrayList<String> getAllCaseWordsInTwoLines(String[] keyword) {
        ArrayList<String> listString = new ArrayList<>();

        for (int i = 0; i < keyword.length - 1; i++) {
            String str = new String();
            for (int j = 0; j < keyword.length; j++) {
                if (j == i) {
                    str += keyword[j] + "\n";
                } else {
                    str += keyword[j] + " ";
                }
            }
            listString.add(str.trim());
        }
        return listString;
    }

    private static String getKeywordLessDifference(ArrayList<String> allCasesWord) {
        int[] intArray = new int[allCasesWord.size()];

        for (int i = 0; i < allCasesWord.size(); i++) {
            int count = countDifference(allCasesWord.get(i));
            intArray[i] = count;
        }

        int minValueIndex = getIndexOfMinDifferenceValue(intArray);

        return allCasesWord.get(minValueIndex);
    }

    private static int countDifference(String s) {
        String[] str = s.split("\n");
        int differentLength = Math.abs(str[0].length() - str[1].length());
        return differentLength;
    }

    private static int getIndexOfMinDifferenceValue(int[] numbers) {
        int minValue = numbers[0];
        int index = 0;
        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < minValue) {
                minValue = numbers[i];
                index = i;
            }
        }
        return index;
    }
}
