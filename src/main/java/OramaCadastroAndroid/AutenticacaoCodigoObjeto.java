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
public class AutenticacaoCodigoObjeto {
  
  @SerializedName("codigo")
  private String codigo = null;

  /**
   **/
  @ApiModelProperty(required = true, value = "")
  public String getCodigo() {
    return codigo;
  }
  public void setCodigo(String codigo) {
    this.codigo = codigo;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AutenticacaoCodigoObjeto autenticacaoCodigoObjeto = (AutenticacaoCodigoObjeto) o;
    return (this.codigo == null ? autenticacaoCodigoObjeto.codigo == null : this.codigo.equals(autenticacaoCodigoObjeto.codigo));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.codigo == null ? 0: this.codigo.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class AutenticacaoCodigoObjeto {\n");
    
    sb.append("  codigo: ").append(codigo).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
