package com.helixleisure.app.exception;

/**
 * The Class ErrorResponse.
 * 
 * @author munikumarchallagulla
 */
public class ErrorResponse
{
    
    /** The status. */
    private int status;
    
    /** The message. */
    private String message;
    
    /**
     * Instantiates a new error response.
     */
    public ErrorResponse()
    {
        super();
    }
    
    /**
     * Instantiates a new error response.
     *
     * @param status the status
     * @param message the message
     */
    public ErrorResponse(int status, String message)
    {
        super();
        this.status = status;
        this.message = message;
    }
    
    /**
     * Gets the status.
     *
     * @return the status
     */
    public int getStatus()
    {
        return status;
    }
    
    /**
     * Sets the status.
     *
     * @param status the new status
     */
    public void setStatus(int status)
    {
        this.status = status;
    }
    
    /**
     * Gets the message.
     *
     * @return the message
     */
    public String getMessage()
    {
        return message;
    }
    
    /**
     * Sets the message.
     *
     * @param message the new message
     */
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    /**
     * To string.
     *
     * @return the string
     */
    @Override
    public String toString()
    {
        return "ErrorResponse [status=" + status + ", message=" + message + "]";
    }
}