package com.ofg.twitter.controller
import com.ofg.twitter.controller.place.extractor.PropagationWorker
import com.wordnik.swagger.annotations.Api
import com.wordnik.swagger.annotations.ApiOperation
import groovy.util.logging.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import pl.warsjawa.reporting.Client

import javax.validation.constraints.NotNull
import java.util.concurrent.Callable

import static org.springframework.web.bind.annotation.RequestMethod.POST
import static org.springframework.web.bind.annotation.RequestMethod.PUT

@Slf4j
@RestController
@RequestMapping('/clients')
@Api(value = "clients", description = "Operations on clients")
class ClientsController {

    @RequestMapping(
            method = POST,
            consumes = 'application/json',
            produces = 'application/json')
    @ApiOperation(value = "Async collecting and propagating of tweets for a given pairId",
            notes = "This will asynchronously call tweet collecting, place extracting and their propagation to Collerators")
    Void getClients(@RequestBody Client client) {
        log.info("New client data: " + client)
    }

}
