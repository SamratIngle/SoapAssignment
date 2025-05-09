
package com.calculator.model;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


@WebServiceClient(name = "Calculator", targetNamespace = "http://tempuri.org/", wsdlLocation = "file:/C:/Users/BikkadR/Desktop/Training/Java%20Academy/Soap/calculator/src/main/resources/calculator.wsdl")
public class Calculator
    extends Service
{

    private final static URL CALCULATOR_WSDL_LOCATION;
    private final static WebServiceException CALCULATOR_EXCEPTION;
    private final static QName CALCULATOR_QNAME = new QName("http://tempuri.org/", "Calculator");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("file:/C:/Users/BikkadR/Desktop/Training/Java%20Academy/Soap/calculator/src/main/resources/calculator.wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALCULATOR_WSDL_LOCATION = url;
        CALCULATOR_EXCEPTION = e;
    }

    public Calculator() {
        super(__getWsdlLocation(), CALCULATOR_QNAME);
    }

    public Calculator(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALCULATOR_QNAME, features);
    }

    public Calculator(URL wsdlLocation) {
        super(wsdlLocation, CALCULATOR_QNAME);
    }

    public Calculator(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALCULATOR_QNAME, features);
    }

    public Calculator(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public Calculator(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns CalculatorSoap
     */
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap() {
        return super.getPort(new QName("http://tempuri.org/", "CalculatorSoap"), CalculatorSoap.class);
    }

    
    @WebEndpoint(name = "CalculatorSoap")
    public CalculatorSoap getCalculatorSoap(WebServiceFeature... features) {
        return super.getPort(new QName("http://tempuri.org/", "CalculatorSoap"), CalculatorSoap.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALCULATOR_EXCEPTION!= null) {
            throw CALCULATOR_EXCEPTION;
        }
        return CALCULATOR_WSDL_LOCATION;
    }

}
