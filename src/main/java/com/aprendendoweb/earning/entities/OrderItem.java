package com.aprendendoweb.earning.entities;

import java.io.Serializable;
import java.util.Objects;

import com.aprendendoweb.earning.entities.pk.OrderItemPK;
import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;


@Entity
@Table(name = "tb_Order_Item")
public class OrderItem implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@EmbeddedId
	private OrderItemPK id = new OrderItemPK();
	
	@Column(name = "ds_quantidade")
	private Integer quantity;
	
	
	@Column(name = "ds_preco")
	private Double price;


	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}
	
	@JsonIgnore
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		 id.setOrder(order);
	}
	
	public Product getProduct(){
		return id.getProduct();	
	}
	
	public void setProduct(Product product) {
		 id.setProduct(product);
	}

	public OrderItem() {
		super();
	}


	public Integer getQuantity() {
		return quantity;
	}


	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}


	public Double getPrice() {
		return price;
	}


	public void setPrice(Double price) {
		this.price = price;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id, price);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderItem other = (OrderItem) obj;
		return Objects.equals(id, other.id) && Objects.equals(price, other.price);
	}


	@Override
	public String toString() {
		return "OrderItem [id=" + id + ", quantity=" + quantity + ", price=" + price + "]";
	}
	
	
}
