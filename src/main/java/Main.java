//import static org.junit.jupiter.api.Assertions.assertEquals;

//import org.junit.jupiter.api.Test;

public class Main {
    public static void main(String[] args) {
        // 1. Create an array of int called ages
        int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};

       
        int resultA = ages[ages.length - 1] - ages[0];
        System.out.println("Result a: " + resultA);

        // b. Create a new array with 9 elements and repeat the step above
        int[] extendedAges = new int[ages.length + 1];
        for (int i = 0; i < ages.length; i++) {
            extendedAges[i] = ages[i];
        }
        int resultB = extendedAges[extendedAges.length - 1] - extendedAges[0];
        System.out.println("Result b: " + resultB);

        // c. Calculate the average age
        int sum = 0;
        for (int age : ages) {
            sum += age;
        }
        double averageAge = (double) sum / ages.length;
        System.out.println("Average age: " + averageAge);

        // 2. Create an array of string called names
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};

        // a. Calculate the average number of letters per name
        double totalLetters = 0;
        for (String name : names) {
            totalLetters += name.length();
        }
        double averageLetters = totalLetters / names.length;
        System.out.println("Average number of letters per name: " + averageLetters);

        // b. Concatenate all names together
        StringBuilder concatenatedNames = new StringBuilder();
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        System.out.println("Concatenated names: " + concatenatedNames);

        // 3. How to access the last element of any array?
        // You can access the last element of any array by taking the length of the array and subtracting 1.

        // 4. How to access the first element of any array?
        // You can access the first element of any array by taking the index of 0.

        // 5. Create a new array of int called nameLengths
        int[] nameLengths = new int[names.length];
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }

        // 6. Calculate the sum of all elements in the nameLengths array
        int sumOfNameLengths = 0;
        for (int length : nameLengths) {
            sumOfNameLengths += length;
        }
        System.out.println("Sum of name lengths: " + sumOfNameLengths);

        // 7. This method concatenates a word n times
        System.out.println(concatenateWordNTimes("Hello", 3));

        // 8. This method returns full name
        System.out.println(getFullName("John", "Doe"));

        // 9. This method checks if sum of array elements is greater than 100
        int[] testArray = {20, 30, 50};
        System.out.println(isSumGreaterThan100(testArray));

        // 10. This method calculates average of elements in an array
        double[] testArray2 = {10.5, 20.5, 30.5};
        System.out.println(calculateAverage(testArray2));

        // 11. This method compares averages of two arrays
        double[] array1 = {10, 20, 30};
        double[] array2 = {15, 25, 35};
        System.out.println(isFirstAverageGreater(array1, array2));

        // 12. This method checks if to buy a drink
        System.out.println(willBuyDrink(true, 15.0));
    }

    // 7. Concatenate a word n times
    public static String concatenateWordNTimes(String word, int n) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        return result.toString();
    }

    // 8. Return full name
    public static String getFullName(String firstName, String lastName) {
        return firstName + " " + lastName;
    }

    // 9. Check if sum of array elements is greater than 100
    public static boolean isSumGreaterThan100(int[] array) {
        int sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum > 100;
    }

    // 10. Calculate average of elements in an array
    public static double calculateAverage(double[] array) {
        double sum = 0;
        for (double num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // 11. Compare averages of two arrays
    public static boolean isFirstAverageGreater(double[] array1, double[] array2) {
        double avg1 = calculateAverage(array1);
        double avg2 = calculateAverage(array2);
        return avg1 > avg2;
    }

    // 12. Check if to buy a drink
    public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
        return isHotOutside && moneyInPocket > 10.50;
    }

    // 13. Method: Find the longest name in an array of names
    // This method returns the longest name in an array of names
    public static String findLongestName(String[] names) {
        String longestName = "";
        for (String name : names) {
            if (name.length() > longestName.length()) {
                longestName = name;
            }
        }
        return longestName;
    }


    
  
}
