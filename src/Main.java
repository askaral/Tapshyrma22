import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<Sort> numbers = new ArrayList<>();

        for (int i = 0; i < 50; i++) {
            numbers.add(new Sort(random.nextInt(1, 100)));
        }
        System.out.println(numbers);
        Sort sort = new Sort();
        sort.numberEvenOdd(numbers);

    }
}