package ni.com.nami

import grails.rest.*
import grails.converters.*
import org.hibernate.criterion.CriteriaSpecification

class EmployeeController extends RestfulController {
    static responseFormats = ['json']
    EmployeeController() {
        super(Employee)
    }

    def copyFeesByEmployeeCoordinations(Integer employeeID) {
        if (employeeID) {
            Employee employee = Employee.get(employeeID)

            respond employee.coordinations.collect { coordination ->
                [
                    coordination: coordination.name,
                    copyFee: coordination.copyFee
                ]
            }
        } else {
            respond([])
        }
    }
}
