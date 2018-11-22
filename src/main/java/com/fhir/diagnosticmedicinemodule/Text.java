
package com.fhir.diagnosticmedicinemodule;

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
    "status",
    "div"
})
public class Text implements Serializable
{

    @JsonProperty("status")
    private String status;
    @JsonProperty("div")
    private String div;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 613565313977382251L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Text() {
    }

    /**
     * 
     * @param status
     * @param div
     */
    public Text(String status, String div) {
        super();
        this.status = status;
        this.div = div;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("div")
    public String getDiv() {
        return div;
    }

    @JsonProperty("div")
    public void setDiv(String div) {
        this.div = div;
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
        return new ToStringBuilder(this).append("status", status).append("div", div).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(status).append(additionalProperties).append(div).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Text) == false) {
            return false;
        }
        Text rhs = ((Text) other);
        return new EqualsBuilder().append(status, rhs.status).append(additionalProperties, rhs.additionalProperties).append(div, rhs.div).isEquals();
    }

}
