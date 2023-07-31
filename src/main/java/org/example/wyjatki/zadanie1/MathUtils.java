package org.example.wyjatki;

public class MathUtils {

    public float divide(float a, float b) throws CannotDivideBy0Exception {
        if(a==0){
            throw new CannotDivideBy0Exception();
        }
        return a / b;
    }
}
