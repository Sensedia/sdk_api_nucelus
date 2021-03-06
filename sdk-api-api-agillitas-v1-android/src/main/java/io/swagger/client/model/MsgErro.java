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

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class MsgErro {
  
  @SerializedName("mensagem")
  private String mensagem = null;

  /**
   * Mensagem com descrição do erro.
   **/
  @ApiModelProperty(value = "Mensagem com descrição do erro.")
  public String getMensagem() {
    return mensagem;
  }
  public void setMensagem(String mensagem) {
    this.mensagem = mensagem;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MsgErro msgErro = (MsgErro) o;
    return (this.mensagem == null ? msgErro.mensagem == null : this.mensagem.equals(msgErro.mensagem));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.mensagem == null ? 0: this.mensagem.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class MsgErro {\n");
    
    sb.append("  mensagem: ").append(mensagem).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
