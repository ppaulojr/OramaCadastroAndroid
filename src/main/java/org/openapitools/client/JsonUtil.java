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

package org.openapitools.client;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonParseException;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;
import java.util.Date;
import OramaCadastroAndroid.*;

public class JsonUtil {
  public static GsonBuilder gsonBuilder;

  static {
    gsonBuilder = new GsonBuilder();
    gsonBuilder.serializeNulls();
    gsonBuilder.setDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");
    gsonBuilder.registerTypeAdapter(Date.class, new JsonDeserializer<Date>() {
      public Date deserialize(JsonElement json, Type typeOfT, JsonDeserializationContext context) throws JsonParseException {
        return new Date(json.getAsJsonPrimitive().getAsLong());
      }
    });
  }

  public static Gson getGson() {
    return gsonBuilder.create();
  }

  public static String serialize(Object obj){
    return getGson().toJson(obj);
  }

  public static <T> T deserializeToList(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getListTypeForDeserialization(cls));
  }

  public static <T> T deserializeToObject(String jsonString, Class cls){
    return getGson().fromJson(jsonString, getTypeForDeserialization(cls));
  }

  public static Type getListTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Aprovacao".equalsIgnoreCase(className)) {
      return new TypeToken<List<Aprovacao>>(){}.getType();
    }
    
    if ("AutenticacaoCodigoObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<List<AutenticacaoCodigoObjeto>>(){}.getType();
    }
    
    if ("AutenticacaoObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<List<AutenticacaoObjeto>>(){}.getType();
    }
    
    if ("Confirmado".equalsIgnoreCase(className)) {
      return new TypeToken<List<Confirmado>>(){}.getType();
    }
    
    if ("ContaBancaria".equalsIgnoreCase(className)) {
      return new TypeToken<List<ContaBancaria>>(){}.getType();
    }
    
    if ("DadosPatrimonial".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosPatrimonial>>(){}.getType();
    }
    
    if ("DadosProfissionais".equalsIgnoreCase(className)) {
      return new TypeToken<List<DadosProfissionais>>(){}.getType();
    }
    
    if ("Documento".equalsIgnoreCase(className)) {
      return new TypeToken<List<Documento>>(){}.getType();
    }
    
    if ("DocumentoCorpo".equalsIgnoreCase(className)) {
      return new TypeToken<List<DocumentoCorpo>>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<List<Endereco>>(){}.getType();
    }
    
    if ("Erro".equalsIgnoreCase(className)) {
      return new TypeToken<List<Erro>>(){}.getType();
    }
    
    if ("ListaPerfilUsuario".equalsIgnoreCase(className)) {
      return new TypeToken<List<ListaPerfilUsuario>>(){}.getType();
    }
    
    if ("LoginCriado".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginCriado>>(){}.getType();
    }
    
    if ("LoginObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginObjeto>>(){}.getType();
    }
    
    if ("LoginSenhaObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<List<LoginSenhaObjeto>>(){}.getType();
    }
    
    if ("PerfilUsuario".equalsIgnoreCase(className)) {
      return new TypeToken<List<PerfilUsuario>>(){}.getType();
    }
    
    if ("UsuarioSenhaObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<List<UsuarioSenhaObjeto>>(){}.getType();
    }
    
    return new TypeToken<List<Object>>(){}.getType();
  }

  public static Type getTypeForDeserialization(Class cls) {
    String className = cls.getSimpleName();
    
    if ("Aprovacao".equalsIgnoreCase(className)) {
      return new TypeToken<Aprovacao>(){}.getType();
    }
    
    if ("AutenticacaoCodigoObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<AutenticacaoCodigoObjeto>(){}.getType();
    }
    
    if ("AutenticacaoObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<AutenticacaoObjeto>(){}.getType();
    }
    
    if ("Confirmado".equalsIgnoreCase(className)) {
      return new TypeToken<Confirmado>(){}.getType();
    }
    
    if ("ContaBancaria".equalsIgnoreCase(className)) {
      return new TypeToken<ContaBancaria>(){}.getType();
    }
    
    if ("DadosPatrimonial".equalsIgnoreCase(className)) {
      return new TypeToken<DadosPatrimonial>(){}.getType();
    }
    
    if ("DadosProfissionais".equalsIgnoreCase(className)) {
      return new TypeToken<DadosProfissionais>(){}.getType();
    }
    
    if ("Documento".equalsIgnoreCase(className)) {
      return new TypeToken<Documento>(){}.getType();
    }
    
    if ("DocumentoCorpo".equalsIgnoreCase(className)) {
      return new TypeToken<DocumentoCorpo>(){}.getType();
    }
    
    if ("Endereco".equalsIgnoreCase(className)) {
      return new TypeToken<Endereco>(){}.getType();
    }
    
    if ("Erro".equalsIgnoreCase(className)) {
      return new TypeToken<Erro>(){}.getType();
    }
    
    if ("ListaPerfilUsuario".equalsIgnoreCase(className)) {
      return new TypeToken<ListaPerfilUsuario>(){}.getType();
    }
    
    if ("LoginCriado".equalsIgnoreCase(className)) {
      return new TypeToken<LoginCriado>(){}.getType();
    }
    
    if ("LoginObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<LoginObjeto>(){}.getType();
    }
    
    if ("LoginSenhaObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<LoginSenhaObjeto>(){}.getType();
    }
    
    if ("PerfilUsuario".equalsIgnoreCase(className)) {
      return new TypeToken<PerfilUsuario>(){}.getType();
    }
    
    if ("UsuarioSenhaObjeto".equalsIgnoreCase(className)) {
      return new TypeToken<UsuarioSenhaObjeto>(){}.getType();
    }
    
    return new TypeToken<Object>(){}.getType();
  }

};
