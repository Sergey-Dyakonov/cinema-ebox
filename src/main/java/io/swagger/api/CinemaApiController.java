package io.swagger.api;

import io.swagger.model.Cinema;
import io.swagger.model.CinemaShow;
import io.swagger.model.FullSession;
import io.swagger.model.Movie;
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
public class CinemaApiController implements CinemaApi {

    private static final Logger log = LoggerFactory.getLogger(CinemaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @org.springframework.beans.factory.annotation.Autowired
    public CinemaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<CinemaShow>> getCinemaShows(@Parameter(in = ParameterIn.PATH, description = "ID of cinema to return", required = true, schema = @Schema()) @PathVariable("cinemaId") Long cinemaId
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<CinemaShow>>(objectMapper.readValue("[ {\n  \"sessions\" : [ {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  }, {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"id\" : 10\n}, {\n  \"sessions\" : [ {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  }, {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"id\" : 10\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<CinemaShow>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<CinemaShow>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Cinema>> getCinemas() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Cinema>>(objectMapper.readValue("[ {\n  \"address\" : \"Sporty Sq., 2, 02217\",\n  \"cinemaName\" : \"Oskar\",\n  \"id\" : 10\n}, {\n  \"address\" : \"Sporty Sq., 2, 02217\",\n  \"cinemaName\" : \"Oskar\",\n  \"id\" : 10\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Cinema>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Cinema>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Movie>> getMovies(@Parameter(in = ParameterIn.PATH, description = "ID of cinema to return", required = true, schema = @Schema()) @PathVariable("cinemaId") Long cinemaId
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<Movie>>(objectMapper.readValue("[ {\n  \"duration\" : 166,\n  \"country\" : \"USA\",\n  \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n  \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n  \"showStartDate\" : \"01.01.2024\",\n  \"filmedIn\" : 2024,\n  \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n  \"description\" : \"Really cool movie\",\n  \"id\" : 10,\n  \"movieTitle\" : \"Duna Part 2\",\n  \"limitations\" : \"16+\",\n  \"producers\" : [ \"Deni Vilnyov\" ]\n}, {\n  \"duration\" : 166,\n  \"country\" : \"USA\",\n  \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n  \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n  \"showStartDate\" : \"01.01.2024\",\n  \"filmedIn\" : 2024,\n  \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n  \"description\" : \"Really cool movie\",\n  \"id\" : 10,\n  \"movieTitle\" : \"Duna Part 2\",\n  \"limitations\" : \"16+\",\n  \"producers\" : [ \"Deni Vilnyov\" ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Movie>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Movie>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<FullSession>> getSession(@Parameter(in = ParameterIn.PATH, description = "ID of cinema", required = true, schema = @Schema()) @PathVariable("cinemaId") Long cinemaId
            , @Parameter(in = ParameterIn.PATH, description = "ID of session", required = true, schema = @Schema()) @PathVariable("sessionId") Long sessionId
    ) {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
                return new ResponseEntity<List<FullSession>>(objectMapper.readValue("[ {\n  \"places\" : [ {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  }, {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"session\" : {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  },\n  \"cinema\" : {\n    \"address\" : \"Sporty Sq., 2, 02217\",\n    \"cinemaName\" : \"Oskar\",\n    \"id\" : 10\n  },\n  \"prices\" : {\n    \"VIP\" : 500,\n    \"Standard\" : 200\n  }\n}, {\n  \"places\" : [ {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  }, {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"session\" : {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  },\n  \"cinema\" : {\n    \"address\" : \"Sporty Sq., 2, 02217\",\n    \"cinemaName\" : \"Oskar\",\n    \"id\" : 10\n  },\n  \"prices\" : {\n    \"VIP\" : 500,\n    \"Standard\" : 200\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
            } catch (IOException e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<FullSession>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<FullSession>>(HttpStatus.NOT_IMPLEMENTED);
    }

}
