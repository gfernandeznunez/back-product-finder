package com.walmart.search.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code = HttpStatus.NOT_FOUND)
public class SearchParamNotFoundException extends RuntimeException{
    public SearchParamNotFoundException(String message) {
        super(message);
    }
}
