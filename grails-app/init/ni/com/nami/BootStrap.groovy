package ni.com.nami

import ni.com.nami.Employee
import ni.com.nami.Coordination

class BootStrap {

    def init = { servletContext ->
        Employee employee1 = new Employee(fullName: 'Employee One').save failOnError: true
        Employee employee2 = new Employee(fullName: 'Employee Two').save failOnError: true
        Employee employee3 = new Employee(fullName: 'Employee Three').save failOnError: true
        Employee employee4 = new Employee(fullName: 'Employee Four').save failOnError: true
        Employee employee5 = new Employee(fullName: 'Employee Five').save failOnError: true

        new Coordination(name: 'Coordination One', copyFee: 100)
            .addToEmployees(employee1)
            .addToEmployees(employee2)
            .addToEmployees(employee3)
            .save failOnError: true

        new Coordination(name: 'Coordination Two', copyFee: 200)
            .addToEmployees(employee3)
            .addToEmployees(employee4)
            .save failOnError: true

        new Coordination(name: 'Coordination Three', copyFee: 150)
            .addToEmployees(employee5)
            .save failOnError: true
    }
    def destroy = {
    }
}
