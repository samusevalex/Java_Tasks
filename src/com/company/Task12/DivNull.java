package com.company.Task12;

public class DivNull extends RuntimeException {
    public DivNull() {
    }
    public DivNull(String message, Throwable exception) {
        super(message, exception);
    }
    public DivNull(String message) {
        super(message);
    }
    public DivNull (Throwable exception) {
        super(exception);
    }
}
