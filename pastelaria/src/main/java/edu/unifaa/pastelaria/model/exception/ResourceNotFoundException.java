package edu.unifaa.pastelaria.model.exception;

public class ResourceNotFoundException extends RuntimeException{
    
    public ResourceNotFoundException(String mensagem){
        super(mensagem);
    }
}
