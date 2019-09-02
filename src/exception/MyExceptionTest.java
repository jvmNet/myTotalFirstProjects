package exception;

import java.util.Random;

public class MyExceptionTest {
    public static void main(String[] args)  {

        try{
        System.out.println(factorial());
        }catch (MyException e){
            System.out.println(e.getText() + " - " + e.getTextError());
        }
    }

    public static int factorial() {

        Random random = new Random();
        int number = random.nextInt(10);
        if(number > 5){
            return number;
        }else{
            throw new MyException("Нет такого числа","Попробуйте, еще раз");
        }
    }
}
class MyException extends RuntimeException{
    private String text;
    private String textError;

    public MyException(String text, String textError) {
        this.text = text;
        this.textError = textError;
    }

    public String getText() {
        return text;
    }

    public String getTextError() {
        return textError;
    }
}



