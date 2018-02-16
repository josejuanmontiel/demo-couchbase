package com.example.democouchbase.entity;
import java.util.ArrayList;
import java.util.List;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "products"
})
public class ProductLanguageId5 {

    @JsonProperty("products")
    private List<Product> products = new ArrayList<Product>();

    @JsonProperty("products")
    public List<Product> getProducts() {
        return products;
    }

    @JsonProperty("products")
    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("products", products).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(products).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProductLanguageId5) == false) {
            return false;
        }
        ProductLanguageId5 rhs = ((ProductLanguageId5) other);
        return new EqualsBuilder().append(products, rhs.products).isEquals();
    }

}
