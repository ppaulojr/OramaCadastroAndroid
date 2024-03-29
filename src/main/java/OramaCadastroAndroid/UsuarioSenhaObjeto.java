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
public class UsuarioSenhaObjeto {
  
  @SerializedName("usuario")
  private String usuario = null;
  @SerializedName("senha")
  private String senha = null;

  /**
   * Identificador do usuário, CPF ou email
   **/
  @ApiModelProperty(required = true, value = "Identificador do usuário, CPF ou email")
  public String getUsuario() {
    return usuario;
  }
  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  /**
   * Senha de seis dígitos.
   **/
  @ApiModelProperty(required = true, value = "Senha de seis dígitos.")
  public String getSenha() {
    return senha;
  }
  public void setSenha(String senha) {
    this.senha = senha;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UsuarioSenhaObjeto usuarioSenhaObjeto = (UsuarioSenhaObjeto) o;
    return (this.usuario == null ? usuarioSenhaObjeto.usuario == null : this.usuario.equals(usuarioSenhaObjeto.usuario)) &&
        (this.senha == null ? usuarioSenhaObjeto.senha == null : this.senha.equals(usuarioSenhaObjeto.senha));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.usuario == null ? 0: this.usuario.hashCode());
    result = 31 * result + (this.senha == null ? 0: this.senha.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class UsuarioSenhaObjeto {\n");
    
    sb.append("  usuario: ").append(usuario).append("\n");
    sb.append("  senha: ").append(senha).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
