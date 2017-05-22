/*
 * API dos Correios
 * Postal Object tracking API
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

/**
 * Customer Model
 */
@ApiModel(description = "Customer Model")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-05-22T17:11:14.521Z")
public class ObjectsEventos {
  @SerializedName("objectCode")
  private String objectCode = null;

  @SerializedName("eventType")
  private String eventType = null;

  @SerializedName("eventStatus")
  private Integer eventStatus = null;

  @SerializedName("eventDescription")
  private String eventDescription = null;

  @SerializedName("unitName")
  private String unitName = null;

  @SerializedName("SROCode")
  private String srOCode = null;

  @SerializedName("county")
  private String county = null;

  @SerializedName("state")
  private String state = null;

  @SerializedName("MCUCode")
  private String mcUCode = null;

  @SerializedName("DRCode")
  private String drCode = null;

  @SerializedName("DRAbbreviation")
  private String drAbbreviation = null;

  @SerializedName("listNumber")
  private String listNumber = null;

  @SerializedName("station")
  private Integer station = null;

  @SerializedName("user")
  private String user = null;

  @SerializedName("recordingDate")
  private String recordingDate = null;

  @SerializedName("deliveryman")
  private String deliveryman = null;

  @SerializedName("creationDate")
  private String creationDate = null;

  @SerializedName("blockAction")
  private Integer blockAction = null;

  public ObjectsEventos objectCode(String objectCode) {
    this.objectCode = objectCode;
    return this;
  }

   /**
   * 
   * @return objectCode
  **/
  @ApiModelProperty(example = "PL177497655BR", value = "")
  public String getObjectCode() {
    return objectCode;
  }

  public void setObjectCode(String objectCode) {
    this.objectCode = objectCode;
  }

  public ObjectsEventos eventType(String eventType) {
    this.eventType = eventType;
    return this;
  }

   /**
   * 
   * @return eventType
  **/
  @ApiModelProperty(example = "OEC", value = "")
  public String getEventType() {
    return eventType;
  }

  public void setEventType(String eventType) {
    this.eventType = eventType;
  }

  public ObjectsEventos eventStatus(Integer eventStatus) {
    this.eventStatus = eventStatus;
    return this;
  }

   /**
   * 
   * @return eventStatus
  **/
  @ApiModelProperty(example = "1", value = "")
  public Integer getEventStatus() {
    return eventStatus;
  }

  public void setEventStatus(Integer eventStatus) {
    this.eventStatus = eventStatus;
  }

  public ObjectsEventos eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

   /**
   * 
   * @return eventDescription
  **/
  @ApiModelProperty(example = "Saiu para entrega ao destinatário", value = "")
  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  public ObjectsEventos unitName(String unitName) {
    this.unitName = unitName;
    return this;
  }

   /**
   * 
   * @return unitName
  **/
  @ApiModelProperty(example = "CEE PAMPULHA", value = "")
  public String getUnitName() {
    return unitName;
  }

  public void setUnitName(String unitName) {
    this.unitName = unitName;
  }

  public ObjectsEventos srOCode(String srOCode) {
    this.srOCode = srOCode;
    return this;
  }

   /**
   * 
   * @return srOCode
  **/
  @ApiModelProperty(example = "31277971", value = "")
  public String getSrOCode() {
    return srOCode;
  }

  public void setSrOCode(String srOCode) {
    this.srOCode = srOCode;
  }

  public ObjectsEventos county(String county) {
    this.county = county;
    return this;
  }

   /**
   * 
   * @return county
  **/
  @ApiModelProperty(example = "BELO HORIZONTE", value = "")
  public String getCounty() {
    return county;
  }

  public void setCounty(String county) {
    this.county = county;
  }

  public ObjectsEventos state(String state) {
    this.state = state;
    return this;
  }

   /**
   * 
   * @return state
  **/
  @ApiModelProperty(example = "MG", value = "")
  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  public ObjectsEventos mcUCode(String mcUCode) {
    this.mcUCode = mcUCode;
    return this;
  }

   /**
   * 
   * @return mcUCode
  **/
  @ApiModelProperty(example = "", value = "")
  public String getMcUCode() {
    return mcUCode;
  }

  public void setMcUCode(String mcUCode) {
    this.mcUCode = mcUCode;
  }

  public ObjectsEventos drCode(String drCode) {
    this.drCode = drCode;
    return this;
  }

   /**
   * 
   * @return drCode
  **/
  @ApiModelProperty(example = "", value = "")
  public String getDrCode() {
    return drCode;
  }

  public void setDrCode(String drCode) {
    this.drCode = drCode;
  }

  public ObjectsEventos drAbbreviation(String drAbbreviation) {
    this.drAbbreviation = drAbbreviation;
    return this;
  }

   /**
   * 
   * @return drAbbreviation
  **/
  @ApiModelProperty(example = "", value = "")
  public String getDrAbbreviation() {
    return drAbbreviation;
  }

  public void setDrAbbreviation(String drAbbreviation) {
    this.drAbbreviation = drAbbreviation;
  }

  public ObjectsEventos listNumber(String listNumber) {
    this.listNumber = listNumber;
    return this;
  }

   /**
   * 
   * @return listNumber
  **/
  @ApiModelProperty(example = "", value = "")
  public String getListNumber() {
    return listNumber;
  }

