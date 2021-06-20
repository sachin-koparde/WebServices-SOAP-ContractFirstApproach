package assignment.onsoap.soapcfa.employee;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.xml.bind.annotation.XmlSeeAlso;

/**
 * This class was generated by Apache CXF 3.4.3
 * 2021-06-20T21:32:54.236+05:30
 * Generated source version: 3.4.3
 *
 */
@WebService(targetNamespace = "http://soapcfa.onsoap.assignment/employee", name = "EmployeePort")
@XmlSeeAlso({ObjectFactory.class})
@SOAPBinding(parameterStyle = SOAPBinding.ParameterStyle.BARE)
public interface EmployeePort {

    @WebMethod
    @WebResult(name = "getAllEmployeeResponse", targetNamespace = "http://soapcfa.onsoap.assignment/employee", partName = "getAllEmployeeResponse")
    public GetAllEmployeeResponse getAllEmployee(

        @WebParam(partName = "getAllEmployeeRequest", name = "getAllEmployeeRequest", targetNamespace = "http://soapcfa.onsoap.assignment/employee")
        GetAllEmployeeRequest getAllEmployeeRequest
    );

    @WebMethod
    @WebResult(name = "deleteEmployeeResponse", targetNamespace = "http://soapcfa.onsoap.assignment/employee", partName = "deleteEmployeeResponse")
    public DeleteEmployeeResponse deleteEmployee(

        @WebParam(partName = "deleteEmployeeRequest", name = "deleteEmployeeRequest", targetNamespace = "http://soapcfa.onsoap.assignment/employee")
        DeleteEmployeeRequest deleteEmployeeRequest
    );

    @WebMethod
    @WebResult(name = "addEmployeeResponse", targetNamespace = "http://soapcfa.onsoap.assignment/employee", partName = "addEmployeeResponse")
    public AddEmployeeResponse addEmployee(

        @WebParam(partName = "addEmployeeRequest", name = "addEmployeeRequest", targetNamespace = "http://soapcfa.onsoap.assignment/employee")
        AddEmployeeRequest addEmployeeRequest
    );

    @WebMethod
    @WebResult(name = "updateEmployeeResponse", targetNamespace = "http://soapcfa.onsoap.assignment/employee", partName = "updateEmployeeResponse")
    public UpdateEmployeeResponse updateEmployee(

        @WebParam(partName = "updateEmployeeRequest", name = "updateEmployeeRequest", targetNamespace = "http://soapcfa.onsoap.assignment/employee")
        UpdateEmployeeRequest updateEmployeeRequest
    );

    @WebMethod
    @WebResult(name = "getEmployeeByIdResponse", targetNamespace = "http://soapcfa.onsoap.assignment/employee", partName = "getEmployeeByIdResponse")
    public GetEmployeeByIdResponse getEmployeeById(

        @WebParam(partName = "getEmployeeByIdRequest", name = "getEmployeeByIdRequest", targetNamespace = "http://soapcfa.onsoap.assignment/employee")
        GetEmployeeByIdRequest getEmployeeByIdRequest
    );
}
