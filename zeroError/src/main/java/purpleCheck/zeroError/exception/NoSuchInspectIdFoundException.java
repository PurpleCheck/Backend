package purpleCheck.zeroError.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(value= HttpStatus.NOT_FOUND)
public class NoSuchInspectIdFoundException extends RuntimeException{
    public NoSuchInspectIdFoundException(String message) {
        super(message);
    }
}
