package com.example.SpringRestSecurity.error;

import java.util.Set;

public class BookUnSupportedFieldPatchException extends RuntimeException {

    /**
     *
     */
    private static final long serialVersionUID = -395979664449197687L;

    public BookUnSupportedFieldPatchException(Set<String> keys) {
        super("Field " + keys.toString() + " update is not allow.");
    }

}