package io.swagger.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.ArrayList;
import java.util.List;

import org.springframework.validation.annotation.Validated;

import javax.validation.Valid;

/**
 * FullSession
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")


public class FullSession {
    @JsonProperty("session")
    private Session session = null;

    @JsonProperty("movie")
    private Movie movie = null;

    @JsonProperty("cinema")
    private Cinema cinema = null;

    @JsonProperty("places")
    @Valid
    private List<Place> places = null;

    @JsonProperty("prices")
    private Object prices = null;

    public FullSession session(Session session) {
        this.session = session;
        return this;
    }

    /**
     * Get session
     *
     * @return session
     **/
    @Schema(description = "")

    @Valid
    public Session getSession() {
        return session;
    }

    public void setSession(Session session) {
        this.session = session;
    }

    public FullSession movie(Movie movie) {
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

    public FullSession cinema(Cinema cinema) {
        this.cinema = cinema;
        return this;
    }

    /**
     * Get cinema
     *
     * @return cinema
     **/
    @Schema(description = "")

    @Valid
    public Cinema getCinema() {
        return cinema;
    }

    public void setCinema(Cinema cinema) {
        this.cinema = cinema;
    }

    public FullSession places(List<Place> places) {
        this.places = places;
        return this;
    }

    public FullSession addPlacesItem(Place placesItem) {
        if (this.places == null) {
            this.places = new ArrayList<Place>();
        }
        this.places.add(placesItem);
        return this;
    }

    /**
     * Get places
     *
     * @return places
     **/
    @Schema(description = "")
    @Valid
    public List<Place> getPlaces() {
        return places;
    }

    public void setPlaces(List<Place> places) {
        this.places = places;
    }

    public FullSession prices(Object prices) {
        this.prices = prices;
        return this;
    }

    /**
     * Get prices
     *
     * @return prices
     **/
    @Schema(example = "{\"VIP\":500,\"Standard\":200}", description = "")

    public Object getPrices() {
        return prices;
    }

    public void setPrices(Object prices) {
        this.prices = prices;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        FullSession fullSession = (FullSession) o;
        return Objects.equals(this.session, fullSession.session) &&
                Objects.equals(this.movie, fullSession.movie) &&
                Objects.equals(this.cinema, fullSession.cinema) &&
                Objects.equals(this.places, fullSession.places) &&
                Objects.equals(this.prices, fullSession.prices);
    }

    @Override
    public int hashCode() {
        return Objects.hash(session, movie, cinema, places, prices);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FullSession {\n");

        sb.append("    session: ").append(toIndentedString(session)).append("\n");
        sb.append("    movie: ").append(toIndentedString(movie)).append("\n");
        sb.append("    cinema: ").append(toIndentedString(cinema)).append("\n");
        sb.append("    places: ").append(toIndentedString(places)).append("\n");
        sb.append("    prices: ").append(toIndentedString(prices)).append("\n");
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
