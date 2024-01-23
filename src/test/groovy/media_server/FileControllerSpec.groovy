package media_server

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class FileControllerSpec extends Specification implements ControllerUnitTest<FileController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
