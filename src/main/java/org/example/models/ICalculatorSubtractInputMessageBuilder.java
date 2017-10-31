/*
 * CalculatorServiceLib
 *
 * This file was automatically generated by APIMATIC v2.0 ( https://apimatic.io ).
 */
package org.example.models;

import java.util.*;

public class ICalculatorSubtractInputMessageBuilder {
    //the instance to build
    private ICalculatorSubtractInputMessage iCalculatorSubtractInputMessage;

    /**
     * Default constructor to initialize the instance
     */
    public ICalculatorSubtractInputMessageBuilder() {
        iCalculatorSubtractInputMessage = new ICalculatorSubtractInputMessage();
    }

    public ICalculatorSubtractInputMessageBuilder parameters(Subtract parameters) {
        iCalculatorSubtractInputMessage.setParameters(parameters);
        return this;
    }
    /**
     * Build the instance with the given values
     */
    public ICalculatorSubtractInputMessage build() {
        return iCalculatorSubtractInputMessage;
    }
}