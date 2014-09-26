package com.ofg.twitter.controller

import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import groovy.util.logging.Slf4j
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.warsjawa.reporting.Client
import pl.warsjawa.reporting.ReportData

import static org.springframework.web.bind.annotation.RequestMethod.POST

@Slf4j
@RestController
@RequestMapping('/reporting')
@Api(value = "reporting", description = "Operations on reports")
class ReportingController {

    @RequestMapping(
            method = POST,
            consumes = 'application/json',
            produces = 'application/json')
    @ApiOperation(value = "Async collecting and propagating of tweets for a given pairId",
            notes = "This will asynchronously call tweet collecting, place extracting and their propagation to Collerators")
    Void getClients(@RequestBody ReportData reportData) {
        log.info("New report data: " + reportData)
    }

}
