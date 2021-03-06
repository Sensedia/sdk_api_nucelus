/*
 * API Agillitas Cartões Pré-pagos
 * API para manipular recursos relacionadas à cartões pré-pagos Agillitas.
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
 * NovoCartaoPortadorEndereco
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-01-23T20:01:43.978Z")
public class NovoCartaoPortadorEndereco {
  @SerializedName("logradouro")
  private String logradouro = null;

  @SerializedName("complemento")
  private String complemento = null;

  @SerializedName("cidade")
  private String cidade = null;

  @SerializedName("estado")
  private String estado = null;

  @SerializedName("pais")
  private String pais = null;

  @SerializedName("codigoPostal")
  private String codigoPostal = null;

  public NovoCartaoPortadorEndereco logradouro(String logradouro) {
    this.logradouro = logradouro;
    return this;
  }

   /**
   * Nome endereço do portador do cartão.
   * @return logradouro
  **/
  @ApiModelProperty(example = "null", value = "Nome endereço do portador do cartão.")
  public String getLogradouro() {
    return logradouro;
  }

  public void setLogradouro(String logradouro) {
    this.logradouro = logradouro;
  }

  public NovoCartaoPortadorEndereco complemento(String complemento) {
    this.complemento = complemento;
    return this;
  }

   /**
   * Complemento do logradouro do portador do cartão.
   * @return complemento
  **/
  @ApiModelProperty(example = "null", value = "Complemento do logradouro do portador do cartão.")
  public String getComplemento() {
    return complemento;
  }

  public void setComplemento(String complemento) {
    this.complemento = complemento;
  }

  public NovoCartaoPortadorEndereco cidade(String cidade) {
    this.cidade = cidade;
    return this;
  }

   /**
   * Nome cidade do portador do cartão.
   * @return cidade
  **/
  @ApiModelProperty(example = "null", value = "Nome cidade do portador do cartão.")
  public String getCidade() {
    return cidade;
  }

  public void setCidade(String cidade) {
    this.cidade = cidade;
  }

  public NovoCartaoPortadorEndereco estado(String estado) {
    this.estado = estado;
    return this;
  }

   /**
   * Sigla do estado do portador do cartão.
   * @return estado
  **/
  @ApiModelProperty(example = "null", value = "Sigla do estado do portador do cartão.")
  public String getEstado() {
    return estado;
  }

  public void setEstado(String estado) {
    this.estado = estado;
  }

  public NovoCartaoPortadorEndereco pais(String pais) {
    this.pais = pais;
    return this;
  }

   /**
   * Nome do pais do portador do cartão.
   * @return pais
  **/
  @ApiModelProperty(example = "null", value = "Nome do pais do portador do cartão.")
  public String getPais() {
    return pais;
  }

  public void setPais(String pais) {
    this.pais = pais;
  }

  public NovoCartaoPortadorEndereco codigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
    return this;
  }

   /**
   * Código de endereçamento postal do portador do cartão.
   * @return codigoPostal
  **/
  @ApiModelProperty(example = "null", value = "Código de endereçamento postal do portador do cartão.")
  public String getCodigoPostal() {
    return codigoPostal;
  }

  public void setCodigoPostal(String codigoPostal) {
    this.codigoPostal = codigoPostal;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartaoPortadorEndereco novoCartaoPortadorEndereco = (NovoCartaoPortadorEndereco) o;
    return Objects.equals(this.logradouro, novoCartaoPortadorEndereco.logradouro) &&
        Objects.equals(this.complemento, novoCartaoPortadorEndereco.complemento) &&
        Objects.equals(this.cidade, novoCartaoPortadorEndereco.cidade) &&
        Objects.equals(this.estado, novoCartaoPortadorEndereco.estado) &&
        Objects.equals(this.pais, novoCartaoPortadorEndereco.pais) &&
        Objects.equals(this.codigoPostal, novoCartaoPortadorEndereco.codigoPostal);
  }

  @Override
  public int hashCode() {
    return Objects.hash(logradouro, complemento, cidade, estado, pais, codigoPostal);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartaoPortadorEndereco {\n");
    
    sb.append("    logradouro: ").append(toIndentedString(logradouro)).append("\n");
    sb.append("    complemento: ").append(toIndentedString(complemento)).append("\n");
    sb.append("    cidade: ").append(toIndentedString(cidade)).append("\n");
    sb.append("    estado: ").append(toIndentedString(estado)).append("\n");
    sb.append("    pais: ").append(toIndentedString(pais)).append("\n");
    sb.append("    codigoPostal: ").append(toIndentedString(codigoPostal)).append("\n");
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

