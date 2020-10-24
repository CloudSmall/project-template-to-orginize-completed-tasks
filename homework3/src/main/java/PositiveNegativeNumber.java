import java.util.Random;

public class PositiveNegativeNumber {
    public static void main(String[] args) {


        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt(Integer.MAX_VALUE) * (random.nextBoolean() ? -1 : 1);


        String result = (randomNumber > 0) ? "positive" : "negative";
        System.out.println("The number is " + randomNumber + " This number is " + result);

    }
}