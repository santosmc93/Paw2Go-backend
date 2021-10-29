package com.paw2go.adminsusers.products;

import javax.persistence.*;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Integer id_product;
    @Column
    private String product_name;
    @Column
    private String product_description;
    @Column
    private Integer product_price;
    @Column
    private String url_image;
    @Column
    private Boolean for_dog;
    @Column
    private Boolean for_cat;
    @Column
    private Integer product_qty;

//Getters and setters


    public Integer getId_product() {
        return id_product;
    }

    public void setId_product(Integer id_product) {
        this.id_product = id_product;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public String getProduct_description() {
        return product_description;
    }

    public void setProduct_description(String product_description) {
        this.product_description = product_description;
    }

    public Integer getProduct_price() {
        return product_price;
    }

    public void setProduct_price(Integer product_price) {
        this.product_price = product_price;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public Boolean getFor_dog() {
        return for_dog;
    }

    public void setFor_dog(Boolean for_dog) {
        this.for_dog = for_dog;
    }

    public Boolean getFor_cat() {
        return for_cat;
    }

    public void setFor_cat(Boolean for_cat) {
        this.for_cat = for_cat;
    }

    public Integer getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(Integer product_qty) {
        this.product_qty = product_qty;
    }
}