  public void setListNumber(String listNumber) {
    this.listNumber = listNumber;
  }

  public ObjectsEventos station(Integer station) {
    this.station = station;
    return this;
  }

   /**
   * 
   * @return station
  **/
  @ApiModelProperty(example = "", value = "")
  public Integer getStation() {
    return station;
  }

  public void setStation(Integer station) {
    this.station = station;
  }

  public ObjectsEventos user(String user) {
    this.user = user;
    return this;
  }

   /**
   * 
   * @return user
  **/
  @ApiModelProperty(example = "", value = "")
  public String getUser() {
    return user;
  }

  public void setUser(String user) {
    this.user = user;
  }

  public ObjectsEventos recordingDate(String recordingDate) {
    this.recordingDate = recordingDate;
    return this;
  }

   /**
   * 
   * @return recordingDate
  **/
  @ApiModelProperty(example = "", value = "")
  public String getRecordingDate() {
    return recordingDate;
  }

  public void setRecordingDate(String recordingDate) {
    this.recordingDate = recordingDate;
  }

  public ObjectsEventos deliveryman(String deliveryman) {
    this.deliveryman = deliveryman;
    return this;
  }

   /**
   * 
   * @return deliveryman
  **/
  @ApiModelProperty(example = "", value = "")
  public String getDeliveryman() {
    return deliveryman;
  }

  public void setDeliveryman(String deliveryman) {
    this.deliveryman = deliveryman;
  }

  public ObjectsEventos creationDate(String creationDate) {
    this.creationDate = creationDate;
    return this;
  }

   /**
   * 
   * @return creationDate
  **/
  @ApiModelProperty(example = "11/05/2017 12:16:54", value = "")
  public String getCreationDate() {
    return creationDate;
  }

  public void setCreationDate(String creationDate) {
    this.creationDate = creationDate;
  }

  public ObjectsEventos blockAction(Integer blockAction) {
    this.blockAction = blockAction;
    return this;
  }

   /**
   * 
   * @return blockAction
  **/
  @ApiModelProperty(example = "", value = "")
  public Integer getBlockAction() {
    return blockAction;
  }

  public void setBlockAction(Integer blockAction) {
    this.blockAction = blockAction;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ObjectsEventos objectsEventos = (ObjectsEventos) o;
    return Objects.equals(this.objectCode, objectsEventos.objectCode) &&
        Objects.equals(this.eventType, objectsEventos.eventType) &&
        Objects.equals(this.eventStatus, objectsEventos.eventStatus) &&
        Objects.equals(this.eventDescription, objectsEventos.eventDescription) &&
        Objects.equals(this.unitName, objectsEventos.unitName) &&
        Objects.equals(this.srOCode, objectsEventos.srOCode) &&
        Objects.equals(this.county, objectsEventos.county) &&
        Objects.equals(this.state, objectsEventos.state) &&
        Objects.equals(this.mcUCode, objectsEventos.mcUCode) &&
        Objects.equals(this.drCode, objectsEventos.drCode) &&
        Objects.equals(this.drAbbreviation, objectsEventos.drAbbreviation) &&
        Objects.equals(this.listNumber, objectsEventos.listNumber) &&
        Objects.equals(this.station, objectsEventos.station) &&
        Objects.equals(this.user, objectsEventos.user) &&
        Objects.equals(this.recordingDate, objectsEventos.recordingDate) &&
        Objects.equals(this.deliveryman, objectsEventos.deliveryman) &&
        Objects.equals(this.creationDate, objectsEventos.creationDate) &&
        Objects.equals(this.blockAction, objectsEventos.blockAction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectCode, eventType, eventStatus, eventDescription, unitName, srOCode, county, state, mcUCode, drCode, drAbbreviation, listNumber, station, user, recordingDate, deliveryman, creationDate, blockAction);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ObjectsEventos {\n");
    
    sb.append("    objectCode: ").append(toIndentedString(objectCode)).append("\n");
    sb.append("    eventType: ").append(toIndentedString(eventType)).append("\n");
    sb.append("    eventStatus: ").append(toIndentedString(eventStatus)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
    sb.append("    unitName: ").append(toIndentedString(unitName)).append("\n");
    sb.append("    srOCode: ").append(toIndentedString(srOCode)).append("\n");
    sb.append("    county: ").append(toIndentedString(county)).append("\n");
    sb.append("    state: ").append(toIndentedString(state)).append("\n");
    sb.append("    mcUCode: ").append(toIndentedString(mcUCode)).append("\n");
    sb.append("    drCode: ").append(toIndentedString(drCode)).append("\n");
    sb.append("    drAbbreviation: ").append(toIndentedString(drAbbreviation)).append("\n");
    sb.append("    listNumber: ").append(toIndentedString(listNumber)).append("\n");
    sb.append("    station: ").append(toIndentedString(station)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    recordingDate: ").append(toIndentedString(recordingDate)).append("\n");
    sb.append("    deliveryman: ").append(toIndentedString(deliveryman)).append("\n");
    sb.append("    creationDate: ").append(toIndentedString(creationDate)).append("\n");
    sb.append("    blockAction: ").append(toIndentedString(blockAction)).append("\n");
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
