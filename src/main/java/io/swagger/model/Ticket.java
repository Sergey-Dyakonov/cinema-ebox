package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.model.Cinema;
import io.swagger.model.Session;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Ticket
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")


public class Ticket   {
  @JsonProperty("id")
  private Integer id = null;

  @JsonProperty("cinema")
  private Cinema cinema = null;

  @JsonProperty("cinemaSession")
  private Session cinemaSession = null;

  @JsonProperty("row")
  private Integer row = null;

  @JsonProperty("seat")
  private Integer seat = null;

  @JsonProperty("date")
  private String date = null;

  @JsonProperty("startsAt")
  private String startsAt = null;

  public Ticket id(Integer id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(description = "")
  
    public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public Ticket cinema(Cinema cinema) {
    this.cinema = cinema;
    return this;
  }

  /**
   * Get cinema
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

  public Ticket cinemaSession(Session cinemaSession) {
    this.cinemaSession = cinemaSession;
    return this;
  }

  /**
   * Get cinemaSession
   * @return cinemaSession
   **/
  @Schema(description = "")
  
    @Valid
    public Session getCinemaSession() {
    return cinemaSession;
  }

  public void setCinemaSession(Session cinemaSession) {
    this.cinemaSession = cinemaSession;
  }

  public Ticket row(Integer row) {
    this.row = row;
    return this;
  }

  /**
   * Get row
   * @return row
   **/
  @Schema(example = "5", description = "")
  
    public Integer getRow() {
    return row;
  }

  public void setRow(Integer row) {
    this.row = row;
  }

  public Ticket seat(Integer seat) {
    this.seat = seat;
    return this;
  }

  /**
   * Get seat
   * @return seat
   **/
  @Schema(example = "15", description = "")
  
    public Integer getSeat() {
    return seat;
  }

  public void setSeat(Integer seat) {
    this.seat = seat;
  }

  public Ticket date(String date) {
    this.date = date;
    return this;
  }

  /**
   * Get date
   * @return date
   **/
  @Schema(example = "24.01.2024", description = "")
  
    public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public Ticket startsAt(String startsAt) {
    this.startsAt = startsAt;
    return this;
  }

  /**
   * Get startsAt
   * @return startsAt
   **/
  @Schema(example = "11:20", description = "")
  
    public String getStartsAt() {
    return startsAt;
  }

  public void setStartsAt(String startsAt) {
    this.startsAt = startsAt;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Ticket ticket = (Ticket) o;
    return Objects.equals(this.id, ticket.id) &&
        Objects.equals(this.cinema, ticket.cinema) &&
        Objects.equals(this.cinemaSession, ticket.cinemaSession) &&
        Objects.equals(this.row, ticket.row) &&
        Objects.equals(this.seat, ticket.seat) &&
        Objects.equals(this.date, ticket.date) &&
        Objects.equals(this.startsAt, ticket.startsAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cinema, cinemaSession, row, seat, date, startsAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Ticket {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    cinema: ").append(toIndentedString(cinema)).append("\n");
    sb.append("    cinemaSession: ").append(toIndentedString(cinemaSession)).append("\n");
    sb.append("    row: ").append(toIndentedString(row)).append("\n");
    sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    startsAt: ").append(toIndentedString(startsAt)).append("\n");
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
