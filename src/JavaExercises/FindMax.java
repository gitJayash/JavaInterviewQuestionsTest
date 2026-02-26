package JavaExercises;

public class FindMax {

    public static void main(String[]args){

    int[] numbers = {23, 45, 71, 99, 2, 12};

    int max = numbers[0];

    for(int num:numbers) {
        if (num > max) {
            max = num;
            }
        }
    System.out.println("The highest value is " + max);

    }
}


