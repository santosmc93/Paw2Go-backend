package com.paw2go.usersjwt.Modelo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity(name="Products")
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id_product;
    private String product_name;
    private String product_description;
    private double product_price;
    private String url_image;
    private boolean for_dog;
    private boolean for_cat;
    private Integer product_qty;

    public Product() {
    }

    public Product(Integer id_product, String product_name, String product_description, double product_price, String url_image, boolean for_cat, boolean for_dog, Integer product_qty) {
        this.id_product=id_product;
        this.product_name = product_name;
        this.product_price = product_price;
        this.product_description = product_description;
        this.url_image=url_image;
        this.for_cat=for_cat;
        this.for_dog=for_dog;
        this.product_qty=product_qty;
    }

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

    public double getProduct_price() {
        return product_price;
    }

    public void setProduct_price(double product_price) {
        this.product_price = product_price;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public boolean isFor_dog() {
        return for_dog;
    }

    public void setFor_dog(boolean for_dog) {
        this.for_dog = for_dog;
    }

    public boolean isFor_cat() {
        return for_cat;
    }

    public void setFor_cat(boolean for_cat) {
        this.for_cat = for_cat;
    }

    public Integer getProduct_qty() {
        return product_qty;
    }

    public void setProduct_qty(Integer product_qty) {
        this.product_qty = product_qty;
    }
}
