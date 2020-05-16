package com.example.ecommerce.Model;

public class Cart {
    private String pid,pname,price,quality,discount;

    public Cart() {

    }

    public Cart(String pid, String pname, String price, String quality, String discount) {
        this.pid = pid;
        this.pname = pname;
        this.price = price;
        this.quality = quality;
        this.discount = discount;
    }

    public String getPid() {
        return pid;
    }

    public void setPid(String pid) {
        this.pid = pid;
    }

    public String getPname() {
        return pname;
    }

    public void setPname(String pname) {
        this.pname = pname;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public String getDiscount() {
        return discount;
    }

    public void setDiscount(String discount) {
        this.discount = discount;
    }
}
