package Controller;

import java.util.Random;

public class NumbersController {
    public String message;
    public Voice voice;
    public ParseMessage parseMessage;
    public int correctAnswer;
    public int max = 9;
    public int min = 0;


    public NumbersController(String message){
        this.message = message;
    }

    public int generatorOneNumber(){
        int generatedNumber=11;
        Random r = new Random();
        generatedNumber = r.nextInt((max - min) + 1) + min;
        return generatedNumber;
    };

    public int[] generatorTestsNumbers(){
        int[] generatedNumbers=new int[4];
        boolean [] numbertaken = new boolean[10];
        for(int i=0;i<10;i++) numbertaken[i]=false;
        for(int i=0;i<3;i++) {
            Random r = new Random();
            int j = r.nextInt((max - min) + 1) + min;
            if(!numbertaken[j]) {
                generatedNumbers[i] = j;
                numbertaken[j]=true;
            }
            else i--;

        }
        correctAnswer = generatedNumbers[new Random().nextInt(generatedNumbers.length-1)];
        generatedNumbers[3]=correctAnswer;
        return generatedNumbers;
    };

     public boolean iscorrect(String message){
         if(message.equals(Integer.toString(correctAnswer)))
                return true;

         return false;
    };

}
