package dad.codesignal;

public class TheJourneyBegins {

    int add(int param1, int param2) {
        return param1 + param2;
    }

    int centuryFromYear(int year) {
        return (year - 1) / 100 + 1;
    }

    boolean checkPalindrome(String inputString) {
        for(int i = 0; i < inputString.length(); i++) {
            if (inputString.charAt(i) != inputString.charAt(inputString.length() - 1 - i))
                return false;
        }

        return true;
    }

    int adjacentElementsProduct(int[] inputArray) {
        int max = inputArray[0] * inputArray[1];

        for (int i = 1; i < inputArray.length - 1; i++) {
            int mul = inputArray[i] * inputArray[i + 1];
            if (mul > max)
                max = mul;
        }
        return max;
    }

    int shapeArea(int n) {
        int sum = 1;
        int lastAdd = 4;

        for (int i = 0; i < n - 1; i++) {
            sum += lastAdd;

            lastAdd += 4;
        }

        return sum;
    }

    int makeArrayConsecutive(int[] statues) {
        int min = statues[0];
        int max = statues[0];

        for (int i = 1; i < statues.length; i++) {
            if (statues[i] < min) {
                min = statues[i];
            } else if (statues[i] > max) {
                max = statues[i];
            }
        }

        int difference = max - min;

        return difference - statues.length + 1;
    }

}
