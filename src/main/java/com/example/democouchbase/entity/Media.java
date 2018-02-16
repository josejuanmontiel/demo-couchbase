package com.example.democouchbase.entity;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "format",
    "clazz",
    "idMedia",
    "extraInfo",
    "timestamp"
})
public class Media {

    @JsonProperty("format")
    private Integer format;
    @JsonProperty("clazz")
    private Integer clazz;
    @JsonProperty("idMedia")
    private String idMedia;
    @JsonProperty("extraInfo")
    private Object extraInfo;
    @JsonProperty("timestamp")
    private Integer timestamp;

    @JsonProperty("format")
    public Integer getFormat() {
        return format;
    }

    @JsonProperty("format")
    public void setFormat(Integer format) {
        this.format = format;
    }

    @JsonProperty("clazz")
    public Integer getClazz() {
        return clazz;
    }

    @JsonProperty("clazz")
    public void setClazz(Integer clazz) {
        this.clazz = clazz;
    }

    @JsonProperty("idMedia")
    public String getIdMedia() {
        return idMedia;
    }

    @JsonProperty("idMedia")
    public void setIdMedia(String idMedia) {
        this.idMedia = idMedia;
    }

    @JsonProperty("extraInfo")
    public Object getExtraInfo() {
        return extraInfo;
    }

    @JsonProperty("extraInfo")
    public void setExtraInfo(Object extraInfo) {
        this.extraInfo = extraInfo;
    }

    @JsonProperty("timestamp")
    public Integer getTimestamp() {
        return timestamp;
    }

    @JsonProperty("timestamp")
    public void setTimestamp(Integer timestamp) {
        this.timestamp = timestamp;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("format", format).append("clazz", clazz).append("idMedia", idMedia).append("extraInfo", extraInfo).append("timestamp", timestamp).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(format).append(clazz).append(idMedia).append(extraInfo).append(timestamp).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Media) == false) {
            return false;
        }
        Media rhs = ((Media) other);
        return new EqualsBuilder().append(format, rhs.format).append(clazz, rhs.clazz).append(idMedia, rhs.idMedia).append(extraInfo, rhs.extraInfo).append(timestamp, rhs.timestamp).isEquals();
    }

}
