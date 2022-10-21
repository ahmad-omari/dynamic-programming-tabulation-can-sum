/**
 * @author : Ahmad Al-Omari
 * @mailto : alomari.ah98@gmail.com
 * @created : 10/22/2022, Saturday
 * @project : dynamic-programming-tabulation-can-sum
 **/
public class CanSum {

    public static boolean canSum(int target, int[] numbers) {
        boolean[] array = new boolean[target + 1];
        array[0] = true;

        for (int i = 0; i < array.length; i++) {
            if (array[i]) {
                for (int num : numbers) {
                    if ((i + num) < array.length)
                        array[i + num] = true;
                }
            }
        }
        return array[target];
    }

    public static void main(String[] args) {
        System.out.println(canSum(7, new int[]{2, 3}));
        System.out.println(canSum(7, new int[]{5, 3, 4, 7}));
        System.out.println(canSum(7, new int[]{2, 4}));
        System.out.println(canSum(8, new int[]{2, 3, 5}));
        System.out.println(canSum(300, new int[]{7, 14}));
    }
}
