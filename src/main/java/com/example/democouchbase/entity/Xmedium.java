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
    "path",
    "xmediaItems",
    "colorCode",
    "xmediaLocations"
})
public class Xmedium {

    @JsonProperty("path")
    private String path;
    @JsonProperty("xmediaItems")
    private List<XmediaItem> xmediaItems = new ArrayList<XmediaItem>();
    @JsonProperty("colorCode")
    private String colorCode;
    @JsonProperty("xmediaLocations")
    private List<XmediaLocation> xmediaLocations = new ArrayList<XmediaLocation>();

    @JsonProperty("path")
    public String getPath() {
        return path;
    }

    @JsonProperty("path")
    public void setPath(String path) {
        this.path = path;
    }

    @JsonProperty("xmediaItems")
    public List<XmediaItem> getXmediaItems() {
        return xmediaItems;
    }

    @JsonProperty("xmediaItems")
    public void setXmediaItems(List<XmediaItem> xmediaItems) {
        this.xmediaItems = xmediaItems;
    }

    @JsonProperty("colorCode")
    public String getColorCode() {
        return colorCode;
    }

    @JsonProperty("colorCode")
    public void setColorCode(String colorCode) {
        this.colorCode = colorCode;
    }

    @JsonProperty("xmediaLocations")
    public List<XmediaLocation> getXmediaLocations() {
        return xmediaLocations;
    }

    @JsonProperty("xmediaLocations")
    public void setXmediaLocations(List<XmediaLocation> xmediaLocations) {
        this.xmediaLocations = xmediaLocations;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("path", path).append("xmediaItems", xmediaItems).append("colorCode", colorCode).append("xmediaLocations", xmediaLocations).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(path).append(xmediaItems).append(colorCode).append(xmediaLocations).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Xmedium) == false) {
            return false;
        }
        Xmedium rhs = ((Xmedium) other);
        return new EqualsBuilder().append(path, rhs.path).append(xmediaItems, rhs.xmediaItems).append(colorCode, rhs.colorCode).append(xmediaLocations, rhs.xmediaLocations).isEquals();
    }

}
