package io.swagger.dto;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import io.swagger.v3.oas.annotations.media.Schema;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;

/**
 * Movie
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2024-03-18T01:58:10.474290169Z[GMT]")


public class Movie   {
  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("movieTitle")
  private String movieTitle = null;

  @JsonProperty("description")
  private String description = null;

  @JsonProperty("posterUrl")
  private String posterUrl = null;

  @JsonProperty("limitations")
  private String limitations = null;

  @JsonProperty("duration")
  private Integer duration = null;

  @JsonProperty("showStartDate")
  private String showStartDate = null;

  @JsonProperty("filmedIn")
  private Integer filmedIn = null;

  @JsonProperty("genre")
  @Valid
  private List<String> genre = null;

  @JsonProperty("country")
  private String country = null;

  @JsonProperty("cast")
  @Valid
  private List<String> cast = null;

  @JsonProperty("producers")
  @Valid
  private List<String> producers = null;

  public Movie id(Long id) {
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

  public Movie movieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
    return this;
  }

  /**
   * Get movieTitle
   * @return movieTitle
   **/
  @Schema(example = "Duna Part 2", description = "")
  
    public String getMovieTitle() {
    return movieTitle;
  }

  public void setMovieTitle(String movieTitle) {
    this.movieTitle = movieTitle;
  }

  public Movie description(String description) {
    this.description = description;
    return this;
  }

  /**
   * Get description
   * @return description
   **/
  @Schema(example = "Really cool movie", description = "")
  
    public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public Movie posterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
    return this;
  }

  /**
   * Get posterUrl
   * @return posterUrl
   **/
  @Schema(example = "https://posters.ebox-office.com/poster_1", description = "")
  
    public String getPosterUrl() {
    return posterUrl;
  }

  public void setPosterUrl(String posterUrl) {
    this.posterUrl = posterUrl;
  }

  public Movie limitations(String limitations) {
    this.limitations = limitations;
    return this;
  }

  /**
   * Get limitations
   * @return limitations
   **/
  @Schema(example = "16+", description = "")
  
    public String getLimitations() {
    return limitations;
  }

  public void setLimitations(String limitations) {
    this.limitations = limitations;
  }

  public Movie duration(Integer duration) {
    this.duration = duration;
    return this;
  }

  /**
   * Get duration
   * @return duration
   **/
  @Schema(example = "166", description = "")
  
    public Integer getDuration() {
    return duration;
  }

  public void setDuration(Integer duration) {
    this.duration = duration;
  }

  public Movie showStartDate(String showStartDate) {
    this.showStartDate = showStartDate;
    return this;
  }

  /**
   * Get showStartDate
   * @return showStartDate
   **/
  @Schema(example = "01.01.2024", description = "")
  
    public String getShowStartDate() {
    return showStartDate;
  }

  public void setShowStartDate(String showStartDate) {
    this.showStartDate = showStartDate;
  }

  public Movie filmedIn(Integer filmedIn) {
    this.filmedIn = filmedIn;
    return this;
  }

  /**
   * Get filmedIn
   * @return filmedIn
   **/
  @Schema(example = "2024", description = "")
  
    public Integer getFilmedIn() {
    return filmedIn;
  }

  public void setFilmedIn(Integer filmedIn) {
    this.filmedIn = filmedIn;
  }

  public Movie genre(List<String> genre) {
    this.genre = genre;
    return this;
  }

  public Movie addGenreItem(String genreItem) {
    if (this.genre == null) {
      this.genre = new ArrayList<String>();
    }
    this.genre.add(genreItem);
    return this;
  }

  /**
   * Get genre
   * @return genre
   **/
  @Schema(example = "[\"science-fiction\",\"blockbuster\",\"adventure\"]", description = "")
  
    public List<String> getGenre() {
    return genre;
  }

  public void setGenre(List<String> genre) {
    this.genre = genre;
  }

  public Movie country(String country) {
    this.country = country;
    return this;
  }

  /**
   * Get country
   * @return country
   **/
  @Schema(example = "USA", description = "")
  
    public String getCountry() {
    return country;
  }

  public void setCountry(String country) {
    this.country = country;
  }

  public Movie cast(List<String> cast) {
    this.cast = cast;
    return this;
  }

  public Movie addCastItem(String castItem) {
    if (this.cast == null) {
      this.cast = new ArrayList<String>();
    }
    this.cast.add(castItem);
    return this;
  }

  /**
   * Get cast
   * @return cast
   **/
  @Schema(example = "[\"Thimothy Shaloma\",\"Zendeya\"]", description = "")
  
    public List<String> getCast() {
    return cast;
  }

  public void setCast(List<String> cast) {
    this.cast = cast;
  }

  public Movie producers(List<String> producers) {
    this.producers = producers;
    return this;
  }

  public Movie addProducersItem(String producersItem) {
    if (this.producers == null) {
      this.producers = new ArrayList<String>();
    }
    this.producers.add(producersItem);
    return this;
  }

  /**
   * Get producers
   * @return producers
   **/
  @Schema(example = "[\"Deni Vilnyov\"]", description = "")
  
    public List<String> getProducers() {
    return producers;
  }

  public void setProducers(List<String> producers) {
    this.producers = producers;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Movie movie = (Movie) o;
    return Objects.equals(this.id, movie.id) &&
        Objects.equals(this.movieTitle, movie.movieTitle) &&
        Objects.equals(this.description, movie.description) &&
        Objects.equals(this.posterUrl, movie.posterUrl) &&
        Objects.equals(this.limitations, movie.limitations) &&
        Objects.equals(this.duration, movie.duration) &&
        Objects.equals(this.showStartDate, movie.showStartDate) &&
        Objects.equals(this.filmedIn, movie.filmedIn) &&
        Objects.equals(this.genre, movie.genre) &&
        Objects.equals(this.country, movie.country) &&
        Objects.equals(this.cast, movie.cast) &&
        Objects.equals(this.producers, movie.producers);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, movieTitle, description, posterUrl, limitations, duration, showStartDate, filmedIn, genre, country, cast, producers);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Movie {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    movieTitle: ").append(toIndentedString(movieTitle)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    posterUrl: ").append(toIndentedString(posterUrl)).append("\n");
    sb.append("    limitations: ").append(toIndentedString(limitations)).append("\n");
    sb.append("    duration: ").append(toIndentedString(duration)).append("\n");
    sb.append("    showStartDate: ").append(toIndentedString(showStartDate)).append("\n");
    sb.append("    filmedIn: ").append(toIndentedString(filmedIn)).append("\n");
    sb.append("    genre: ").append(toIndentedString(genre)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    cast: ").append(toIndentedString(cast)).append("\n");
    sb.append("    producers: ").append(toIndentedString(producers)).append("\n");
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
