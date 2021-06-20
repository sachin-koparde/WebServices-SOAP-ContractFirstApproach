package assignment.onsoap.soapcfa.endpoint;

import org.apache.cxf.Bus;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ws.server.endpoint.annotation.Endpoint;

@Endpoint
public class EmployeeEndpoint {

    @Autowired
    private Bus bus;


}