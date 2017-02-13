package ni.com.nami

class Employee {
    String fullName

    static constraints = {
        fullName blank: false
    }

    static belongsTo = Coordination
    static hasMany = [coordinations: Coordination]
}
