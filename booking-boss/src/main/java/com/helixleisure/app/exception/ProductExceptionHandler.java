package com.helixleisure.app.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * The Class ProductExceptionHandler.
 * 
 * @author munikumarchallagulla
 */
@RestControllerAdvice
public class ProductExceptionHandler {

	
	/**
	 * Product not stored.
	 *
	 * @param ex the ex
	 * @return the error response
	 */
	@ExceptionHandler(value = { ProductNotStored.class, ProductNotFound.class })
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    public ErrorResponse productNotStored(Exception ex)
    {
        return new ErrorResponse(400, ex.getMessage());
    }
	
    /**
     * Un known exception.
     *
     * @param ex the ex
     * @return the error response
     */
    @ExceptionHandler(value = { Exception.class })
    @ResponseStatus(HttpStatus.NOT_FOUND)
    public ErrorResponse unKnownException(Exception ex)
    {
        return new ErrorResponse(404, "Bad Request");
    }
}
