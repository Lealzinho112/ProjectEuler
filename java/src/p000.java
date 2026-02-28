
//This was my Problem 0 when I created my ProjectEuler account. From what I understood, yours might be different.


public class p000 {

    public static String sumOfOddSquaresUntil935k(){
        //Had to use long instead of int since the result was a massive number
        long oddSqrs = 953000/2;
        long sum = (oddSqrs*(2*oddSqrs+1)*(2*oddSqrs-1))/3;
        return String.valueOf(sum);
    }
}
