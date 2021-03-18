package com.upgrad.hirewheels.exceptions;

public class UserAlreadyExistsException extends Exception{
    public UserAlreadyExistsException(final String email){
    super(email);

}}
