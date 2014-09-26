package pl.warsjawa.reporting

import groovy.transform.ToString

/**
 * Created by mateuszgrzechocinski on 26/09/14.
 */
@ToString
class ReportData {

    String loanId
    String job
    BigInteger amount
    String fraudStatus
    String decision
}
