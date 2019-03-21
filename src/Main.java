import java.io.IOException;

public class Main {

    private static boolean flag = true;

    private Main() {
        startProgram();
    }

    private static void setFlag(boolean flag) {
        Main.flag = flag;
    }

    void startProgram(){
        WordsReverser wordsReverser = new WordsReverser();
        ConsoleHelper.writeMessage(Messages.INTRODUCTION.getValue());

        while (flag) {
            ConsoleHelper.writeMessage(Messages.INSTRUCTION.getValue());
            String inputText = ConsoleHelper.readInputText();
            if(!inputText.equalsIgnoreCase("E")){
                String resultText = wordsReverser.reverseText(inputText);
                ConsoleHelper.writeMessage(resultText);
            }else {
                ConsoleHelper.writeMessage(Messages.EXIT.getValue());
                String answer = ConsoleHelper.readInputText();
                if(answer.equalsIgnoreCase("y")) setFlag(false);
            }
        }
        ConsoleHelper.writeMessage(Messages.THANKS.getValue());
    }

    public static void main(String[] args) {
        new Main();
    }
}
