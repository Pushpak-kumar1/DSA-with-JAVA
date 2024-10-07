
public class Largest {
    public static int largesNumber(int numbers[]) {
        int largest = Integer.MAX_VALUE;
       // int largest = 0;
        for (int i=0; i<numbers.length; i++) {
            if (largest > numbers[i]) {
                largest = numbers[i];
            }
        }
        return largest;
    }
    public static void main (String args[]) {
        int numbers[] = {2, 5, 18, 19, 56, 1, 6, 8};

        System.out.println(largesNumber(numbers));
    }
}
