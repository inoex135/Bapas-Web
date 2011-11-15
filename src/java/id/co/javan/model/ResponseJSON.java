/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package id.co.javan.model;

/**
 *
 * @author wisnu
 */
public class ResponseJSON {

    String message = "";
    boolean error = false;
    Object object = null;
    Object[] arrayOfObject = null;

    public boolean isError() {
        return error;
    }

    public void setError(boolean error) {
        this.error = error;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Institusi object) {
        this.object = object;
    }

    public Object[] getArrayOfObject() {
        return arrayOfObject;
    }

    public void setArrayOfObject(Object[] arrayOfObject) {
        this.arrayOfObject = arrayOfObject;
    }
    

}
