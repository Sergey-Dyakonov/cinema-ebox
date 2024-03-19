package io.swagger.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Session
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")


public class Session   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("sessionType")
  @Valid
  private List<String> sessionType = null;

  @JsonProperty("time")
  private String time = null;

  @JsonProperty("cinemaRoom")
  private String cinemaRoom = null;

  public Session id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
   **/
  @Schema(example = "10", description = "")
  
    public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Session sessionType(List<String> sessionType) {
    this.sessionType = sessionType;
    return this;
  }

  public Session addSessionTypeItem(String sessionTypeItem) {
    if (this.sessionType == null) {
      this.sessionType = new ArrayList<String>();
    }
    this.sessionType.add(sessionTypeItem);
    return this;
  }

  /**
   * Get sessionType
   * @return sessionType
   **/
  @Schema(example = "[\"3D\",\"VIP\"]", description = "")
  
    public List<String> getSessionType() {
    return sessionType;
  }

  public void setSessionType(List<String> sessionType) {
    this.sessionType = sessionType;
  }

  public Session time(String time) {
    this.time = time;
    return this;
  }

  /**
   * Get time
   * @return time
   **/
  @Schema(example = "11:20", description = "")
  
    public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  public Session cinemaRoom(String cinemaRoom) {
    this.cinemaRoom = cinemaRoom;
    return this;
  }

  /**
   * Get cinemaRoom
   * @return cinemaRoom
   **/
  @Schema(example = "Red room", description = "")
  
    public String getCinemaRoom() {
    return cinemaRoom;
  }

  public void setCinemaRoom(String cinemaRoom) {
    this.cinemaRoom = cinemaRoom;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Session session = (Session) o;
    return Objects.equals(this.id, session.id) &&
        Objects.equals(this.sessionType, session.sessionType) &&
        Objects.equals(this.time, session.time) &&
        Objects.equals(this.cinemaRoom, session.cinemaRoom);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, sessionType, time, cinemaRoom);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Session {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    sessionType: ").append(toIndentedString(sessionType)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
    sb.append("    cinemaRoom: ").append(toIndentedString(cinemaRoom)).append("\n");
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
