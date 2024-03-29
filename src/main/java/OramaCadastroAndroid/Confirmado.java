/**
 * Criação de Contas
 * API de Criação de Contas.
 *
 * The version of the OpenAPI document: 1.0
 * Contact: cadastro_api@orama.com.br
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */

package OramaCadastroAndroid;

import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class Confirmado {
  
  @SerializedName("confirmado")
  private Boolean confirmado = null;

  /**
   * Estado de confirmação, true caso já tenha sido confirmado, false caso contrário.
   **/
  @ApiModelProperty(value = "Estado de confirmação, true caso já tenha sido confirmado, false caso contrário.")
  public Boolean getConfirmado() {
    return confirmado;
  }
  public void setConfirmado(Boolean confirmado) {
    this.confirmado = confirmado;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Confirmado confirmado = (Confirmado) o;
    return (this.confirmado == null ? confirmado.confirmado == null : this.confirmado.equals(confirmado.confirmado));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.confirmado == null ? 0: this.confirmado.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class Confirmado {\n");
    
    sb.append("  confirmado: ").append(confirmado).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
