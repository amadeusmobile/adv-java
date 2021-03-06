
package com.demo.ws;

import java.net.MalformedURLException;
import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.Service;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceException;
import javax.xml.ws.WebServiceFeature;


/**
 * This class was generated by the JAX-WS RI.
 * JAX-WS RI 2.2.9-b130926.1035
 * Generated source version: 2.2
 * 
 */
@WebServiceClient(name = "CalImplService", targetNamespace = "http://ws.demo.com/", wsdlLocation = "http://localhost:7001/CalWS/doAdd?wsdl")
public class CalImplService
    extends Service
{

    private final static URL CALIMPLSERVICE_WSDL_LOCATION;
    private final static WebServiceException CALIMPLSERVICE_EXCEPTION;
    private final static QName CALIMPLSERVICE_QNAME = new QName("http://ws.demo.com/", "CalImplService");

    static {
        URL url = null;
        WebServiceException e = null;
        try {
            url = new URL("http://localhost:7001/CalWS/doAdd?wsdl");
        } catch (MalformedURLException ex) {
            e = new WebServiceException(ex);
        }
        CALIMPLSERVICE_WSDL_LOCATION = url;
        CALIMPLSERVICE_EXCEPTION = e;
    }

    public CalImplService() {
        super(__getWsdlLocation(), CALIMPLSERVICE_QNAME);
    }

    public CalImplService(WebServiceFeature... features) {
        super(__getWsdlLocation(), CALIMPLSERVICE_QNAME, features);
    }

    public CalImplService(URL wsdlLocation) {
        super(wsdlLocation, CALIMPLSERVICE_QNAME);
    }

    public CalImplService(URL wsdlLocation, WebServiceFeature... features) {
        super(wsdlLocation, CALIMPLSERVICE_QNAME, features);
    }

    public CalImplService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public CalImplService(URL wsdlLocation, QName serviceName, WebServiceFeature... features) {
        super(wsdlLocation, serviceName, features);
    }

    /**
     * 
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalImplPort")
    public Calculator getCalImplPort() {
        return super.getPort(new QName("http://ws.demo.com/", "CalImplPort"), Calculator.class);
    }

    /**
     * 
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns Calculator
     */
    @WebEndpoint(name = "CalImplPort")
    public Calculator getCalImplPort(WebServiceFeature... features) {
        return super.getPort(new QName("http://ws.demo.com/", "CalImplPort"), Calculator.class, features);
    }

    private static URL __getWsdlLocation() {
        if (CALIMPLSERVICE_EXCEPTION!= null) {
            throw CALIMPLSERVICE_EXCEPTION;
        }
        return CALIMPLSERVICE_WSDL_LOCATION;
    }

}
