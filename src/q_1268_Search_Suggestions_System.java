import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class q_1268_Search_Suggestions_System {
    static List<List<String>> ans;

    public static void prod(String[] products, int i, int j, String searchWord, int k) {
        if (k == searchWord.length()) {
            return;
        }
        if (i > j) {
            List<String> cur = new ArrayList<>();
            ans.add(cur);
            prod(products, i, j, searchWord, ++k);
            return;

        }
        char ch = searchWord.charAt(k), ch2;
        int start = i, mid;
        int end = j;
        while (i < j) {
            mid = (i + j) / 2;
            String s = products[mid];
            if (s.length() > k) {
                ch2 = products[mid].charAt(k);
                if (ch2 == ch) {
                    i = mid;
                    j = mid;
                    break;
                } else if (ch2 > ch) {
                    j = mid - 1;
                } else {
                    i = mid + 1;
                }
            } else {
                break;
            }
        }
        while (i >= start) {
            String s = products[i];
            if (s.length() > k) {
                ch2 = s.charAt(k);
                if (ch2 == ch) {
                    i--;
                } else {
                    break;
                }
            } else {
                break;
            }
        }
        i++;
        while (j <= end) {
            String s = products[j];
            if (s.length() > k) {
                ch2 = s.charAt(k);
                if (ch2 == ch) {
                    j++;
                } else {
                    break;
                }
            } else {
                break;
            }

        }
        j--;
        int count = 0;
        List<String> cur = new ArrayList<>();
        int p = i;
        while (i <= j && count < 3) {
            cur.add(products[i++]);
            count++;
        }
        ans.add(cur);
        prod(products, p, j, searchWord, ++k);
    }

    public static List<List<String>> suggestedProducts(String[] products, String searchWord) {
        Arrays.sort(products);
        ans = new ArrayList<>();
        prod(products, 0, products.length - 1, searchWord, 0);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of array: ");
        int len = sc.nextInt();
        String[] arr = new String[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.next();
        }
        System.out.print("Enter the search word: ");
        String sw = sc.next();
        System.out.println(suggestedProducts(arr, sw));
    }
}
