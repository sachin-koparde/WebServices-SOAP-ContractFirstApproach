package assignment.onsoap.soapcfa.employee;

import java.net.URL;
import javax.xml.namespace.QName;
import javax.xml.ws.WebEndpoint;
import javax.xml.ws.WebServiceClient;
import javax.xml.ws.WebServiceFeature;
import javax.xml.ws.Service;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-06-20T22:06:16.650+05:30
 * Generated source version: 3.4.3
 *
 */
@WebServiceClient(name = "EmployeePortService",
                  wsdlLocation = "classpath:wsdl/employee.wsdl",
                  targetNamespace = "http://soapcfa.onsoap.assignment/employee")
public class EmployeePortService extends Service {

    public final static URL WSDL_LOCATION;

    public final static QName SERVICE = new QName("http://soapcfa.onsoap.assignment/employee", "EmployeePortService");
    public final static QName EmployeePortSoap11 = new QName("http://soapcfa.onsoap.assignment/employee", "EmployeePortSoap11");
    static {
        URL url = EmployeePortService.class.getClassLoader().getResource("wsdl/employee.wsdl");
        if (url == null) {
            java.util.logging.Logger.getLogger(EmployeePortService.class.getName())
                .log(java.util.logging.Level.INFO,
                     "Can not initialize the default wsdl from {0}", "classpath:wsdl/employee.wsdl");
        }
        WSDL_LOCATION = url;
    }

    public EmployeePortService(URL wsdlLocation) {
        super(wsdlLocation, SERVICE);
    }

    public EmployeePortService(URL wsdlLocation, QName serviceName) {
        super(wsdlLocation, serviceName);
    }

    public EmployeePortService() {
        super(WSDL_LOCATION, SERVICE);
    }

    public EmployeePortService(WebServiceFeature ... features) {
        super(WSDL_LOCATION, SERVICE, features);
    }

    public EmployeePortService(URL wsdlLocation, WebServiceFeature ... features) {
        super(wsdlLocation, SERVICE, features);
    }

    public EmployeePortService(URL wsdlLocation, QName serviceName, WebServiceFeature ... features) {
        super(wsdlLocation, serviceName, features);
    }




    /**
     *
     * @return
     *     returns EmployeePort
     */
    @WebEndpoint(name = "EmployeePortSoap11")
    public EmployeePort getEmployeePortSoap11() {
        return super.getPort(EmployeePortSoap11, EmployeePort.class);
    }

    /**
     *
     * @param features
     *     A list of {@link javax.xml.ws.WebServiceFeature} to configure on the proxy.  Supported features not in the <code>features</code> parameter will have their default values.
     * @return
     *     returns EmployeePort
     */
    @WebEndpoint(name = "EmployeePortSoap11")
    public EmployeePort getEmployeePortSoap11(WebServiceFeature... features) {
        return super.getPort(EmployeePortSoap11, EmployeePort.class, features);
    }

}
