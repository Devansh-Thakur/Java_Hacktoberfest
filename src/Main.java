import java.util.Random;

public class Main {
    public static void main(String args[]){ //main method
        Random_clas random_g = new Random_clas(); //created an object of class Random_class
        random_g.random_method(); //using the object to refrence the random_method



    }
}

class Random_class{
    public void random_method(){
        int[] numbers = new int[]{5,4,8,9,6,3,7,4,2,85,63,45,10};
        Random random = new Random(); //new object of class Random
        int ranNum = random.nextInt(numbers.length-1); //Length of the Array -1
        int a = numbers[ranNum];
        System.out.print("Your generated random number is:  " + a); 
    }
}
