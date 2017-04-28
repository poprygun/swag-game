package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Guess;

import io.swagger.annotations.*;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-28T14:48:07.759-04:00")

@Api(value = "Guess", description = "the Guess API")
public interface GuessApi {

    @ApiOperation(value = "Finds All Guesses", notes = "All generated responses returned.", response = Guess.class, responseContainer = "List", tags={ "guess", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Guess.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = Guess.class) })
    @RequestMapping(value = "/randomize/allPhrases",
        produces = "application/json",
        consumes = "application/json",
        method = RequestMethod.GET)
    default ResponseEntity<List<Guess>> allGuesses() {
        // do some magic!
        return new ResponseEntity<List<Guess>>(HttpStatus.OK);
    }

}
