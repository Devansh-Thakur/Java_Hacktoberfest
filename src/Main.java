import java.util.Random;

public class Main {
    public static void main(String args[]){

        int[] numbers = new int[]{5,4,8,9,6,3,7,4,2,85,63,45,10};
        Random random = new Random();
        int ranNum = random.nextInt(numbers.length-1);
        int a = numbers[ranNum];
        System.out.print("Your generated random number is:  ");
        System.out.println(a);

    }
}
