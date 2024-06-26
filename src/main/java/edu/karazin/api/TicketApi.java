/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.54).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package edu.karazin.api;

import edu.karazin.dto.Ticket;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")
@Validated
public interface TicketApi {

    @Operation(summary = "Create new ticket", description = "Create new ticket", security = {
            @SecurityRequirement(name = "ebox_office_auth", scopes = {
                    "write:ticket",
                    "read:ticket",
                    "write:userinfo",
                    "read:userinfo"})}, tags = {"ticket"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ticket"),

            @ApiResponse(responseCode = "200", description = "successful operation")})
    @RequestMapping(value = "/ticket",
            consumes = {"application/json", "application/xml"},
            method = RequestMethod.POST)
    ResponseEntity<Void> createTicket(@Parameter(in = ParameterIn.DEFAULT, description = "Create new ticket associated with the user", schema = @Schema()) @Valid @RequestBody Ticket body
    );


    @Operation(summary = "Delete ticket", description = "Delete the ticket", security = {
            @SecurityRequirement(name = "ebox_office_auth", scopes = {
                    "write:ticket",
                    "read:ticket",
                    "write:userinfo",
                    "read:userinfo"})}, tags = {"ticket"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "400", description = "Invalid ticket ID supplied"),

            @ApiResponse(responseCode = "404", description = "Ticket not found")})
    @RequestMapping(value = "/ticket/{ticketId}",
            method = RequestMethod.DELETE)
    ResponseEntity<Void> deleteTicket(@Parameter(in = ParameterIn.PATH, description = "Ticket ID of the ticket that needs to be deleted", required = true, schema = @Schema()) @PathVariable("ticketId") Integer ticketId
    );


    @Operation(summary = "Get ticket", description = "Get the ticket", security = {
            @SecurityRequirement(name = "ebox_office_auth", scopes = {
                    "write:ticket",
                    "read:ticket",
                    "write:userinfo",
                    "read:userinfo"})}, tags = {"ticket"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Ticket with related ID", content = @Content(mediaType = "application/json", schema = @Schema(implementation = Ticket.class))),

            @ApiResponse(responseCode = "400", description = "Invalid ticket ID supplied"),

            @ApiResponse(responseCode = "404", description = "Ticket not found")})
    @RequestMapping(value = "/ticket/{ticketId}",
            produces = {"application/json", "application/xml"},
            method = RequestMethod.GET)
    ResponseEntity<Ticket> getTicket(@Parameter(in = ParameterIn.PATH, description = "Ticket ID of the ticket that needs to be deleted", required = true, schema = @Schema()) @PathVariable("ticketId") Integer ticketId
    );


    @Operation(summary = "Get tickets bought by a user", description = "Get tickets bought by a user", security = {
            @SecurityRequirement(name = "ebox_office_auth", scopes = {
                    "write:ticket",
                    "read:ticket",
                    "write:userinfo",
                    "read:userinfo"})}, tags = {"ticket"})
    @ApiResponses(value = {
            @ApiResponse(responseCode = "200", description = "Array of user's tickets", content = @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = Ticket.class)))),

            @ApiResponse(responseCode = "400", description = "Invalid User ID supplied"),

            @ApiResponse(responseCode = "404", description = "User not found"),

            @ApiResponse(responseCode = "200", description = "successful operation")})
    @RequestMapping(value = "/ticket/{userId}",
            produces = {"application/json", "application/xml"},
            method = RequestMethod.GET)
    ResponseEntity<List<Ticket>> getUserTickets(@Parameter(in = ParameterIn.PATH, description = "User ID for retrieving appropriate tickets", required = true, schema = @Schema()) @PathVariable("userId") Integer userId
    );

}

