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
    "description",
    "longDescription",
    "reference",
    "displayReference",
    "defaultImageType",
    "composition",
    "compositionByZone",
    "care",
    "colors",
    "relatedProducts",
    "xmediaDefaultSet",
    "xmedia",
    "skuDimensions",
    "dimensions"
})
public class Detail_ {

    @JsonProperty("description")
    private Object description;
    @JsonProperty("longDescription")
    private Object longDescription;
    @JsonProperty("reference")
    private String reference;
    @JsonProperty("displayReference")
    private String displayReference;
    @JsonProperty("defaultImageType")
    private Object defaultImageType;
    @JsonProperty("composition")
    private List<Object> composition = new ArrayList<Object>();
    @JsonProperty("compositionByZone")
    private List<CompositionByZone_> compositionByZone = new ArrayList<CompositionByZone_>();
    @JsonProperty("care")
    private List<Object> care = new ArrayList<Object>();
    @JsonProperty("colors")
    private List<Object> colors = new ArrayList<Object>();
    @JsonProperty("relatedProducts")
    private List<Object> relatedProducts = new ArrayList<Object>();
    @JsonProperty("xmediaDefaultSet")
    private Object xmediaDefaultSet;
    @JsonProperty("xmedia")
    private Object xmedia;
    @JsonProperty("skuDimensions")
    private SkuDimensions_ skuDimensions;
    @JsonProperty("dimensions")
    private Dimensions_ dimensions;

    @JsonProperty("description")
    public Object getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Object description) {
        this.description = description;
    }

    @JsonProperty("longDescription")
    public Object getLongDescription() {
        return longDescription;
    }

    @JsonProperty("longDescription")
    public void setLongDescription(Object longDescription) {
        this.longDescription = longDescription;
    }

    @JsonProperty("reference")
    public String getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(String reference) {
        this.reference = reference;
    }

    @JsonProperty("displayReference")
    public String getDisplayReference() {
        return displayReference;
    }

    @JsonProperty("displayReference")
    public void setDisplayReference(String displayReference) {
        this.displayReference = displayReference;
    }

    @JsonProperty("defaultImageType")
    public Object getDefaultImageType() {
        return defaultImageType;
    }

    @JsonProperty("defaultImageType")
    public void setDefaultImageType(Object defaultImageType) {
        this.defaultImageType = defaultImageType;
    }

    @JsonProperty("composition")
    public List<Object> getComposition() {
        return composition;
    }

    @JsonProperty("composition")
    public void setComposition(List<Object> composition) {
        this.composition = composition;
    }

    @JsonProperty("compositionByZone")
    public List<CompositionByZone_> getCompositionByZone() {
        return compositionByZone;
    }

    @JsonProperty("compositionByZone")
    public void setCompositionByZone(List<CompositionByZone_> compositionByZone) {
        this.compositionByZone = compositionByZone;
    }

    @JsonProperty("care")
    public List<Object> getCare() {
        return care;
    }

    @JsonProperty("care")
    public void setCare(List<Object> care) {
        this.care = care;
    }

    @JsonProperty("colors")
    public List<Object> getColors() {
        return colors;
    }

    @JsonProperty("colors")
    public void setColors(List<Object> colors) {
        this.colors = colors;
    }

    @JsonProperty("relatedProducts")
    public List<Object> getRelatedProducts() {
        return relatedProducts;
    }

    @JsonProperty("relatedProducts")
    public void setRelatedProducts(List<Object> relatedProducts) {
        this.relatedProducts = relatedProducts;
    }

    @JsonProperty("xmediaDefaultSet")
    public Object getXmediaDefaultSet() {
        return xmediaDefaultSet;
    }

    @JsonProperty("xmediaDefaultSet")
    public void setXmediaDefaultSet(Object xmediaDefaultSet) {
        this.xmediaDefaultSet = xmediaDefaultSet;
    }

    @JsonProperty("xmedia")
    public Object getXmedia() {
        return xmedia;
    }

    @JsonProperty("xmedia")
    public void setXmedia(Object xmedia) {
        this.xmedia = xmedia;
    }

    @JsonProperty("skuDimensions")
    public SkuDimensions_ getSkuDimensions() {
        return skuDimensions;
    }

    @JsonProperty("skuDimensions")
    public void setSkuDimensions(SkuDimensions_ skuDimensions) {
        this.skuDimensions = skuDimensions;
    }

    @JsonProperty("dimensions")
    public Dimensions_ getDimensions() {
        return dimensions;
    }

    @JsonProperty("dimensions")
    public void setDimensions(Dimensions_ dimensions) {
        this.dimensions = dimensions;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).append("longDescription", longDescription).append("reference", reference).append("displayReference", displayReference).append("defaultImageType", defaultImageType).append("composition", composition).append("compositionByZone", compositionByZone).append("care", care).append("colors", colors).append("relatedProducts", relatedProducts).append("xmediaDefaultSet", xmediaDefaultSet).append("xmedia", xmedia).append("skuDimensions", skuDimensions).append("dimensions", dimensions).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(longDescription).append(displayReference).append(compositionByZone).append(relatedProducts).append(description).append(defaultImageType).append(xmediaDefaultSet).append(colors).append(skuDimensions).append(reference).append(composition).append(xmedia).append(care).append(dimensions).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Detail_) == false) {
            return false;
        }
        Detail_ rhs = ((Detail_) other);
        return new EqualsBuilder().append(longDescription, rhs.longDescription).append(displayReference, rhs.displayReference).append(compositionByZone, rhs.compositionByZone).append(relatedProducts, rhs.relatedProducts).append(description, rhs.description).append(defaultImageType, rhs.defaultImageType).append(xmediaDefaultSet, rhs.xmediaDefaultSet).append(colors, rhs.colors).append(skuDimensions, rhs.skuDimensions).append(reference, rhs.reference).append(composition, rhs.composition).append(xmedia, rhs.xmedia).append(care, rhs.care).append(dimensions, rhs.dimensions).isEquals();
    }

}
