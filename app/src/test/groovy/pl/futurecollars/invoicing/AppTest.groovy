/*
 * This Spock specification was generated by the Gradle 'init' task.
 */
package pl.futurecollars.invoicing
// package pl.futurecollars.invoicing.db.memory

import pl.futurecollars.invoicing.db.Database
import pl.futurecollars.invoicing.db.memory.InMemoryDatabase
import pl.futurecollars.invoicing.model.Invoice
import spock.lang.Specification

class AppTest extends Specification {
    def "application has a greeting"() {
        setup:
        def app = new App()

        when:
        def result = app.greeting

        then:
        result != null
    }
    def  "dummy test to cover main" (){
        setup:
        def app = new App()

        and:
        app.main()
    }
}