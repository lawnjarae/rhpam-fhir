
package com.hl7.diagnostic;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
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
    "resourceType",
    "id",
    "text",
    "identifier",
    "requisition",
    "status",
    "intent",
    "code",
    "subject",
    "authoredOn",
    "requester",
    "performer"
})
public class ProcedureReport implements Serializable
{

    @JsonProperty("resourceType")
    private String resourceType;
    @JsonProperty("id")
    private String id;
    @JsonProperty("text")
    private Text text;
    @JsonProperty("identifier")
    private List<Identifier> identifier = new ArrayList<Identifier>();
    @JsonProperty("requisition")
    private Requisition requisition;
    @JsonProperty("status")
    private String status;
    @JsonProperty("intent")
    private String intent;
    @JsonProperty("code")
    private Code code;
    @JsonProperty("subject")
    private Subject subject;
    @JsonProperty("authoredOn")
    private String authoredOn;
    @JsonProperty("requester")
    private Requester requester;
    @JsonProperty("performer")
    private Performer performer;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();
    private final static long serialVersionUID = -8659433790330969449L;

    /**
     * No args constructor for use in serialization
     *
     */
    public ProcedureReport() {
    }

    /**
     *
     * @param id
     * @param requester
     * @param text
     * @param status
     * @param subject
     * @param authoredOn
     * @param requisition
     * @param performer
     * @param code
     * @param intent
     * @param identifier
     * @param resourceType
     */
    public ProcedureReport(String resourceType, String id, Text text, List<Identifier> identifier, Requisition requisition, String status, String intent, Code code, Subject subject, String authoredOn, Requester requester, Performer performer) {
        super();
        this.resourceType = resourceType;
        this.id = id;
        this.text = text;
        this.identifier = identifier;
        this.requisition = requisition;
        this.status = status;
        this.intent = intent;
        this.code = code;
        this.subject = subject;
        this.authoredOn = authoredOn;
        this.requester = requester;
        this.performer = performer;
    }

    @JsonProperty("resourceType")
    public String getResourceType() {
        return resourceType;
    }

    @JsonProperty("resourceType")
    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("text")
    public Text getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(Text text) {
        this.text = text;
    }

    @JsonProperty("identifier")
    public List<Identifier> getIdentifier() {
        return identifier;
    }

    @JsonProperty("identifier")
    public void setIdentifier(List<Identifier> identifier) {
        this.identifier = identifier;
    }

    @JsonProperty("requisition")
    public Requisition getRequisition() {
        return requisition;
    }

    @JsonProperty("requisition")
    public void setRequisition(Requisition requisition) {
        this.requisition = requisition;
    }

    @JsonProperty("status")
    public String getStatus() {
        return status;
    }

    @JsonProperty("status")
    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("intent")
    public String getIntent() {
        return intent;
    }

    @JsonProperty("intent")
    public void setIntent(String intent) {
        this.intent = intent;
    }

    @JsonProperty("code")
    public Code getCode() {
        return code;
    }

    @JsonProperty("code")
    public void setCode(Code code) {
        this.code = code;
    }

    @JsonProperty("subject")
    public Subject getSubject() {
        return subject;
    }

    @JsonProperty("subject")
    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    @JsonProperty("authoredOn")
    public String getAuthoredOn() {
        return authoredOn;
    }

    @JsonProperty("authoredOn")
    public void setAuthoredOn(String authoredOn) {
        this.authoredOn = authoredOn;
    }

    @JsonProperty("requester")
    public Requester getRequester() {
        return requester;
    }

    @JsonProperty("requester")
    public void setRequester(Requester requester) {
        this.requester = requester;
    }

    @JsonProperty("performer")
    public Performer getPerformer() {
        return performer;
    }

    @JsonProperty("performer")
    public void setPerformer(Performer performer) {
        this.performer = performer;
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
        return new ToStringBuilder(this).append("resourceType", resourceType).append("id", id).append("text", text).append("identifier", identifier).append("requisition", requisition).append("status", status).append("intent", intent).append("code", code).append("subject", subject).append("authoredOn", authoredOn).append("requester", requester).append("performer", performer).append("additionalProperties", additionalProperties).toString();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder().append(requester).append(text).append(status).append(subject).append(requisition).append(code).append(intent).append(resourceType).append(id).append(additionalProperties).append(authoredOn).append(performer).append(identifier).toHashCode();
    }

    @Override
    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if ((other instanceof ProcedureReport) == false) {
            return false;
        }
        ProcedureReport rhs = ((ProcedureReport) other);
        return new EqualsBuilder().append(requester, rhs.requester).append(text, rhs.text).append(status, rhs.status).append(subject, rhs.subject).append(requisition, rhs.requisition).append(code, rhs.code).append(intent, rhs.intent).append(resourceType, rhs.resourceType).append(id, rhs.id).append(additionalProperties, rhs.additionalProperties).append(authoredOn, rhs.authoredOn).append(performer, rhs.performer).append(identifier, rhs.identifier).isEquals();
    }

}
