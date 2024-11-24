package com.xworkz.empapp.customexception;

public class NameNotNullException extends Exception{

    public NameNotNullException(String errorMessage){
        super(errorMessage );
    }
}
