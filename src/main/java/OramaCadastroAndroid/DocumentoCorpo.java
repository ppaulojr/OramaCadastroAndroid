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

import java.io.File;
import io.swagger.annotations.*;
import com.google.gson.annotations.SerializedName;

@ApiModel(description = "")
public class DocumentoCorpo {
  
  @SerializedName("name")
  private String name = null;
  @SerializedName("filename")
  private File filename = null;

  /**
   * Nome do atributo codificado em form-data 'image'
   **/
  @ApiModelProperty(required = true, value = "Nome do atributo codificado em form-data 'image'")
  public String getName() {
    return name;
  }
  public void setName(String name) {
    this.name = name;
  }

  /**
   * Arquivo binário que será enviado. O formato deve ser PDF, PNG ou JPG
   **/
  @ApiModelProperty(required = true, value = "Arquivo binário que será enviado. O formato deve ser PDF, PNG ou JPG")
  public File getFilename() {
    return filename;
  }
  public void setFilename(File filename) {
    this.filename = filename;
  }


  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentoCorpo documentoCorpo = (DocumentoCorpo) o;
    return (this.name == null ? documentoCorpo.name == null : this.name.equals(documentoCorpo.name)) &&
        (this.filename == null ? documentoCorpo.filename == null : this.filename.equals(documentoCorpo.filename));
  }

  @Override
  public int hashCode() {
    int result = 17;
    result = 31 * result + (this.name == null ? 0: this.name.hashCode());
    result = 31 * result + (this.filename == null ? 0: this.filename.hashCode());
    return result;
  }

  @Override
  public String toString()  {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentoCorpo {\n");
    
    sb.append("  name: ").append(name).append("\n");
    sb.append("  filename: ").append(filename).append("\n");
    sb.append("}\n");
    return sb.toString();
  }
}
