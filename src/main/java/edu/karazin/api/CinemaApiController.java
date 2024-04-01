package edu.karazin.api;

import edu.karazin.dto.Cinema;
import edu.karazin.dto.CinemaShow;
import edu.karazin.dto.FullSession;
import edu.karazin.dto.Movie;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import io.swagger.v3.oas.annotations.media.Schema;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.List;

@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")
@RestController
public class CinemaApiController implements CinemaApi {

    private static final Logger log = LoggerFactory.getLogger(CinemaApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    public CinemaApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<List<CinemaShow>> getCinemaShows(@Parameter(in = ParameterIn.PATH, description = "ID of cinema to return", required = true, schema = @Schema()) @PathVariable("cinemaId") Long cinemaId) {
        try {
            return new ResponseEntity<List<CinemaShow>>(objectMapper.readValue("[ {\n  \"sessions\" : [ {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  }, {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"id\" : 10\n}, {\n  \"sessions\" : [ {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  }, {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"id\" : 10\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<CinemaShow>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Cinema>> getCinemas() {
        try {
            return new ResponseEntity<List<Cinema>>(objectMapper.readValue("[ {\n  \"address\" : \"Sporty Sq., 2, 02217\",\n  \"cinemaName\" : \"Oskar\",\n  \"id\" : 10\n}, {\n  \"address\" : \"Sporty Sq., 2, 02217\",\n  \"cinemaName\" : \"Oskar\",\n  \"id\" : 10\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Cinema>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<Movie>> getMovies(@Parameter(in = ParameterIn.PATH, description = "ID of cinema to return", required = true, schema = @Schema()) @PathVariable("cinemaId") Long cinemaId) {
        try {
            return new ResponseEntity<List<Movie>>(objectMapper.readValue("[ {\n  \"duration\" : 166,\n  \"country\" : \"USA\",\n  \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n  \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n  \"showStartDate\" : \"01.01.2024\",\n  \"filmedIn\" : 2024,\n  \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n  \"description\" : \"Really cool movie\",\n  \"id\" : 10,\n  \"movieTitle\" : \"Duna Part 2\",\n  \"limitations\" : \"16+\",\n  \"producers\" : [ \"Deni Vilnyov\" ]\n}, {\n  \"duration\" : 166,\n  \"country\" : \"USA\",\n  \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n  \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n  \"showStartDate\" : \"01.01.2024\",\n  \"filmedIn\" : 2024,\n  \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n  \"description\" : \"Really cool movie\",\n  \"id\" : 10,\n  \"movieTitle\" : \"Duna Part 2\",\n  \"limitations\" : \"16+\",\n  \"producers\" : [ \"Deni Vilnyov\" ]\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<Movie>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    public ResponseEntity<List<FullSession>> getSession(@Parameter(in = ParameterIn.PATH, description = "ID of cinema", required = true, schema = @Schema()) @PathVariable("cinemaId") Long cinemaId,
                                                        @Parameter(in = ParameterIn.PATH, description = "ID of session", required = true, schema = @Schema()) @PathVariable("sessionId") Long sessionId) {
        try {
            return new ResponseEntity<List<FullSession>>(objectMapper.readValue("[ {\n  \"places\" : [ {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  }, {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"session\" : {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  },\n  \"cinema\" : {\n    \"address\" : \"Sporty Sq., 2, 02217\",\n    \"cinemaName\" : \"Oskar\",\n    \"id\" : 10\n  },\n  \"prices\" : {\n    \"VIP\" : 500,\n    \"Standard\" : 200\n  }\n}, {\n  \"places\" : [ {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  }, {\n    \"seat\" : 15,\n    \"isOccupied\" : false,\n    \"id\" : 1,\n    \"row\" : 5,\n    \"category\" : \"Standard\"\n  } ],\n  \"movie\" : {\n    \"duration\" : 166,\n    \"country\" : \"USA\",\n    \"cast\" : [ \"Thimothy Shaloma\", \"Zendeya\" ],\n    \"posterUrl\" : \"https://posters.ebox-office.com/poster_1\",\n    \"showStartDate\" : \"01.01.2024\",\n    \"filmedIn\" : 2024,\n    \"genre\" : [ \"science-fiction\", \"blockbuster\", \"adventure\" ],\n    \"description\" : \"Really cool movie\",\n    \"id\" : 10,\n    \"movieTitle\" : \"Duna Part 2\",\n    \"limitations\" : \"16+\",\n    \"producers\" : [ \"Deni Vilnyov\" ]\n  },\n  \"session\" : {\n    \"cinemaRoom\" : \"Red room\",\n    \"sessionType\" : [ \"3D\", \"VIP\" ],\n    \"id\" : 10,\n    \"time\" : \"11:20\"\n  },\n  \"cinema\" : {\n    \"address\" : \"Sporty Sq., 2, 02217\",\n    \"cinemaName\" : \"Oskar\",\n    \"id\" : 10\n  },\n  \"prices\" : {\n    \"VIP\" : 500,\n    \"Standard\" : 200\n  }\n} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
        } catch (IOException e) {
            log.error("Couldn't serialize response for content type application/json", e);
            return new ResponseEntity<List<FullSession>>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
}
