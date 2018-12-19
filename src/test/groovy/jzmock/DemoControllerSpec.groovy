package jzmock

import grails.testing.web.controllers.ControllerUnitTest
import spock.lang.Specification

class DemoControllerSpec extends Specification implements ControllerUnitTest<DemoController> {

    void "test something"() {
        given:
        SomeService mockService = Mock(SomeService)
        controller.someService = mockService

        when:
        params.firstName = 'Robert'
        params.lastName = 'Fripp'
        controller.index()

        then:
        1 * mockService.someMethod('Robert', 'Fripp')
    }
}
