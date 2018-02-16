package com.example.democouchbase.entity;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "part",
    "zones"
})
public class CompositionByZone {

    @JsonProperty("part")
    private Object part;
    @JsonProperty("zones")
    private Object zones;

    @JsonProperty("part")
    public Object getPart() {
        return part;
    }

    @JsonProperty("part")
    public void setPart(Object part) {
        this.part = part;
    }

    @JsonProperty("zones")
    public Object getZones() {
        return zones;
    }

    @JsonProperty("zones")
    public void setZones(Object zones) {
        this.zones = zones;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("part", part).append("zones", zones).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(zones).append(part).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof CompositionByZone) == false) {
            return false;
        }
        CompositionByZone rhs = ((CompositionByZone) other);
        return new EqualsBuilder().append(zones, rhs.zones).append(part, rhs.part).isEquals();
    }

}
