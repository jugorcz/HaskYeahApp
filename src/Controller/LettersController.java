package Controller;

import java.util.Random;

public class LettersController {
    public String message;
    public Voice voice;
    public ParseMessage parseMessage;
    public String correctAnswer;

    public LettersController(String message){
        this.message = message;
    }

    public String generatorOneLetter(){
        String generatedLetter="$";
        Random r = new Random();
        generatedLetter = String.valueOf(r.nextInt((26) + 'a'));
        return generatedLetter;
    };

    public String[] generatorTestsLetters(){
        String[] generatedLetters=new String[4];
        boolean[] lettersTaken = new boolean[26];
        for(int i=0;i<3;i++) {
            Random r = new Random();

            String p = String.valueOf(r.nextInt((26) + 'a'));
            int j = Integer.valueOf(p);
            if(!lettersTaken[j%26]) {
                generatedLetters[i] = p;
                lettersTaken[j%26]=true;
            }
            else i--;
        }

        correctAnswer = generatedLetters[new Random().nextInt(generatedLetters.length-1)];
        generatedLetters[3]=correctAnswer;
        return generatedLetters;
    };


    public boolean iscorrect(String message){
        if(message.equals(correctAnswer))
            return true;

        return false;
    };
}
