package io.pivotal.microsamples.api;

import io.pivotal.microsamples.model.Health;

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

@Api(value = "Randomize", description = "the Randomize API")
public interface RandomizeApi {

    @ApiOperation(value = "Health point", notes = "All generated responses returned.", response = Health.class, tags={ "randomize", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "successful operation", response = Health.class),
        @ApiResponse(code = 400, message = "Invalid status value", response = Health.class) })
    @RequestMapping(value = "/randomize",
        produces = "application/json",
        consumes = "application/json",
        method = RequestMethod.GET)
    default ResponseEntity<Health> health() {
        // do some magic!
        return new ResponseEntity<Health>(HttpStatus.OK);
    }

}
