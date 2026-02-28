
//Find all numbers multiple of 3 or 5 below 1000

public class p001 {

    public static String sumMultiplesOf3and5() {
        int num = 0;
        for (int i = 0; i <= 1000; i++) {
            if (i % 3 == 0 || i % 5 == 0)
                num += i;
        }
        return String.valueOf(num);
    }
}
