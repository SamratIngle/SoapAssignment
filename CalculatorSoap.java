
package com.calculator.model;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.ws.RequestWrapper;
import javax.xml.ws.ResponseWrapper;


@WebService(name = "CalculatorSoap", targetNamespace = "http://tempuri.org/")
@XmlSeeAlso({
    ObjectFactory.class
})
public interface CalculatorSoap {


    @WebMethod(operationName = "Add", action = "http://tempuri.org/Add")
    @WebResult(name = "AddResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Add", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.Add")
    @ResponseWrapper(localName = "AddResponse", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.AddResponse")
    public int add(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

   
    @WebMethod(operationName = "Subtract", action = "http://tempuri.org/Subtract")
    @WebResult(name = "SubtractResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Subtract", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.Subtract")
    @ResponseWrapper(localName = "SubtractResponse", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.SubtractResponse")
    public int subtract(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

    
    @WebMethod(operationName = "Multiply", action = "http://tempuri.org/Multiply")
    @WebResult(name = "MultiplyResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Multiply", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.Multiply")
    @ResponseWrapper(localName = "MultiplyResponse", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.MultiplyResponse")
    public int multiply(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

    @WebMethod(operationName = "Divide", action = "http://tempuri.org/Divide")
    @WebResult(name = "DivideResult", targetNamespace = "http://tempuri.org/")
    @RequestWrapper(localName = "Divide", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.Divide")
    @ResponseWrapper(localName = "DivideResponse", targetNamespace = "http://tempuri.org/", className = "com.calculator.model.DivideResponse")
    public int divide(
        @WebParam(name = "intA", targetNamespace = "http://tempuri.org/")
        int intA,
        @WebParam(name = "intB", targetNamespace = "http://tempuri.org/")
        int intB);

}
