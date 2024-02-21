package com.aprendendoweb.earning.entities;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_product")
public class Product implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "ds_nome")
	private String nome;
	
	@Column(name = "ds_descricao")
	private String description;

	@Column(name = "nr_preco")
	private Double price;
	
	@Column(name = "ds_img")
	private String imgUrl;
	
	//USAR O set para evitar 2 ocorrências
	@ManyToMany
	@JoinTable(name = "tb_produto_categoria",
				joinColumns = @JoinColumn(name = "fk_product"),
				inverseJoinColumns = @JoinColumn(name = "fk_category"))
	private Set<Category> categories = new HashSet<>();
	
	@OneToMany(mappedBy = "id.product")
	private Set<OrderItem> orderItem = new HashSet<>();
	
	public Product(){
		
	}
	
	public Product(Long id, String nome, String description, Double price, String imgUrl) {
		super();
		this.id = id;
		this.nome = nome;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public void setImgUrl(String imgUrl) {
		this.imgUrl = imgUrl;
	}

	public Long getId() {
		return id;
	}

	public Set<Category> getCategories() {
		return categories;
	}
	
	//Revisar esse código
	@JsonIgnore
	public Set<Order> getOrder() {
			Set<Order> set = new HashSet<>();
			for(OrderItem x: orderItem) {
				set.add(x.getOrder());
			}
			return set;

	}
	@Override
	public int hashCode() {
		return Objects.hash(id, nome);
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome);
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", nome=" + nome + ", description=" + description + ", price=" + price
				+ ", imgUrl=" + imgUrl + ", categories=" + categories + "]";
	}
	
	
	
	}


