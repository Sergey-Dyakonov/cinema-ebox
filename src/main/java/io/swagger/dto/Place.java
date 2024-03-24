package io.swagger.dto;

import java.util.Objects;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import io.swagger.v3.oas.annotations.media.Schema;
import org.springframework.validation.annotation.Validated;

/**
 * Place
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")


public class Place {
    @JsonProperty("id")
    private Integer id = null;

    @JsonProperty("row")
    private Integer row = null;

    @JsonProperty("seat")
    private Integer seat = null;

    @JsonProperty("isOccupied")
    private Boolean isOccupied = null;

    /**
     * Gets or Sets category
     */
    public enum CategoryEnum {
        STANDARD("Standard"),

        IMPROVED("Improved"),

        VIP("VIP"),

        LUXURY("Luxury");

        private String value;

        CategoryEnum(String value) {
            this.value = value;
        }

        @Override
        @JsonValue
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static CategoryEnum fromValue(String text) {
            for (CategoryEnum b : CategoryEnum.values()) {
                if (String.valueOf(b.value).equals(text)) {
                    return b;
                }
            }
            return null;
        }
    }

    @JsonProperty("category")
    private CategoryEnum category = null;

    public Place id(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     *
     * @return id
     **/
    @Schema(example = "1", description = "")

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Place row(Integer row) {
        this.row = row;
        return this;
    }

    /**
     * Get row
     *
     * @return row
     **/
    @Schema(example = "5", description = "")

    public Integer getRow() {
        return row;
    }

    public void setRow(Integer row) {
        this.row = row;
    }

    public Place seat(Integer seat) {
        this.seat = seat;
        return this;
    }

    /**
     * Get seat
     *
     * @return seat
     **/
    @Schema(example = "15", description = "")

    public Integer getSeat() {
        return seat;
    }

    public void setSeat(Integer seat) {
        this.seat = seat;
    }

    public Place isOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
        return this;
    }

    /**
     * Get isOccupied
     *
     * @return isOccupied
     **/
    @Schema(example = "false", description = "")

    public Boolean isIsOccupied() {
        return isOccupied;
    }

    public void setIsOccupied(Boolean isOccupied) {
        this.isOccupied = isOccupied;
    }

    public Place category(CategoryEnum category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     *
     * @return category
     **/
    @Schema(description = "")

    public CategoryEnum getCategory() {
        return category;
    }

    public void setCategory(CategoryEnum category) {
        this.category = category;
    }


    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Place place = (Place) o;
        return Objects.equals(this.id, place.id) &&
                Objects.equals(this.row, place.row) &&
                Objects.equals(this.seat, place.seat) &&
                Objects.equals(this.isOccupied, place.isOccupied) &&
                Objects.equals(this.category, place.category);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, row, seat, isOccupied, category);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Place {\n");

        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    row: ").append(toIndentedString(row)).append("\n");
        sb.append("    seat: ").append(toIndentedString(seat)).append("\n");
        sb.append("    isOccupied: ").append(toIndentedString(isOccupied)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
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
