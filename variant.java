package variant;

public class variant {
    public static void main(String[] args) {
        result(2, 22, 2, 1);
    }

    public static void result(int a, int b, int k1, int k2) {
        long[] array = new long[b + 1];
        long count = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = 0;
        }
        if (k1 > k2) {
            for (int i = 0; i < array.length; i++) {
                if (i == a) {
                    array[i] = 1;
                }
                if (i > a) {
                    if (i % k1 != 0) {
                        array[i] = array[i - k2];
                    } else {
                        array[i] = array[i - k2] + array[i / k1];
                    }
                }
            }
        }
        if (k1 < k2) {
            count = 0;
        } else {
            count = array[b];
        }
        System.out.println("количество возможных преобразований: " + count);
    }
} 
