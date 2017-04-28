package io.pivotal.microsamples.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.Serializable;
import javax.validation.constraints.*;
/**
 * Health
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-04-28T09:58:46.624-04:00")

public class Health  implements Serializable {
  @JsonProperty("health")
  private String health = null;

  public Health health(String health) {
    this.health = health;
    return this;
  }

   /**
   * Get health
   * @return health
  **/
  @ApiModelProperty(value = "")
  public String getHealth() {
    return health;
  }

  public void setHealth(String health) {
    this.health = health;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Health health = (Health) o;
    return Objects.equals(this.health, health.health);
  }

  @Override
  public int hashCode() {
    return Objects.hash(health);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Health {\n");
    
    sb.append("    health: ").append(toIndentedString(health)).append("\n");
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

