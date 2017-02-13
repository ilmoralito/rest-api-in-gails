package ni.com.nami

import grails.rest.*
import grails.converters.*

class CoordinationController extends RestfulController {
    static responseFormats = ['json']
    CoordinationController() {
        super(Coordination)
    }
}
