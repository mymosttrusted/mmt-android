/*
  MMT reports API
  MMT reports API documentation.
 
  Do not edit the class manually.
 */


package util.mymosttrusted.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonDeserializationContext;
import com.google.gson.JsonDeserializer;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParseException;
import com.google.gson.TypeAdapterFactory;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

import util.mymosttrusted.api.JSON;

/**
 * StatsSummedResultTrackingLinks
 */

public class StatsSummedResultTrackingLinks {
  public static final String SERIALIZED_NAME_CLICKED = "clicked";
  @SerializedName(SERIALIZED_NAME_CLICKED)
  private Integer clicked;

  public static final String SERIALIZED_NAME_UNCLICKED = "unclicked";
  @SerializedName(SERIALIZED_NAME_UNCLICKED)
  private Integer unclicked;

  public static final String SERIALIZED_NAME_TOTAL = "total";
  @SerializedName(SERIALIZED_NAME_TOTAL)
  private Integer total;

  public StatsSummedResultTrackingLinks() { 
  }

  public StatsSummedResultTrackingLinks clicked(Integer clicked) {
    
    this.clicked = clicked;
    return this;
  }

   /**
   * Get clicked
   * @return clicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getClicked() {
    return clicked;
  }


  public void setClicked(Integer clicked) {
    this.clicked = clicked;
  }


  public StatsSummedResultTrackingLinks unclicked(Integer unclicked) {
    
    this.unclicked = unclicked;
    return this;
  }

   /**
   * Get unclicked
   * @return unclicked
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "1", value = "")

  public Integer getUnclicked() {
    return unclicked;
  }


  public void setUnclicked(Integer unclicked) {
    this.unclicked = unclicked;
  }


  public StatsSummedResultTrackingLinks total(Integer total) {
    
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(example = "2", value = "")

  public Integer getTotal() {
    return total;
  }


  public void setTotal(Integer total) {
    this.total = total;
  }



  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatsSummedResultTrackingLinks statsSummedResultTrackingLinks = (StatsSummedResultTrackingLinks) o;
    return Objects.equals(this.clicked, statsSummedResultTrackingLinks.clicked) &&
        Objects.equals(this.unclicked, statsSummedResultTrackingLinks.unclicked) &&
        Objects.equals(this.total, statsSummedResultTrackingLinks.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clicked, unclicked, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatsSummedResultTrackingLinks {\n");
    sb.append("    clicked: ").append(toIndentedString(clicked)).append("\n");
    sb.append("    unclicked: ").append(toIndentedString(unclicked)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }


  public static HashSet<String> openapiFields;
  public static HashSet<String> openapiRequiredFields;

  static {
    // a set of all properties/fields (JSON key names)
    openapiFields = new HashSet<String>();
    openapiFields.add("clicked");
    openapiFields.add("unclicked");
    openapiFields.add("total");

    // a set of required properties/fields (JSON key names)
    openapiRequiredFields = new HashSet<String>();
  }

 /**
  * Validates the JSON Object and throws an exception if issues found
  *
  * @param jsonObj JSON Object
  * @throws IOException if the JSON Object is invalid with respect to StatsSummedResultTrackingLinks
  */
  public static void validateJsonObject(JsonObject jsonObj) throws IOException {
      if (jsonObj == null) {
        if (StatsSummedResultTrackingLinks.openapiRequiredFields.isEmpty()) {
          return;
        } else { // has required fields
          throw new IllegalArgumentException(String.format("The required field(s) %s in StatsSummedResultTrackingLinks is not found in the empty JSON string", StatsSummedResultTrackingLinks.openapiRequiredFields.toString()));
        }
      }

      Set<Entry<String, JsonElement>> entries = jsonObj.entrySet();
      // check to see if the JSON string contains additional fields
      for (Entry<String, JsonElement> entry : entries) {
        if (!StatsSummedResultTrackingLinks.openapiFields.contains(entry.getKey())) {
          throw new IllegalArgumentException(String.format("The field `%s` in the JSON string is not defined in the `StatsSummedResultTrackingLinks` properties. JSON: %s", entry.getKey(), jsonObj.toString()));
        }
      }
  }

  public static class CustomTypeAdapterFactory implements TypeAdapterFactory {
    @SuppressWarnings("unchecked")
    @Override
    public <T> TypeAdapter<T> create(Gson gson, TypeToken<T> type) {
       if (!StatsSummedResultTrackingLinks.class.isAssignableFrom(type.getRawType())) {
         return null; // this class only serializes 'StatsSummedResultTrackingLinks' and its subtypes
       }
       final TypeAdapter<JsonElement> elementAdapter = gson.getAdapter(JsonElement.class);
       final TypeAdapter<StatsSummedResultTrackingLinks> thisAdapter
                        = gson.getDelegateAdapter(this, TypeToken.get(StatsSummedResultTrackingLinks.class));

       return (TypeAdapter<T>) new TypeAdapter<StatsSummedResultTrackingLinks>() {
           @Override
           public void write(JsonWriter out, StatsSummedResultTrackingLinks value) throws IOException {
             JsonObject obj = thisAdapter.toJsonTree(value).getAsJsonObject();
             elementAdapter.write(out, obj);
           }

           @Override
           public StatsSummedResultTrackingLinks read(JsonReader in) throws IOException {
             JsonObject jsonObj = elementAdapter.read(in).getAsJsonObject();
             validateJsonObject(jsonObj);
             return thisAdapter.fromJsonTree(jsonObj);
           }

       }.nullSafe();
    }
  }

 /**
  * Create an instance of StatsSummedResultTrackingLinks given an JSON string
  *
  * @param jsonString JSON string
  * @return An instance of StatsSummedResultTrackingLinks
  * @throws IOException if the JSON string is invalid with respect to StatsSummedResultTrackingLinks
  */
  public static StatsSummedResultTrackingLinks fromJson(String jsonString) throws IOException {
    return JSON.getGson().fromJson(jsonString, StatsSummedResultTrackingLinks.class);
  }

 /**
  * Convert an instance of StatsSummedResultTrackingLinks to an JSON string
  *
  * @return JSON string
  */
  public String toJson() {
    return JSON.getGson().toJson(this);
  }
}

