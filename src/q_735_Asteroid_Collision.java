import java.util.Arrays;
import java.util.Scanner;

public class q_735_Asteroid_Collision {
    public static int[] asteroidCollision(int[] asteroids) {
        int index = -1;
        for (int currentAsteroid : asteroids) {
            boolean currentAsteroidIsUndestroyed = true;
            while (currentAsteroidIsUndestroyed && index >= 0 && asteroids[index] > 0 && currentAsteroid < 0) {
                currentAsteroidIsUndestroyed = currentAsteroid + asteroids[index] < 0;
                if (currentAsteroid + asteroids[index] <= 0) {
                    --index;
                }
            }
            if (currentAsteroidIsUndestroyed) {
                asteroids[++index] = currentAsteroid;
            }
        }
        return Arrays.copyOfRange(asteroids, 0, index + 1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of array: ");
        int len = sc.nextInt();
        int[] nums = new int[len];
        for (int i = 0; i < nums.length; i++) {
            System.out.print("Enter the " + i + "th value: ");
            nums[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(asteroidCollision(nums)));
    }
}
