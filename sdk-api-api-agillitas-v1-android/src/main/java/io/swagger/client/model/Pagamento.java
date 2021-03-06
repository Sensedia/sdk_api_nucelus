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

import io.swagger.client.model.SetPagamento;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Pagamento {
  
  @SerializedName("pagamento")
  private SetPagamento pagamento = null;

  /**
   **/
  @ApiModelProperty(value = "")
  public SetPagamento getPagamento() {
    return pagamento;
  }
  public void setPagamento(SetPagamento pagamento) {
    this.pagamento = pagamento;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Pagamento pagamento = (Pagamento) o;
    return (this.pagamento == null ? pagamento.pagamento == null : this.pagamento.equals(pagamento.pagamento));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.pagamento == null ? 0: this.pagamento.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Pagamento {\n");
    
    sb.append("  pagamento: ").append(pagamento).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
