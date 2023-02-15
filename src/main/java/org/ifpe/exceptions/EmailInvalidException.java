package org.ifpe.exceptions;

public class EmailInvalidException extends RuntimeException{

    public EmailInvalidException(String message){
        super(message);
    }

}
