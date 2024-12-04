package com.Practice.order_service.server.api;

import com.Practice.order_service.server.model.OrderDTO;
import com.Practice.order_service.server.model.Response;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ServerWebExchange;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import org.springframework.http.codec.multipart.Part;

import jakarta.validation.constraints.*;
import jakarta.validation.Valid;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import jakarta.annotation.Generated;

/**
 * A delegate to be called by the {@link OrdersApiController}}.
 * Implement this interface with a {@link org.springframework.stereotype.Service} annotated class.
 */
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-12-04T16:31:34.295826863+05:30[Asia/Colombo]")
public interface OrdersApiDelegate {

    default Optional<NativeWebRequest> getRequest() {
        return Optional.empty();
    }

    /**
     * POST /orders : Add Order
     * Add order to orders table
     *
     * @param orderDTO Add Order details to create a new order (required)
     * @return Order Added successfully (status code 200)
     *         or Invalid Order inputs (status code 404)
     *         or Internal server error (status code 500)
     * @see OrdersApi#addOrder
     */
    default Mono<ResponseEntity<Response>> addOrder(Mono<OrderDTO> orderDTO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"message\" : \"message\", \"responseCode\" : \"responseCode\", \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(orderDTO).then(Mono.empty());

    }

    /**
     * DELETE /orders/remove/{id} : Delete order by id
     * Delete order by their unique id
     *
     * @param id The unique identifier of the order. (required)
     * @return order deleted successfully. (status code 200)
     *         or order not found. (status code 404)
     *         or Internal server error. (status code 500)
     * @see OrdersApi#deleteOrder
     */
    default Mono<ResponseEntity<Response>> deleteOrder(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"message\" : \"message\", \"responseCode\" : \"responseCode\", \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /orders/all : Get All Orders
     * Retrieve all orders from orders table
     *
     * @return Order details retrieved successfully. (status code 200)
     *         or Order not found. (status code 404)
     * @see OrdersApi#getAllOrders
     */
    default Mono<ResponseEntity<Flux<OrderDTO>>> getAllOrders(ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"quantity\" : 1, \"user_id\" : 6, \"price\" : 0.5962133916683182, \"order_id\" : 0, \"product_name\" : \"product_name\" }, { \"quantity\" : 1, \"user_id\" : 6, \"price\" : 0.5962133916683182, \"order_id\" : 0, \"product_name\" : \"product_name\" } ]";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /orders/{id} : Get Order By Id
     * Retrieve order details using order id
     *
     * @param id The unique identifier of the order (required)
     * @return Order details retrieve successfully (status code 200)
     *         or Order not found. (status code 404)
     * @see OrdersApi#getOrderById
     */
    default Mono<ResponseEntity<OrderDTO>> getOrderById(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"quantity\" : 1, \"user_id\" : 6, \"price\" : 0.5962133916683182, \"order_id\" : 0, \"product_name\" : \"product_name\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

    }

    /**
     * GET /orders/user/{id} : get orders using user id
     * Retrieve the all orders related user id
     *
     * @param id The unique identifier of the user. (required)
     * @return Order details retrieved successfully. (status code 200)
     *         or Order not found. (status code 404)
     * @see OrdersApi#getOrdersByUserId
     */
    default Mono<ResponseEntity<Flux<OrderDTO>>> getOrdersByUserId(Long id,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "[ { \"quantity\" : 1, \"user_id\" : 6, \"price\" : 0.5962133916683182, \"order_id\" : 0, \"product_name\" : \"product_name\" }, { \"quantity\" : 1, \"user_id\" : 6, \"price\" : 0.5962133916683182, \"order_id\" : 0, \"product_name\" : \"product_name\" } ]";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(Mono.empty());

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
     * @see OrdersApi#updateOrder
     */
    default Mono<ResponseEntity<Response>> updateOrder(Long id,
        Mono<OrderDTO> orderDTO,
        ServerWebExchange exchange) {
        Mono<Void> result = Mono.empty();
        exchange.getResponse().setStatusCode(HttpStatus.NOT_IMPLEMENTED);
        for (MediaType mediaType : exchange.getRequest().getHeaders().getAccept()) {
            if (mediaType.isCompatibleWith(MediaType.valueOf("application/json"))) {
                String exampleString = "{ \"message\" : \"message\", \"responseCode\" : \"responseCode\", \"timestamp\" : \"2000-01-23T04:56:07.000+00:00\" }";
                result = ApiUtil.getExampleResponse(exchange, MediaType.valueOf("application/json"), exampleString);
                break;
            }
        }
        return result.then(orderDTO).then(Mono.empty());

    }

}
