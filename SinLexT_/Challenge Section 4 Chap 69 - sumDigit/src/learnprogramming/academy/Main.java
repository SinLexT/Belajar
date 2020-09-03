package learnprogramming.academy;

public class Main {

    public static void main(String[] args) {
        System.out.println(sumDigits(1434544));
    }

    public static int sumDigits(int number) {
        int total = 0;
        if(number>= 10) {
            while (number > 0) {
                total += number % 10;
                number /= 10;
            }
            return total;
        }else {
            return -1;
        }
    }
}