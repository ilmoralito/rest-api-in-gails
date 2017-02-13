package ni.com.nami

class Coordination {
    String name
    Integer copyFee

    static constraints = {
        name blank: false
        copyFee min: 1
    }

    static hasMany = [employees: Employee]
}
