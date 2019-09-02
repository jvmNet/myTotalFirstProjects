package remember_;

public class App {

    private static final Object sync  = new Object();
    private static Remember _remember = null;
    private static Number   _number   = null;

    public static void main(String[] args){

        remember().run(number().A(),
                       number().B(),
                       number().C(),
                       number().D(),
                       number().F());
    }

    private static Number number(){
        if(_number == null) synchronized (sync) {
            if(_number == null)
                return new Number();
        }
        return _number;
    }

    private static Remember remember() {
        if(_remember == null) synchronized (sync) {
            if(_remember == null)
                return new Remember();
        }
        return _remember;
    }
}
