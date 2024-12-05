package com.Practice.order_service.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.time.OffsetDateTime;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * Response
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-04T16:45:27.661726906+05:30[Asia/Colombo]")
public class Response {

  private String responseCode;

  private String message;

  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime timestamp;

  public Response() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public Response(String responseCode, String message) {
    this.responseCode = responseCode;
    this.message = message;
  }

  public Response responseCode(String responseCode) {
    this.responseCode = responseCode;
    return this;
  }

  /**
   * A short error code to describe the error type.
   * @return responseCode
  */
  @NotNull 
  @Schema(name = "responseCode", description = "A short error code to describe the error type.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("responseCode")
  public String getResponseCode() {
    return responseCode;
  }

  public void setResponseCode(String responseCode) {
    this.responseCode = responseCode;
  }

  public Response message(String message) {
    this.message = message;
    return this;
  }

  /**
   * A detailed message explaining the error.
   * @return message
  */
  @NotNull 
  @Schema(name = "message", description = "A detailed message explaining the error.", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("message")
  public String getMessage() {
    return message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

  public Response timestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  /**
   * The timestamp when the error occurred.
   * @return timestamp
  */
  @Valid 
  @Schema(name = "timestamp", description = "The timestamp when the error occurred.", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("timestamp")
  public LocalDateTime getTimestamp() {
    return timestamp;
  }

  public void setTimestamp(LocalDateTime timestamp) {
    this.timestamp = timestamp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Response response = (Response) o;
    return Objects.equals(this.responseCode, response.responseCode) &&
        Objects.equals(this.message, response.message) &&
        Objects.equals(this.timestamp, response.timestamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(responseCode, message, timestamp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Response {\n");
    sb.append("    responseCode: ").append(toIndentedString(responseCode)).append("\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
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
}

