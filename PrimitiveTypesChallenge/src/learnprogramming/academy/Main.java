package learnprogramming.academy;

public class Main {

    public static void main(String[] args) {
	    byte myByte = 1;
	    short myShort = 2;
	    int myInt = 3;
	    long myLong = 50_000L+ (10 * ( myByte + myShort + myInt));

        System.out.println(myLong);

        //jawaban youtube + casting short
		byte byteValue = 10;
		short shortValue = 20;
		int intValue = 50;

		long longTotal = 50000L + 10L * (byteValue + shortValue + intValue);
		System.out.println(longTotal);

		short shortTotal = (short) (1000 + 10 *
				(byteValue + shortValue + intValue));
    }
}
