package school.mjc.stage0.loops.task2;

public class WordsBuilder {
    public void buildPhrase(char... chars) {
        String text = "";
        for (char ch:chars) {
            text+=ch;
        }
        System.out.print(text);
    }
}
