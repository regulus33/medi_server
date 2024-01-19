package media_server

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class File_infoControllerSpec extends Specification implements ControllerUnitTest<File_infoController> {

     void "test index action"() {
        when:
        controller.index()

        then:
        status == 200

     }
}
