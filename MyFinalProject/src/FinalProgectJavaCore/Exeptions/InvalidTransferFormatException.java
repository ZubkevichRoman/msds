package FinalProgectJavaCore.Exeptions;

public class InvalidTransferFormatException extends Exception{
    //Неверный формат трансфера
    public InvalidTransferFormatException(String message) {
        super(message);
    }
}
