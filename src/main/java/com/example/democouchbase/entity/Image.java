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
    "timestamp",
    "url",
    "aux",
    "type",
    "style"
})
public class Image {

    @JsonProperty("timestamp")
    private String timestamp;
    @JsonProperty("url")
    private String url;
    @JsonProperty("aux")
    private List<String> aux = new ArrayList<String>();
    @JsonProperty("type")
    private List<String> type = new ArrayList<String>();
    @JsonProperty("style")
    private Object style;

    @JsonProperty("timestamp")
    public String getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("aux")
    public List<String> getAux() {
        return aux;
    }

    @JsonProperty("aux")
    public void setAux(List<String> aux) {
        this.aux = aux;
    }

    @JsonProperty("type")
    public List<String> getType() {
        return type;
    }

    @JsonProperty("type")
    public void setType(List<String> type) {
        this.type = type;
    }

    @JsonProperty("style")
    public Object getStyle() {
        return style;
    }

    @JsonProperty("style")
    public void setStyle(Object style) {
        this.style = style;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("timestamp", timestamp).append("url", url).append("aux", aux).append("type", type).append("style", style).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(style).append(type).append(aux).append(url).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Image) == false) {
            return false;
        }
        Image rhs = ((Image) other);
        return new EqualsBuilder().append(style, rhs.style).append(type, rhs.type).append(aux, rhs.aux).append(url, rhs.url).append(timestamp, rhs.timestamp).isEquals();
    }

}
