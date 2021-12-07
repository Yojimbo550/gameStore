package store.domain;

import javax.persistence.*;

@Entity
@Table(name = "order")
public class OrderEntity {

    @Id

    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "order")
    private int order;

    @Column(name = "payment type")
    private String paymentType;

    @Column(name = "delivery type")
    private String deliveryType;

    @Column(name = "ordered products")
    private String orderedProducts;

    @Column(name = "payment status")
    private String paymentStatus;

    @Column(name = "order status")
    private String orderStatus;

    @Column(name = "client address")
    private String clientAddress;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getOrder() {
        return order;
    }

    public void setOrder(int order) {
        this.order = order;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

    public String getDeliveryType() {
        return deliveryType;
    }

    public void setDeliveryType(String deliveryType) {
        this.deliveryType = deliveryType;
    }

    public String getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(String orderedProducts) {
        this.orderedProducts = orderedProducts;
    }

    public String getPaymentStatus() {
        return paymentStatus;
    }

    public void setPaymentStatus(String paymentStatus) {
        this.paymentStatus = paymentStatus;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public String getClientAddress() {
        return clientAddress;
    }

    public void setClientAddress(String clientAddress) {
        this.clientAddress = clientAddress;
    }
}
