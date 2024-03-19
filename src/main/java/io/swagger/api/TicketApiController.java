package io.swagger.api;

import io.swagger.model.Ticket;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")
@RestController
public class TicketApiController implements TicketApi {

    private static final Logger log = LoggerFactory.getLogger(TicketApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public TicketApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> createTicket(@Parameter(in = ParameterIn.DEFAULT, description = "Create new ticket associated with the user", schema=@Schema()) @Valid @RequestBody Ticket body
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> deleteTicket(@Parameter(in = ParameterIn.PATH, description = "Ticket ID of the ticket that needs to be deleted", required=true, schema=@Schema()) @PathVariable("ticketId") Integer ticketId
) {
        String accept = request.getHeader("Accept");
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Ticket> getTicket(@Parameter(in = ParameterIn.PATH, description = "Ticket ID of the ticket that needs to be deleted", required=true, schema=@Schema()) @PathVariable("ticketId") Integer ticketId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<Ticket>(objectMapper.readValue("{\n  \"cinemaSession\" : {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  },\n  \"seat\" : 15,\n  \"date\" : \"24.01.2024\",\n  \"startsAt\" : \"11:20\",\n  \"id\" : 0,\n  \"cinema\" : {\n    \"address\" : \"Sporty Sq., 2, 02217\",\n    \"cinemaName\" : \"Oskar\",\n    \"id\" : 10\n  },\n  \"row\" : 5\n}", Ticket.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<Ticket>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<Ticket>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Ticket>> getUserTickets(@Parameter(in = ParameterIn.PATH, description = "User ID for retrieving appropriate tickets", required=true, schema=@Schema()) @PathVariable("userId") Integer userId
) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Ticket>>(objectMapper.readValue("[ {\n  \"cinemaSession\" : {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  },\n  \"seat\" : 15,\n  \"date\" : \"24.01.2024\",\n  \"startsAt\" : \"11:20\",\n  \"id\" : 0,\n  \"cinema\" : {\n    \"address\" : \"Sporty Sq., 2, 02217\",\n    \"cinemaName\" : \"Oskar\",\n    \"id\" : 10\n  },\n  \"row\" : 5\n}, {\n  \"cinemaSession\" : {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  },\n  \"seat\" : 15,\n  \"date\" : \"24.01.2024\",\n  \"startsAt\" : \"11:20\",\n  \"id\" : 0,\n  \"cinema\" : {\n    \"address\" : \"Sporty Sq., 2, 02217\",\n    \"cinemaName\" : \"Oskar\",\n    \"id\" : 10\n  },\n  \"row\" : 5\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Ticket>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Ticket>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
