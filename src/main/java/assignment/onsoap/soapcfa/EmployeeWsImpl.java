package assignment.onsoap.soapcfa;


import assignment.onsoap.soapcfa.employee.*;
import assignment.onsoap.soapcfa.model.*;

import java.util.ArrayList;
import java.util.List;

public class EmployeeWsImpl implements EmployeePort {


    public EmployeeWsImpl() {
        init();
    }

    private void init() {
        List<Employee> employees = new ArrayList<Employee>();

        Employee employee = new Employee();
        employee.setEmployeeId(12100L);
        employee.setEmployeeName("Dinesh");

        employees.add(employee);
    }

    @Override
    public GetAllEmployeeResponse getAllEmployee(GetAllEmployeeRequest getAllEmployeeRequest) {
        return null;
    }

    @Override
    public DeleteEmployeeResponse deleteEmployee(DeleteEmployeeRequest deleteEmployeeRequest) {
        return null;
    }

    @Override
    public AddEmployeeResponse addEmployee(AddEmployeeRequest addEmployeeRequest) {
        return null;
    }

    @Override
    public UpdateEmployeeResponse updateEmployee(UpdateEmployeeRequest updateEmployeeRequest) {
        return null;
    }

    @Override
    public GetEmployeeByIdResponse getEmployeeById(GetEmployeeByIdRequest getEmployeeByIdRequest) {
        return null;
    }
}
