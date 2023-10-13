import java.util.Random;

class ArrayShuffle {
    public static void main(String[] args) {
        int[] a = { 8, 6, 1, 4, 5, 2, 3, 7 };

        shuffleArray(a);

        for (int value : a) {
            System.out.print(value + " ");
        }
    }

    public static void shuffleArray(int[] array) {
        int n = array.length;
        Random random = new Random();

        for (int i = n - 1; i > 0; i--) {

            int j = random.nextInt(i + 1);

            int temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }

    public String romanToInt(String inputRoman) {
        return null;
    }
}
