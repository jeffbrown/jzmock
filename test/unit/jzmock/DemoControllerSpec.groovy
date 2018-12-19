package jzmock

import grails.test.mixin.TestFor
import spock.lang.Specification

@TestFor(DemoController)
class DemoControllerSpec extends Specification {

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
