package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {
        int k = 2;//or 1
        while (k <= printToInclusive){
            int n = 1;
            boolean t = true;
            while (n<k){
                if (k % n == 0 && n != 1){
                    t = false;
                }
                n++;
            }
            if (t){
                System.out.println(k);
            }
            k++;
        }
    }
}
