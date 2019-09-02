package gameG.check;

public class Check {

    private static boolean check = false;

    public static boolean checkAge(final int age, final int min, final int max){
        if(age > min && age < max)
            check = true;
        return check;
    }
}
