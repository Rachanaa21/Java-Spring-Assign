package com.example.springassignStudents.exceptional;

import org.springframework.web.bind.annotation.ResponseStatus;

public class exceptional {

    @ResponseStatus
    public class ResourceNotFoundException extends RuntimeException {

        private static final long serialVersionUID = 1L;

        public ResourceNotFoundException(String message) {
            super(message);
        }

        public ResourceNotFoundException(String message, Throwable throwable) {
            super(message, throwable);
        }
    }
}
