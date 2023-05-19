public class ArrayBasics {

    public static void reverseArray(int num[]) {
        int first = 0;
        int last = num.length - 1;
        while (first < last) {
            int temp = num[last];
            num[last] = num[first];
            num[first] = temp;
            first++;
            last--;
        }
    }

    public static void pairArray(int num[]) {
        for (int i = 0; i < num.length; i++) {
            int cur = num[i];

            for (int j = (i + 1); j < num.length; j++) {
                System.out.print("( " + cur + ", " + num[j] + ")");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int myNumArr[] = { 10, 4, 3, 6 };
        // reverseArray(myNumArr);
        // for (int i = 0; i < myNumArr.length; i++) {
        // System.out.print(myNumArr[i] + " ");
        // }
        // System.out.println();

        pairArray(myNumArr);
    }

}
