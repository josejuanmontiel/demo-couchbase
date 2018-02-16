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
    "modelHeigh",
    "modelName",
    "modelSize",
    "image",
    "sizes",
    "isContinuity",
    "colFilter"
})
public class Color {

    @JsonProperty("id")
    private String id;
    @JsonProperty("name")
    private String name;
    @JsonProperty("modelHeigh")
    private Object modelHeigh;
    @JsonProperty("modelName")
    private Object modelName;
    @JsonProperty("modelSize")
    private Object modelSize;
    @JsonProperty("image")
    private Image image;
    @JsonProperty("sizes")
    private List<Size> sizes = new ArrayList<Size>();
    @JsonProperty("isContinuity")
    private Boolean isContinuity;
    @JsonProperty("colFilter")
    private List<Object> colFilter = new ArrayList<Object>();

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
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

    @JsonProperty("modelHeigh")
    public Object getModelHeigh() {
        return modelHeigh;
    }

    @JsonProperty("modelHeigh")
    public void setModelHeigh(Object modelHeigh) {
        this.modelHeigh = modelHeigh;
    }

    @JsonProperty("modelName")
    public Object getModelName() {
        return modelName;
    }

    @JsonProperty("modelName")
    public void setModelName(Object modelName) {
        this.modelName = modelName;
    }

    @JsonProperty("modelSize")
    public Object getModelSize() {
        return modelSize;
    }

    @JsonProperty("modelSize")
    public void setModelSize(Object modelSize) {
        this.modelSize = modelSize;
    }

    @JsonProperty("image")
    public Image getImage() {
        return image;
    }

    @JsonProperty("image")
    public void setImage(Image image) {
        this.image = image;
    }

    @JsonProperty("sizes")
    public List<Size> getSizes() {
        return sizes;
    }

    @JsonProperty("sizes")
    public void setSizes(List<Size> sizes) {
        this.sizes = sizes;
    }

    @JsonProperty("isContinuity")
    public Boolean getIsContinuity() {
        return isContinuity;
    }

    @JsonProperty("isContinuity")
    public void setIsContinuity(Boolean isContinuity) {
        this.isContinuity = isContinuity;
    }

    @JsonProperty("colFilter")
    public List<Object> getColFilter() {
        return colFilter;
    }

    @JsonProperty("colFilter")
    public void setColFilter(List<Object> colFilter) {
        this.colFilter = colFilter;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("name", name).append("modelHeigh", modelHeigh).append("modelName", modelName).append("modelSize", modelSize).append("image", image).append("sizes", sizes).append("isContinuity", isContinuity).append("colFilter", colFilter).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(colFilter).append(modelName).append(image).append(sizes).append(name).append(modelHeigh).append(isContinuity).append(id).append(modelSize).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Color) == false) {
            return false;
        }
        Color rhs = ((Color) other);
        return new EqualsBuilder().append(colFilter, rhs.colFilter).append(modelName, rhs.modelName).append(image, rhs.image).append(sizes, rhs.sizes).append(name, rhs.name).append(modelHeigh, rhs.modelHeigh).append(isContinuity, rhs.isContinuity).append(id, rhs.id).append(modelSize, rhs.modelSize).isEquals();
    }

}
