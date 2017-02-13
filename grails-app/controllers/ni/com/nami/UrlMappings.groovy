package ni.com.nami

class UrlMappings {

    static mappings = {
        '/api/coordinations' (resources: 'coordination')
        '/api/employees' (resources: 'employee') {
            collection {
                '/copyFeesByEmployeeCoordinations' controller: 'employee', action: 'copyFeesByEmployeeCoordinations'
            }
        }

        "/"(controller: 'application', action:'index')
        "500"(view: '/error')
        "404"(view: '/notFound')
    }
}
