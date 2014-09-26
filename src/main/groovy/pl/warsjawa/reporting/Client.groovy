package pl.warsjawa.reporting

import groovy.transform.CompileStatic
import groovy.transform.ToString

/**
 * Created by mateuszgrzechocinski on 26/09/14.
 */
@ToString
@CompileStatic
class Client {

    String firstName

    String lastName

    String loanId

    Client() {
    }

    Client(String firstName, String lastName, String loanId) {
        this.firstName = firstName
        this.lastName = lastName
        this.loanId = loanId
    }
}
