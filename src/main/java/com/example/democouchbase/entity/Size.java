package com.example.democouchbase.entity;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "sku",
    "name",
    "description",
    "partnumber",
    "isBuyable",
    "backSoon",
    "mastersSizeId",
    "position",
    "price",
    "oldPrice"
})
public class Size {

    @JsonProperty("sku")
    private Integer sku;
    @JsonProperty("name")
    private String name;
    @JsonProperty("description")
    private Object description;
    @JsonProperty("partnumber")
    private String partnumber;
    @JsonProperty("isBuyable")
    private Boolean isBuyable;
    @JsonProperty("backSoon")
    private String backSoon;
    @JsonProperty("mastersSizeId")
    private String mastersSizeId;
    @JsonProperty("position")
    private Integer position;
    @JsonProperty("price")
    private String price;
    @JsonProperty("oldPrice")
    private Object oldPrice;

    @JsonProperty("sku")
    public Integer getSku() {
        return sku;
    }

    @JsonProperty("sku")
    public void setSku(Integer sku) {
        this.sku = sku;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("partnumber")
    public String getPartnumber() {
        return partnumber;
    }

    @JsonProperty("partnumber")
    public void setPartnumber(String partnumber) {
        this.partnumber = partnumber;
    }

    @JsonProperty("isBuyable")
    public Boolean getIsBuyable() {
        return isBuyable;
    }

    @JsonProperty("isBuyable")
    public void setIsBuyable(Boolean isBuyable) {
        this.isBuyable = isBuyable;
    }

    @JsonProperty("backSoon")
    public String getBackSoon() {
        return backSoon;
    }

    @JsonProperty("backSoon")
    public void setBackSoon(String backSoon) {
        this.backSoon = backSoon;
    }

    @JsonProperty("mastersSizeId")
    public String getMastersSizeId() {
        return mastersSizeId;
    }

    @JsonProperty("mastersSizeId")
    public void setMastersSizeId(String mastersSizeId) {
        this.mastersSizeId = mastersSizeId;
    }

    @JsonProperty("position")
    public Integer getPosition() {
        return position;
    }

    @JsonProperty("position")
    public void setPosition(Integer position) {
        this.position = position;
    }

    @JsonProperty("price")
    public String getPrice() {
        return price;
    }

    @JsonProperty("price")
    public void setPrice(String price) {
        this.price = price;
    }

    @JsonProperty("oldPrice")
    public Object getOldPrice() {
        return oldPrice;
    }

    @JsonProperty("oldPrice")
    public void setOldPrice(Object oldPrice) {
        this.oldPrice = oldPrice;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("sku", sku).append("name", name).append("description", description).append("partnumber", partnumber).append("isBuyable", isBuyable).append("backSoon", backSoon).append("mastersSizeId", mastersSizeId).append("position", position).append("price", price).append("oldPrice", oldPrice).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(price).append(oldPrice).append(isBuyable).append(name).append(backSoon).append(description).append(position).append(sku).append(partnumber).append(mastersSizeId).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Size) == false) {
            return false;
        }
        Size rhs = ((Size) other);
        return new EqualsBuilder().append(price, rhs.price).append(oldPrice, rhs.oldPrice).append(isBuyable, rhs.isBuyable).append(name, rhs.name).append(backSoon, rhs.backSoon).append(description, rhs.description).append(position, rhs.position).append(sku, rhs.sku).append(partnumber, rhs.partnumber).append(mastersSizeId, rhs.mastersSizeId).isEquals();
    }

}
