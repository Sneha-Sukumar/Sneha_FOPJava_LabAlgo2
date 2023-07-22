import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // Get the number of transactions
    System.out.print("Enter the size of transaction array: ");
    int n = sc.nextInt();

    // Get the values of the transactions
    int[] transactions = new int[n];
    System.out.println("Enter the values of array:");
    for (int i = 0; i < n; i++) {
      transactions[i] = sc.nextInt();
    }

    // Get the number of targets
    System.out.print("Enter the total no of targets that needs to be achieved: ");
    int m = sc.nextInt();

    // For each target, check if it can be achieved
    for (int i = 0; i < m; i++) {
      System.out.print("Enter the value of target: ");
      int target = sc.nextInt();

      // Check if the target is achievable
      int sum = 0;
      for (int j = 0; j < n; j++) {
        sum += transactions[j];
        if (sum >= target) {
          System.out.println("Target achieved after " + (j+1) + " transactions");
          break;
        }
      }

      // If the target is not achievable, print a message
      if (sum < target) {
        System.out.println("Given target is not achieved");
      }
    }
  }
}