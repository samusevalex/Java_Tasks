package com.company.Task12;

public class NegParam extends Exception {
    public NegParam() {
    }
    public NegParam(String message, Throwable exception) {
        super(message, exception);
    }
    public NegParam(String message) {
        super(message);
    }
    public NegParam (Throwable exception) {
        super(exception);
    }
}
