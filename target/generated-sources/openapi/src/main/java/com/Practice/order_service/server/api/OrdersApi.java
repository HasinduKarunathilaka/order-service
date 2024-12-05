/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (7.2.0).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.Practice.order_service.server.api;

import com.Practice.order_service.server.model.OrderDTO;
import com.Practice.order_service.server.model.Response;
import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.ArraySchema;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import io.swagger.v3.oas.annotations.enums.ParameterIn;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import java.util.List;
import java.util.Map;
import jakarta.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-04T16:45:27.661726906+05:30[Asia/Colombo]")
@Validated
@Tag(name = "orders", description = "Order operations")
public interface OrdersApi {

    default OrdersApiDelegate getDelegate() {
        return new OrdersApiDelegate() {};
    }

    /**
     * POST /orders : Add Order
     * Add order to orders table
     *
     * @param orderDTO Add Order details to create a new order (required)
     * @return Order Added successfully (status code 200)
     *         or Invalid Order inputs (status code 404)
     *         or Internal server error (status code 500)
     */
    @Operation(
        operationId = "addOrder",
        summary = "Add Order",
        description = "Add order to orders table",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Order Added successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            }),
            @ApiResponse(responseCode = "404", description = "Invalid Order inputs", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/orders",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default Mono<ResponseEntity<Response>> addOrder(
        @Parameter(name = "OrderDTO", description = "Add Order details to create a new order", required = true) @Valid @RequestBody Mono<OrderDTO> orderDTO,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().addOrder(orderDTO, exchange);
    }


    /**
     * DELETE /orders/remove/{id} : Delete order by id
     * Delete order by their unique id
     *
     * @param id The unique identifier of the order. (required)
     * @return order deleted successfully. (status code 200)
     *         or order not found. (status code 404)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "deleteOrder",
        summary = "Delete order by id",
        description = "Delete order by their unique id",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "order deleted successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            }),
            @ApiResponse(responseCode = "404", description = "order not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.DELETE,
        value = "/orders/remove/{id}",
        produces = { "application/json" }
    )
    
    default Mono<ResponseEntity<Response>> deleteOrder(
        @Parameter(name = "id", description = "The unique identifier of the order.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().deleteOrder(id, exchange);
    }


    /**
     * GET /orders/all : Get All Orders
     * Retrieve all orders from orders table
     *
     * @return Order details retrieved successfully. (status code 200)
     *         or Order not found. (status code 404)
     */
    @Operation(
        operationId = "getAllOrders",
        summary = "Get All Orders",
        description = "Retrieve all orders from orders table",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Order details retrieved successfully.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrderDTO.class)))
            }),
            @ApiResponse(responseCode = "404", description = "Order not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders/all",
        produces = { "application/json" }
    )
    
    default Mono<ResponseEntity<Flux<OrderDTO>>> getAllOrders(
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().getAllOrders(exchange);
    }


    /**
     * GET /orders/{id} : Get Order By Id
     * Retrieve order details using order id
     *
     * @param id The unique identifier of the order (required)
     * @return Order details retrieve successfully (status code 200)
     *         or Order not found. (status code 404)
     */
    @Operation(
        operationId = "getOrderById",
        summary = "Get Order By Id",
        description = "Retrieve order details using order id",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Order details retrieve successfully", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = OrderDTO.class))
            }),
            @ApiResponse(responseCode = "404", description = "Order not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders/{id}",
        produces = { "application/json" }
    )
    
    default Mono<ResponseEntity<OrderDTO>> getOrderById(
        @Parameter(name = "id", description = "The unique identifier of the order", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().getOrderById(id, exchange);
    }


    /**
     * GET /orders/user/{id} : get orders using user id
     * Retrieve the all orders related user id
     *
     * @param id The unique identifier of the user. (required)
     * @return Order details retrieved successfully. (status code 200)
     *         or Order not found. (status code 404)
     */
    @Operation(
        operationId = "getOrdersByUserId",
        summary = "get orders using user id",
        description = "Retrieve the all orders related user id",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Order details retrieved successfully.", content = {
                @Content(mediaType = "application/json", array = @ArraySchema(schema = @Schema(implementation = OrderDTO.class)))
            }),
            @ApiResponse(responseCode = "404", description = "Order not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/orders/user/{id}",
        produces = { "application/json" }
    )
    
    default Mono<ResponseEntity<Flux<OrderDTO>>> getOrdersByUserId(
        @Parameter(name = "id", description = "The unique identifier of the user.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().getOrdersByUserId(id, exchange);
    }


    /**
     * PUT /orders/update/{id} : Update Order by ID
     * Update the details of a order by their unique ID.
     *
     * @param id The unique identifier of the order. (required)
     * @param orderDTO The updated order details. (required)
     * @return Order updated successfully. (status code 200)
     *         or Order not found. (status code 404)
     *         or Invalid input. (status code 400)
     *         or Internal server error. (status code 500)
     */
    @Operation(
        operationId = "updateOrder",
        summary = "Update Order by ID",
        description = "Update the details of a order by their unique ID.",
        tags = { "orders" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Order updated successfully.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            }),
            @ApiResponse(responseCode = "404", description = "Order not found.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            }),
            @ApiResponse(responseCode = "400", description = "Invalid input.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            }),
            @ApiResponse(responseCode = "500", description = "Internal server error.", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = Response.class))
            })
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/orders/update/{id}",
        produces = { "application/json" },
        consumes = { "application/json" }
    )
    
    default Mono<ResponseEntity<Response>> updateOrder(
        @Parameter(name = "id", description = "The unique identifier of the order.", required = true, in = ParameterIn.PATH) @PathVariable("id") Long id,
        @Parameter(name = "OrderDTO", description = "The updated order details.", required = true) @Valid @RequestBody Mono<OrderDTO> orderDTO,
        @Parameter(hidden = true) final ServerWebExchange exchange
    ) {
        return getDelegate().updateOrder(id, orderDTO, exchange);
    }

}
