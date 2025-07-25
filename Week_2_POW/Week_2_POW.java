import java.util.*;
public class Week_2_POW {

    //Question 1 => Longest Common Subsequence of Three Strings.
    // public static int lcsOfThree(String S1, String S2, String S3) {
    //     int len1 = S1.length();
    //     int len2 = S2.length();
    //     int len3 = S3.length();

    //     int[][][] dp = new int[len1 + 1][len2 + 1][len3 + 1];

    //     for (int i = 1; i <= len1; i++) {
    //         for (int j = 1; j <= len2; j++) {
    //             for (int k = 1; k <= len3; k++) {
    //                 if (S1.charAt(i - 1) == S2.charAt(j - 1) && S1.charAt(i - 1) == S3.charAt(k - 1)) {
    //                     dp[i][j][k] = dp[i - 1][j - 1][k - 1] + 1;
    //                 } else {
    //                     dp[i][j][k] = Math.max(
    //                         dp[i - 1][j][k],
    //                         Math.max(dp[i][j - 1][k], dp[i][j][k - 1])
    //                     );
    //                 }
    //             }
    //         }
    //     }

    //     return dp[len1][len2][len3];
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     System.out.print("Enter 1st String : ");
    //     String S1 = scanner.nextLine().trim();
    //     System.out.print("Enter 2nd String : ");
    //     String S2 = scanner.nextLine().trim();
    //     System.out.print("Enter 3rd String : ");
    //     String S3 = scanner.nextLine().trim();

    //     System.out.println("Output : " + lcsOfThree(S1, S2, S3));
    // }


    //Question 2 => Smallest Non-Representable Sum.
    // public static int findSmallestNonRepresentableSum(int[] arr) {
    //     long res = 1;  

    //     for (int coin : arr) {
    //         if (coin > res) {
    //             break;
    //         }
    //         res += coin;
    //     }

    //     return (int) res;
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);
    //     String[] inputStr = scanner.nextLine().trim().split(" ");
    //     int n = inputStr.length;
    //     int[] coins = new int[n];
        
    //     for (int i = 0; i < n; i++) {
    //         coins[i] = Integer.parseInt(inputStr[i]);
    //     }

    //     System.out.println("Output : " + findSmallestNonRepresentableSum(coins));
    // }


    //Question 3 => Step Words Finder.
    // private static int[] getCharCounts(String word) {
    //     int[] counts = new int[26];
    //     for (char c : word.toCharArray()) {
    //         counts[c - 'a']++;
    //     }
    //     return counts;
    // }
    // private static boolean isStepWord(String base, int[] baseCounts, String word) {
    //     if (word.length() != base.length() + 1) return false;

    //     int[] wordCounts = getCharCounts(word);

    //     int diffCount = 0;

    //     for (int i = 0; i < 26; i++) {
    //         int diff = wordCounts[i] - baseCounts[i];

    //         if (diff < 0 || diff > 1) return false; 
    //         if (diff == 1) diffCount++;
    //     }

    //     return diffCount == 1;
    // }

    // public static void main(String[] args) {
    //     Scanner scanner = new Scanner(System.in);

    //     String baseWord = scanner.nextLine().trim();
    //     int N = Integer.parseInt(scanner.nextLine().trim());

    //     int[] baseCounts = getCharCounts(baseWord);

    //     List<String> stepWords = new ArrayList<>();

    //     for (int i = 0; i < N; i++) {
    //         String dictWord = scanner.nextLine().trim();
    //         if (isStepWord(baseWord, baseCounts, dictWord)) {
    //             stepWords.add(dictWord);
    //         }
    //     }

    //     Collections.sort(stepWords);

    //     for (String word : stepWords) {
    //         System.out.println(word);
    //     }

    //     scanner.close();
    // }
}
