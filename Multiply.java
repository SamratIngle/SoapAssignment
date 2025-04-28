
package com.calculator.model;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;



@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "intA",
    "intB"
})
@XmlRootElement(name = "Multiply")
public class Multiply {

    protected int intA;
    protected int intB;

    /**
     * Gets the value of the intA property.
     * 
     */
    public int getIntA() {
        return intA;
    }

    /**
     * Sets the value of the intA property.
     * 
     */
    public void setIntA(int value) {
        this.intA = value;
    }

    /**
     * Gets the value of the intB property.
     * 
     */
    public int getIntB() {
        return intB;
    }

    /**
     * Sets the value of the intB property.
     * 
     */
    public void setIntB(int value) {
        this.intB = value;
    }

}
