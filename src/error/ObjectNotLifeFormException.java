package error;


public class ObjectNotLifeFormException extends Exception {
 //Исключение, для объектов, которые не является формой жизни.
    public ObjectNotLifeFormException(String msg) {
        super(msg);
    }
}
