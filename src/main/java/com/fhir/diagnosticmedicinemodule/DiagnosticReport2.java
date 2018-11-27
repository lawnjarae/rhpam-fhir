package com.fhir.diagnosticmedicinemodule;

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

@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)
@com.fasterxml.jackson.annotation.JsonPropertyOrder({"resourceType", "id",
		"meta", "text", "contained", "identifier", "status", "category",
		"code", "subject", "context", "effectiveDateTime", "issued",
		"performer", "result", "presentedForm"})
public class DiagnosticReport2 implements Serializable {

	@com.fasterxml.jackson.annotation.JsonProperty("resourceType")
	private String resourceType;
	@com.fasterxml.jackson.annotation.JsonProperty("status")
	private String status;
	@JsonIgnore
	private Map<String, Object> additionalProperties = new HashMap<String, Object>();
	private final static long serialVersionUID = -6988836822536246194L;

	private java.lang.String conclusion;

	/**
	 * No args constructor for use in serialization
	 * 
	 */
	public DiagnosticReport2() {
	}

	/**
	 * 
	 * @param id
	 * @param result
	 * @param category
	 * @param text
	 * @param effectiveDateTime
	 * @param status
	 * @param subject
	 * @param issued
	 * @param context
	 * @param performer
	 * @param contained
	 * @param code
	 * @param presentedForm
	 * @param identifier
	 * @param meta
	 * @param resourceType
	 */
	public DiagnosticReport2(String resourceType, String id, Meta meta,
			Text text, List<Contained> contained, List<Identifier> identifier,
			String status, Category category, Code code, Subject subject,
			Context context, String effectiveDateTime, String issued,
			List<Performer_> performer, List<Result> result,
			List<PresentedForm> presentedForm) {
		super();
		this.resourceType = resourceType;
		this.id = id;
		this.meta = meta;
		this.text = text;
		this.contained = contained;
		this.identifier = identifier;
		this.status = status;
		this.category = category;
		this.code = code;
		this.subject = subject;
		this.context = context;
		this.effectiveDateTime = effectiveDateTime;
		this.issued = issued;
		this.performer = performer;
		this.result = result;
		this.presentedForm = presentedForm;
	}

	@JsonProperty("resourceType")
	public String getResourceType() {
		return resourceType;
	}

	@JsonProperty("resourceType")
	public void setResourceType(String resourceType) {
		this.resourceType = resourceType;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
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
		return new ToStringBuilder(this).append("resourceType", resourceType)
				.append("id", id).append("meta", meta).append("text", text)
				.append("contained", contained)
				.append("identifier", identifier).append("status", status)
				.append("category", category).append("code", code)
				.append("subject", subject).append("context", context)
				.append("effectiveDateTime", effectiveDateTime)
				.append("issued", issued).append("performer", performer)
				.append("result", result)
				.append("presentedForm", presentedForm)
				.append("additionalProperties", additionalProperties)
				.toString();
	}

	public java.lang.String getConclusion() {
		return this.conclusion;
	}

	public void setConclusion(java.lang.String conclusion) {
		this.conclusion = conclusion;
	}

	public DiagnosticReport2(java.lang.String resourceType,
			java.lang.String status, java.lang.String conclusion) {
		this.resourceType = resourceType;
		this.status = status;
		this.conclusion = conclusion;
	}

}
