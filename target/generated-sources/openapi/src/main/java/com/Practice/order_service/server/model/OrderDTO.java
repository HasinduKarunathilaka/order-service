package com.Practice.order_service.server.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.math.BigDecimal;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import jakarta.annotation.Generated;

/**
 * OrderDTO
 */

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-05T16:02:10.579722544+05:30[Asia/Colombo]")
public class OrderDTO {

  private Long orderId;

  private Long userId;

  private String productName;

  private Integer quantity;

  private BigDecimal price;

  public OrderDTO() {
    super();
  }

  /**
   * Constructor with only required parameters
   */
  public OrderDTO(Long orderId, String productName, Integer quantity, BigDecimal price) {
    this.orderId = orderId;
    this.productName = productName;
    this.quantity = quantity;
    this.price = price;
  }

  public OrderDTO orderId(Long orderId) {
    this.orderId = orderId;
    return this;
  }

  /**
   * Get orderId
   * @return orderId
  */
  @NotNull 
  @Schema(name = "order_id", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("order_id")
  public Long getOrderId() {
    return orderId;
  }

  public void setOrderId(Long orderId) {
    this.orderId = orderId;
  }

  public OrderDTO userId(Long userId) {
    this.userId = userId;
    return this;
  }

  /**
   * Get userId
   * @return userId
  */
  
  @Schema(name = "user_id", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("user_id")
  public Long getUserId() {
    return userId;
  }

  public void setUserId(Long userId) {
    this.userId = userId;
  }

  public OrderDTO productName(String productName) {
    this.productName = productName;
    return this;
  }

  /**
   * Get productName
   * @return productName
  */
  @NotNull 
  @Schema(name = "product_name", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("product_name")
  public String getProductName() {
    return productName;
  }

  public void setProductName(String productName) {
    this.productName = productName;
  }

  public OrderDTO quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

  /**
   * Get quantity
   * @return quantity
  */
  @NotNull 
  @Schema(name = "quantity", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public OrderDTO price(BigDecimal price) {
    this.price = price;
    return this;
  }

  /**
   * Get price
   * minimum: 0
   * @return price
  */
  @NotNull @Valid @DecimalMin("0") 
  @Schema(name = "price", requiredMode = Schema.RequiredMode.REQUIRED)
  @JsonProperty("price")
  public BigDecimal getPrice() {
    return price;
  }

  public void setPrice(BigDecimal price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OrderDTO orderDTO = (OrderDTO) o;
    return Objects.equals(this.orderId, orderDTO.orderId) &&
        Objects.equals(this.userId, orderDTO.userId) &&
        Objects.equals(this.productName, orderDTO.productName) &&
        Objects.equals(this.quantity, orderDTO.quantity) &&
        Objects.equals(this.price, orderDTO.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(orderId, userId, productName, quantity, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OrderDTO {\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
    sb.append("    productName: ").append(toIndentedString(productName)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

