package application.clothingModel;

public class InvalidSizeException extends Exception{
    InvalidSizeException(){
    }
    InvalidSizeException(String msg){
        super(msg);
    }
    InvalidSizeException(Throwable cause){
        super(cause);
    }
    InvalidSizeException(String msg, Throwable cause){
        super(msg,cause);
    }
    InvalidSizeException(String msg, Throwable cause, boolean enableSuppression, boolean writableStackTrace){
        super(msg, cause, enableSuppression, writableStackTrace);
    }
}
