import java.util.Scanner;

public class Strings {

    // String is IMMUTABLE in java

    public static void pringAllChar(String str) {
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i) + " ");
        }
        System.out.println();
    }

    public static boolean isPalindrome(String str) {
        for (int i = 0; i < str.length() / 2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static float shortestPath(String str) {
        int x = 0;
        int y = 0;

        for (int i = 0; i < str.length(); i++) {
            char dir = str.charAt(i);
            if (dir == 'S') {
                y--;
            } else if (dir == 'E') {
                x++;
            } else if (dir == 'N') {
                y++;
            } else {
                x--;
            }
        }
        int x2 = x * x;
        int y2 = y * y;
        return (float) Math.sqrt(x2 + y2);
    }

    public static String toUpperCaseString(String str) {
        StringBuilder sb = new StringBuilder("");

        char ch = Character.toUpperCase(str.charAt(0));
        sb.append(ch);
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) == ' ' && i < str.length() - 1) {
                sb.append(str.charAt(i));
                i++;
                sb.append(Character.toUpperCase(str.charAt(i)));
            } else {
                sb.append(str.charAt(i));
            }
        }
        return sb.toString();
    }

    public static String stringCompresion(String str) {

        StringBuilder newStr = new StringBuilder("");

        for (int i = 0; i < str.length(); i++) {
            Integer count = 1;
            while (i < str.length() - 1 && str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }
            newStr.append(str.charAt(i));
            if (count > 1) {
                newStr.append(count.toString());
            }
        }
        return newStr.toString();
    }

    public static void main(String[] args) {
        // char myChar[] = { 'a', 'b', 'c' };
        // String str = "abcd";
        // String str2 = new String("abcd");

        // Scanner sc = new Scanner(System.in);
        // String name;
        // name = sc.nextLine();

        // System.out.println("Your input name is : " + name);

        // String fullName = "Arpan Chakma";
        // System.out.println(fullName.length());

        // concatenation
        // String firstName = "Arpan";
        // String lastName = "Chakma";
        // String fullName = firstName + " " + lastName;

        // System.out.println(fullName);
        // pringAllChar(fullName);

        // String str = "noon";
        // String str2 = "Arpan";
        // System.out.println(isPalindrome(str2));
        // String path = "WNEENESENNN";
        // System.out.println(shortestPath(path));

        // String subStr = "substring";
        // System.out.println(subStr.substring(0, 3));

        // String str = "hello, i am arpan chakma";
        // System.out.println(toUpperCaseString(str));

        String str = "aaabbbbccd";
        System.out.println(stringCompresion(str));

    }
}
