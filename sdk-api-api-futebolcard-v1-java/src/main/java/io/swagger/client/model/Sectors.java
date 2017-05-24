/*
 * API do Futebolcard
 * Futebolcard manipulation API
 *
 * OpenAPI spec version: 1.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.swagger.client.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.client.model.InlineResponse2001Gates;
import io.swagger.client.model.InlineResponse2001Map;
import java.util.ArrayList;
import java.util.List;

/**
 * Sectors
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T12:46:22.524Z")
public class Sectors {
  @SerializedName("gates")
  private List<InlineResponse2001Gates> gates = new ArrayList<InlineResponse2001Gates>();

  @SerializedName("map")
  private InlineResponse2001Map map = null;

  public Sectors gates(List<InlineResponse2001Gates> gates) {
    this.gates = gates;
    return this;
  }

  public Sectors addGatesItem(InlineResponse2001Gates gatesItem) {
    this.gates.add(gatesItem);
    return this;
  }

   /**
   * Get gates
   * @return gates
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<InlineResponse2001Gates> getGates() {
    return gates;
  }

  public void setGates(List<InlineResponse2001Gates> gates) {
    this.gates = gates;
  }

  public Sectors map(InlineResponse2001Map map) {
    this.map = map;
    return this;
  }

   /**
   * Get map
   * @return map
  **/
  @ApiModelProperty(example = "null", value = "")
  public InlineResponse2001Map getMap() {
    return map;
  }

  public void setMap(InlineResponse2001Map map) {
    this.map = map;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Sectors sectors = (Sectors) o;
    return Objects.equals(this.gates, sectors.gates) &&
        Objects.equals(this.map, sectors.map);
  }

  @Override
  public int hashCode() {
    return Objects.hash(gates, map);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Sectors {\n");
    
    sb.append("    gates: ").append(toIndentedString(gates)).append("\n");
    sb.append("    map: ").append(toIndentedString(map)).append("\n");
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

