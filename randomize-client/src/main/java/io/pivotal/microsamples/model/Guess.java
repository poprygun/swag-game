/*
 * Randomizer
 * This is a sample server Guesser server.
 *
 * OpenAPI spec version: 1.0.0
 * Contact: apiteam@guesser.io
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.pivotal.microsamples.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.joda.time.DateTime;
import java.io.Serializable;

/**
 * Guess
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-04-28T10:28:36.889-04:00")
public class Guess implements Serializable {
  private static final long serialVersionUID = 1L;

  @JsonProperty("id")
  private Long id = null;

  @JsonProperty("guessedPhrase")
  private String guessedPhrase = null;

  @JsonProperty("responsePhrase")
  private String responsePhrase = null;

  @JsonProperty("guessDate")
  private DateTime guessDate = null;

  @JsonProperty("guessed")
  private Boolean guessed = false;

  public Guess id(Long id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(example = "null", value = "")
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Guess guessedPhrase(String guessedPhrase) {
    this.guessedPhrase = guessedPhrase;
    return this;
  }

   /**
   * Get guessedPhrase
   * @return guessedPhrase
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getGuessedPhrase() {
    return guessedPhrase;
  }

  public void setGuessedPhrase(String guessedPhrase) {
    this.guessedPhrase = guessedPhrase;
  }

  public Guess responsePhrase(String responsePhrase) {
    this.responsePhrase = responsePhrase;
    return this;
  }

   /**
   * Get responsePhrase
   * @return responsePhrase
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getResponsePhrase() {
    return responsePhrase;
  }

  public void setResponsePhrase(String responsePhrase) {
    this.responsePhrase = responsePhrase;
  }

  public Guess guessDate(DateTime guessDate) {
    this.guessDate = guessDate;
    return this;
  }

   /**
   * Get guessDate
   * @return guessDate
  **/
  @ApiModelProperty(example = "null", value = "")
  public DateTime getGuessDate() {
    return guessDate;
  }

  public void setGuessDate(DateTime guessDate) {
    this.guessDate = guessDate;
  }

  public Guess guessed(Boolean guessed) {
    this.guessed = guessed;
    return this;
  }

   /**
   * Get guessed
   * @return guessed
  **/
  @ApiModelProperty(example = "null", value = "")
  public Boolean getGuessed() {
    return guessed;
  }

  public void setGuessed(Boolean guessed) {
    this.guessed = guessed;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Guess guess = (Guess) o;
    return Objects.equals(this.id, guess.id) &&
        Objects.equals(this.guessedPhrase, guess.guessedPhrase) &&
        Objects.equals(this.responsePhrase, guess.responsePhrase) &&
        Objects.equals(this.guessDate, guess.guessDate) &&
        Objects.equals(this.guessed, guess.guessed);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, guessedPhrase, responsePhrase, guessDate, guessed);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Guess {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    guessedPhrase: ").append(toIndentedString(guessedPhrase)).append("\n");
    sb.append("    responsePhrase: ").append(toIndentedString(responsePhrase)).append("\n");
    sb.append("    guessDate: ").append(toIndentedString(guessDate)).append("\n");
    sb.append("    guessed: ").append(toIndentedString(guessed)).append("\n");
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
