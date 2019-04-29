package fr.eni.enienchere.bll.exception;

@SuppressWarnings("serial")
public class BLLException extends Exception{

    public BLLException() {
    }

    public BLLException(String messaqe) {
        super(messaqe);
    }

    public BLLException(String message, Throwable exception) {
        super(message, exception);
    }

    @Override
    public String getMessage() {
        StringBuffer sb = new StringBuffer("Couche BLL - ");
        sb.append(super.getMessage());
        return sb.toString() ;
    }
}
