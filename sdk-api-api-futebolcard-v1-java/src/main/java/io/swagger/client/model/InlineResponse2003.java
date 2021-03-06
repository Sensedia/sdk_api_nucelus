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
import io.swagger.client.model.EventseventIdsectorssectorIdsubsectorssubsectorIdSeats;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse2003
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-24T12:46:22.524Z")
public class InlineResponse2003 {
  @SerializedName("rowId")
  private String rowId = null;

  @SerializedName("rowAlias")
  private String rowAlias = null;

  @SerializedName("rowName")
  private String rowName = null;

  @SerializedName("seats")
  private List<EventseventIdsectorssectorIdsubsectorssubsectorIdSeats> seats = new ArrayList<EventseventIdsectorssectorIdsubsectorssubsectorIdSeats>();

  public InlineResponse2003 rowId(String rowId) {
    this.rowId = rowId;
    return this;
  }

   /**
   * Get rowId
   * @return rowId
  **/
  @ApiModelProperty(example = "831411", value = "")
  public String getRowId() {
    return rowId;
  }

  public void setRowId(String rowId) {
    this.rowId = rowId;
  }

  public InlineResponse2003 rowAlias(String rowAlias) {
    this.rowAlias = rowAlias;
    return this;
  }

   /**
   * Get rowAlias
   * @return rowAlias
  **/
  @ApiModelProperty(example = "SETORC-R", value = "")
  public String getRowAlias() {
    return rowAlias;
  }

  public void setRowAlias(String rowAlias) {
    this.rowAlias = rowAlias;
  }

  public InlineResponse2003 rowName(String rowName) {
    this.rowName = rowName;
    return this;
  }

   /**
   * Get rowName
   * @return rowName
  **/
  @ApiModelProperty(example = "R", value = "")
  public String getRowName() {
    return rowName;
  }

  public void setRowName(String rowName) {
    this.rowName = rowName;
  }

  public InlineResponse2003 seats(List<EventseventIdsectorssectorIdsubsectorssubsectorIdSeats> seats) {
    this.seats = seats;
    return this;
  }

  public InlineResponse2003 addSeatsItem(EventseventIdsectorssectorIdsubsectorssubsectorIdSeats seatsItem) {
    this.seats.add(seatsItem);
    return this;
  }

   /**
   * Get seats
   * @return seats
  **/
  @ApiModelProperty(example = "null", value = "")
  public List<EventseventIdsectorssectorIdsubsectorssubsectorIdSeats> getSeats() {
    return seats;
  }

  public void setSeats(List<EventseventIdsectorssectorIdsubsectorssubsectorIdSeats> seats) {
    this.seats = seats;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2003 inlineResponse2003 = (InlineResponse2003) o;
    return Objects.equals(this.rowId, inlineResponse2003.rowId) &&
        Objects.equals(this.rowAlias, inlineResponse2003.rowAlias) &&
        Objects.equals(this.rowName, inlineResponse2003.rowName) &&
        Objects.equals(this.seats, inlineResponse2003.seats);
  }

  @Override
  public int hashCode() {
    return Objects.hash(rowId, rowAlias, rowName, seats);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2003 {\n");
    
    sb.append("    rowId: ").append(toIndentedString(rowId)).append("\n");
    sb.append("    rowAlias: ").append(toIndentedString(rowAlias)).append("\n");
    sb.append("    rowName: ").append(toIndentedString(rowName)).append("\n");
    sb.append("    seats: ").append(toIndentedString(seats)).append("\n");
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

