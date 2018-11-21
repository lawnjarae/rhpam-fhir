
package com.hl7.diagnostic;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "low",
    "high"
})
public class ReferenceRange implements Serializable
{

    @JsonProperty("low")
    private Low low;
    @JsonProperty("high")
    private High high;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -2045576881704706620L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public ReferenceRange() {
    }

    /**
     * 
     * @param high
     * @param low
     */
    public ReferenceRange(Low low, High high) {
        super();
        this.low = low;
        this.high = high;
    }

    @JsonProperty("low")
    public Low getLow() {
        return low;
    }

    @JsonProperty("low")
    public void setLow(Low low) {
        this.low = low;
    }

    @JsonProperty("high")
    public High getHigh() {
        return high;
    }

    @JsonProperty("high")
    public void setHigh(High high) {
        this.high = high;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("low", low).append("high", high).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(additionalProperties).append(high).append(low).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ReferenceRange) == false) {
            return false;
        }
        ReferenceRange rhs = ((ReferenceRange) other);
        return new EqualsBuilder().append(additionalProperties, rhs.additionalProperties).append(high, rhs.high).append(low, rhs.low).isEquals();
    }

}
