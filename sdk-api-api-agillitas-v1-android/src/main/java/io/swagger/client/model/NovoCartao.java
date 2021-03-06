/**
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

import io.swagger.client.model.NovoCartaoPortador;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class NovoCartao {
  
  @SerializedName("idCartao")
  private String idCartao = null;
  @SerializedName("valor")
  private Double valor = null;
  @SerializedName("contrasenha")
  private String contrasenha = null;
  @SerializedName("portador")
  private NovoCartaoPortador portador = null;

  /**
   * Número identificador referente ao proxy do cartão.
   **/
  @ApiModelProperty(value = "Número identificador referente ao proxy do cartão.")
  public String getIdCartao() {
    return idCartao;
  }
  public void setIdCartao(String idCartao) {
    this.idCartao = idCartao;
  }

  /**
   * Valor monetário a ser creditado na conta do cartão.
   **/
  @ApiModelProperty(value = "Valor monetário a ser creditado na conta do cartão.")
  public Double getValor() {
    return valor;
  }
  public void setValor(Double valor) {
    this.valor = valor;
  }

  /**
   * Senha informada ao se requisitar o do cartão
   **/
  @ApiModelProperty(value = "Senha informada ao se requisitar o do cartão")
  public String getContrasenha() {
    return contrasenha;
  }
  public void setContrasenha(String contrasenha) {
    this.contrasenha = contrasenha;
  }

  /**
   **/
  @ApiModelProperty(value = "")
  public NovoCartaoPortador getPortador() {
    return portador;
  }
  public void setPortador(NovoCartaoPortador portador) {
    this.portador = portador;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    NovoCartao novoCartao = (NovoCartao) o;
    return (this.idCartao == null ? novoCartao.idCartao == null : this.idCartao.equals(novoCartao.idCartao)) &&
        (this.valor == null ? novoCartao.valor == null : this.valor.equals(novoCartao.valor)) &&
        (this.contrasenha == null ? novoCartao.contrasenha == null : this.contrasenha.equals(novoCartao.contrasenha)) &&
        (this.portador == null ? novoCartao.portador == null : this.portador.equals(novoCartao.portador));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.idCartao == null ? 0: this.idCartao.hashCode());
    result = 31 * result + (this.valor == null ? 0: this.valor.hashCode());
    result = 31 * result + (this.contrasenha == null ? 0: this.contrasenha.hashCode());
    result = 31 * result + (this.portador == null ? 0: this.portador.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class NovoCartao {\n");
    
    sb.append("  idCartao: ").append(idCartao).append("\n");
    sb.append("  valor: ").append(valor).append("\n");
    sb.append("  contrasenha: ").append(contrasenha).append("\n");
    sb.append("  portador: ").append(portador).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
