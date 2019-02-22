package pl.sda;

public class TooLongOrTooShortPeselException extends RuntimeException {
    public TooLongOrTooShortPeselException (String s){
        super(s);
    }
}
