package jzmock

class DemoController {
    SomeService someService

    def index(String firstName, String lastName) {
        someService.someMethod(firstName, lastName)

        render 'Success'
    }
}
