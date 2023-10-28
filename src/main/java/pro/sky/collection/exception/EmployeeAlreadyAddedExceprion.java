package pro.sky.collection.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.BAD_REQUEST)
public class EmployeeAlreadyAddedExceprion extends RuntimeException{
    public EmployeeAlreadyAddedExceprion() {
    }

    public EmployeeAlreadyAddedExceprion(String message) {
        super(message);
    }

    public EmployeeAlreadyAddedExceprion(String message, Throwable cause) {
        super(message, cause);
    }

    public EmployeeAlreadyAddedExceprion(Throwable cause) {
        super(cause);
    }

    public EmployeeAlreadyAddedExceprion(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
