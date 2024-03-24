package io.swagger.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * CinemaShow
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")


public class CinemaShow {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("movie")
    private Movie movie = null;

    @JsonProperty("sessions")
    @Valid
    private List<Session> sessions = null;

    public CinemaShow id(Long id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @Schema(example = "10", description = "")

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public CinemaShow movie(Movie movie) {
        this.movie = movie;
        return this;
    }

    /**
     * Get movie
     *
     * @return movie
     **/
    @Schema(description = "")

    @Valid
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public CinemaShow sessions(List<Session> sessions) {
        this.sessions = sessions;
        return this;
    }

    public CinemaShow addSessionsItem(Session sessionsItem) {
        if (this.sessions == null) {
            this.sessions = new ArrayList<Session>();
        }
        this.sessions.add(sessionsItem);
        return this;
    }

    /**
     * Get sessions
     *
     * @return sessions
     **/
    @Schema(description = "")
    @Valid
    public List<Session> getSessions() {
        return sessions;
    }

    public void setSessions(List<Session> sessions) {
        this.sessions = sessions;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CinemaShow cinemaShow = (CinemaShow) o;
        return Objects.equals(this.id, cinemaShow.id) &&
                Objects.equals(this.movie, cinemaShow.movie) &&
                Objects.equals(this.sessions, cinemaShow.sessions);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, movie, sessions);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CinemaShow {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    movie: ").append(toIndentedString(movie)).append("\n");
        sb.append("    sessions: ").append(toIndentedString(sessions)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }
}
