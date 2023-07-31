package org.example.wyjatki.zadanie1;

import org.example.wyjatki.zadanie1.CannotDivideBy0Exception;

public class MathUtils {

    public float divide(float a, float b) throws CannotDivideBy0Exception {
        if (a == 0) {
            throw new CannotDivideBy0Exception();
        }
        return a / b;
    }
}
