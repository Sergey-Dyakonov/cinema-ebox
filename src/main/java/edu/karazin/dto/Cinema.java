package edu.karazin.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Cinema
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")


public class Cinema {
    @JsonProperty("id")
    private Long id = null;

    @JsonProperty("cinemaName")
    private String cinemaName = null;

    @JsonProperty("address")
    private String address = null;

    public Cinema id(Long id) {
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

    public Cinema cinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
        return this;
    }

    /**
     * Get cinemaName
     *
     * @return cinemaName
     **/
    @Schema(example = "Oskar", description = "")

    public String getCinemaName() {
        return cinemaName;
    }

    public void setCinemaName(String cinemaName) {
        this.cinemaName = cinemaName;
    }

    public Cinema address(String address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    @Schema(example = "Sporty Sq., 2, 02217", description = "")

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Cinema cinema = (Cinema) o;
        return Objects.equals(this.id, cinema.id) &&
                Objects.equals(this.cinemaName, cinema.cinemaName) &&
                Objects.equals(this.address, cinema.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, cinemaName, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Cinema {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cinemaName: ").append(toIndentedString(cinemaName)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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
