package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {
        int counter = 1;
        int result = counter;
        while (counter <= printToInclusive){
            System.out.println(result);
            result *= counter;
            counter++;
        }
        System.out.println(result);
    }
}
