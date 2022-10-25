package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int k = 0;
        //int c = 1;
        int er = multiplyByAndToInclusive;
            if (multiplyByAndToInclusive < 0){
                er = multiplyByAndToInclusive * -1;
          //      c = -1;
            }
        if (multiplyByAndToInclusive == 0){
            //TODO
        }else {
            while (k <= er){
                System.out.println(k * multiplyByAndToInclusive);
                k++;
            }
        }
    }

}

