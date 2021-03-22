import java.util.Scanner;

public class E36EqualSums {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] input = scanner.nextLine().split(" ");
        int[] numbers = new int[input.length];

        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        boolean isEqualsFromTheTwoSums = false;
        int index = 0;

        for (int i = 0; i < numbers.length; i++) {

            int leftSum = 0;
            for (int j = 0; j < i; j++) {
                leftSum += numbers[j];
            }

            int rightSum = 0;
            for (int j = i + 1; j < numbers.length; j++) {
                rightSum += numbers[j];

            }
            if (rightSum == leftSum) {
                isEqualsFromTheTwoSums = true;
                index = i;
                break;

            }
        }
        if (isEqualsFromTheTwoSums) {
            System.out.println(index);
        } else {
            System.out.println("no");
        }
    }
}

