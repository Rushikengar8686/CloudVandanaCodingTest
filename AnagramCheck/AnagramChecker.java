import java.util.Arrays;
import java.util.Scanner;

public class AnagramChecker {
    public static boolean areAnagrams(String strOne, String strTwo) {
        if (strOne.length() != strTwo.length()) {
            return false;
        }
        char[] arr1 = strOne.toCharArray();
        char[] arr2 = strTwo.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first string: ");
        String strOne = scanner.nextLine();
        System.out.print("Enter second string: ");
        String strTwo = scanner.nextLine();
        scanner.close();

        if (areAnagrams(strOne, strTwo)) {
            System.out.println("Output: true");
        } else {
            System.out.println("Output: false");
        }
    }
}
