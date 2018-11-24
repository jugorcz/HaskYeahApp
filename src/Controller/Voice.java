package Controller;

public class Voice extends ApplicationController {

    String message;
    String action;

    public void Voice(String message,String action){
        this.message = message;
        this.action = action;
    }
}
