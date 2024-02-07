import java.util.*;

public class q_49_Group_Anagrams {
    public static List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String s : strs) {
            char[] tmp = s.toCharArray();
            Arrays.sort(tmp);
            String key = new String(tmp);
            if (!map.containsKey(key)) {
                map.put(key, new ArrayList<>());
            }
            map.get(key).add(s);
        }
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of String array: ");
        int len = sc.nextInt();
        String[] arr = new String[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter the value of " + i + " element of the array: ");
            arr[i] = sc.next();
        }
        System.out.println(groupAnagrams(arr));
    }
}
