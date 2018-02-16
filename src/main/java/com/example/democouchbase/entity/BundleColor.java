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
    "id",
    "name",
    "image",
    "colorName",
    "relatedCategories",
    "modelName"
})
public class BundleColor {

    @JsonProperty("id")
    private Integer id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("image")
    private Object image;
    @JsonProperty("colorName")
    private Object colorName;
    @JsonProperty("relatedCategories")
    private List<Object> relatedCategories = new ArrayList<Object>();
    @JsonProperty("modelName")
    private Object modelName;

    @JsonProperty("id")
    public Integer getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(Integer id) {
        this.id = id;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("image")
    public Object getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Object image) {
        this.image = image;
    }

    @JsonProperty("colorName")
    public Object getColorName() {
        return colorName;
    }

    @JsonProperty("colorName")
    public void setColorName(Object colorName) {
        this.colorName = colorName;
    }

    @JsonProperty("relatedCategories")
    public List<Object> getRelatedCategories() {
        return relatedCategories;
    }

    @JsonProperty("relatedCategories")
    public void setRelatedCategories(List<Object> relatedCategories) {
        this.relatedCategories = relatedCategories;
    }

    @JsonProperty("modelName")
    public Object getModelName() {
        return modelName;
    }

    @JsonProperty("modelName")
    public void setModelName(Object modelName) {
        this.modelName = modelName;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("image", image).append("colorName", colorName).append("relatedCategories", relatedCategories).append("modelName", modelName).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(image).append(colorName).append(modelName).append(name).append(relatedCategories).append(id).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof BundleColor) == false) {
            return false;
        }
        BundleColor rhs = ((BundleColor) other);
        return new EqualsBuilder().append(image, rhs.image).append(colorName, rhs.colorName).append(modelName, rhs.modelName).append(name, rhs.name).append(relatedCategories, rhs.relatedCategories).append(id, rhs.id).isEquals();
    }

}
