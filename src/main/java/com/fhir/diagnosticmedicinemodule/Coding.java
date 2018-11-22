
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
    "system",
    "code",
    "display"
})
public class Coding implements Serializable
{

    @JsonProperty("system")
    private String system;
    @JsonProperty("code")
    private String code;
    @JsonProperty("display")
    private String display;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = 2051020085481278858L;

    /**
     * No args constructor for use in serialization
     * 
     */
    public Coding() {
    }

    /**
     * 
     * @param system
     * @param display
     * @param code
     */
    public Coding(String system, String code, String display) {
        super();
        this.system = system;
        this.code = code;
        this.display = display;
    }

    @JsonProperty("system")
    public String getSystem() {
        return system;
    }

    @JsonProperty("system")
    public void setSystem(String system) {
        this.system = system;
    }

    @JsonProperty("code")
    public String getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(String code) {
        this.code = code;
    }

    @JsonProperty("display")
    public String getDisplay() {
        return display;
    }

    @JsonProperty("display")
    public void setDisplay(String display) {
        this.display = display;
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
        return new ToStringBuilder(this).append("system", system).append("code", code).append("display", display).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(system).append(additionalProperties).append(display).append(code).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof Coding) == false) {
            return false;
        }
        Coding rhs = ((Coding) other);
        return new EqualsBuilder().append(system, rhs.system).append(additionalProperties, rhs.additionalProperties).append(display, rhs.display).append(code, rhs.code).isEquals();
    }

}
