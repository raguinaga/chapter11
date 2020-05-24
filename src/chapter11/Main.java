package chapter11;

public class Main {

    public static void main(String[] args) {
        int[] numArray;
	    BadArray ba = new BadArray();
	    numArray = ba.getNumbers();

	    // Attempt to read past the three int array
        for (int i = 0; i <= 3; i++) {
            System.out.println(numArray[i]);
        }
    }
}
