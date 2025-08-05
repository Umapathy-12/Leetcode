import java.util.Scanner;

class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 || i % 5 == 0 || i % 7 == 0) {
                sum += i;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Solution a = new Solution();
        int n = scan.nextInt();
        System.out.println(a.sumOfMultiples(n));
    }
}
