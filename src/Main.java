
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> listNumber = new ArrayList<>();

        ArrayList<Integer> listNumber1 = new ArrayList<>(2500);
        ArrayList<Integer> listNumber2 = new ArrayList<>(2500);
        ArrayList<Integer> listNumber3 = new ArrayList<>(2500);
        ArrayList<Integer> listNumber4 = new ArrayList<>(2500);

        for(int i=1; i<=10000; i++){
            listNumber.add(i);
        }

        listNumber1.addAll(listNumber.subList(0,2500));
        listNumber2.addAll(listNumber.subList(2500,5000));
        listNumber3.addAll(listNumber.subList(5000,7500));
        listNumber4.addAll(listNumber.subList(7500,10000));

        OddNumbers o1 = new OddNumbers(listNumber1);
        Thread t1 = new Thread(o1);
        t1.start();

        EvenNumbers e1 = new EvenNumbers(listNumber1);
        Thread t2 = new Thread(e1);
        t2.start();

    }
}