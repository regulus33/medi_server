package media_server

import grails.testing.gorm.DomainUnitTest
import spock.lang.Specification

class FileSpec extends Specification implements DomainUnitTest<File> {

     void "test domain constraints"() {
        when:
        File domain = new File()
        //TODO: Set domain props here

        then:
        domain.validate()
     }
}
