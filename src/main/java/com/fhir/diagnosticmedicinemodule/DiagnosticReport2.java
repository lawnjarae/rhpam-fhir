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
	@com.fasterxml.jackson.annotation.JsonProperty("id")
	private String id;
	@com.fasterxml.jackson.annotation.JsonProperty("meta")
	private Meta meta;
	@com.fasterxml.jackson.annotation.JsonProperty("text")
	private Text text;
	@com.fasterxml.jackson.annotation.JsonProperty("contained")
	private List<Contained> contained = new ArrayList<Contained>();
	@com.fasterxml.jackson.annotation.JsonProperty("identifier")
	private List<Identifier> identifier = new ArrayList<Identifier>();
	@com.fasterxml.jackson.annotation.JsonProperty("status")
	private String status;
	@com.fasterxml.jackson.annotation.JsonProperty("category")
	private Category category;
	@com.fasterxml.jackson.annotation.JsonProperty("code")
	private Code code;
	@com.fasterxml.jackson.annotation.JsonProperty("subject")
	private Subject subject;
	@com.fasterxml.jackson.annotation.JsonProperty("context")
	private Context context;
	@com.fasterxml.jackson.annotation.JsonProperty("effectiveDateTime")
	private String effectiveDateTime;
	@com.fasterxml.jackson.annotation.JsonProperty("issued")
	private String issued;
	@com.fasterxml.jackson.annotation.JsonProperty("performer")
	private List<Performer_> performer = new ArrayList<Performer_>();
	@com.fasterxml.jackson.annotation.JsonProperty("result")
	private List<Result> result = new ArrayList<Result>();
	@com.fasterxml.jackson.annotation.JsonProperty("presentedForm")
	private List<PresentedForm> presentedForm = new ArrayList<PresentedForm>();
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

	@JsonProperty("id")
	public String getId() {
		return id;
	}

	@JsonProperty("id")
	public void setId(String id) {
		this.id = id;
	}

	@JsonProperty("meta")
	public Meta getMeta() {
		return meta;
	}

	@JsonProperty("meta")
	public void setMeta(Meta meta) {
		this.meta = meta;
	}

	@JsonProperty("text")
	public Text getText() {
		return text;
	}

	@JsonProperty("text")
	public void setText(Text text) {
		this.text = text;
	}

	@JsonProperty("contained")
	public List<Contained> getContained() {
		return contained;
	}

	@JsonProperty("contained")
	public void setContained(List<Contained> contained) {
		this.contained = contained;
	}

	@JsonProperty("identifier")
	public List<Identifier> getIdentifier() {
		return identifier;
	}

	@JsonProperty("identifier")
	public void setIdentifier(List<Identifier> identifier) {
		this.identifier = identifier;
	}

	@JsonProperty("status")
	public String getStatus() {
		return status;
	}

	@JsonProperty("status")
	public void setStatus(String status) {
		this.status = status;
	}

	@JsonProperty("category")
	public Category getCategory() {
		return category;
	}

	@JsonProperty("category")
	public void setCategory(Category category) {
		this.category = category;
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

	@JsonProperty("context")
	public Context getContext() {
		return context;
	}

	@JsonProperty("context")
	public void setContext(Context context) {
		this.context = context;
	}

	@JsonProperty("effectiveDateTime")
	public String getEffectiveDateTime() {
		return effectiveDateTime;
	}

	@JsonProperty("effectiveDateTime")
	public void setEffectiveDateTime(String effectiveDateTime) {
		this.effectiveDateTime = effectiveDateTime;
	}

	@JsonProperty("issued")
	public String getIssued() {
		return issued;
	}

	@JsonProperty("issued")
	public void setIssued(String issued) {
		this.issued = issued;
	}

	@JsonProperty("performer")
	public List<Performer_> getPerformer() {
		return performer;
	}

	@JsonProperty("performer")
	public void setPerformer(List<Performer_> performer) {
		this.performer = performer;
	}

	@JsonProperty("result")
	public List<Result> getResult() {
		return result;
	}

	@JsonProperty("result")
	public void setResult(List<Result> result) {
		this.result = result;
	}

	@JsonProperty("presentedForm")
	public List<PresentedForm> getPresentedForm() {
		return presentedForm;
	}

	@JsonProperty("presentedForm")
	public void setPresentedForm(List<PresentedForm> presentedForm) {
		this.presentedForm = presentedForm;
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

	public DiagnosticReport2(
			java.lang.String resourceType,
			java.lang.String id,
			com.fhir.diagnosticmedicinemodule.Meta meta,
			com.fhir.diagnosticmedicinemodule.Text text,
			java.util.List<com.fhir.diagnosticmedicinemodule.Contained> contained,
			java.util.List<com.fhir.diagnosticmedicinemodule.Identifier> identifier,
			java.lang.String status,
			com.fhir.diagnosticmedicinemodule.Category category,
			com.fhir.diagnosticmedicinemodule.Code code,
			com.fhir.diagnosticmedicinemodule.Subject subject,
			com.fhir.diagnosticmedicinemodule.Context context,
			java.lang.String effectiveDateTime,
			java.lang.String issued,
			java.util.List<com.fhir.diagnosticmedicinemodule.Performer_> performer,
			java.util.List<com.fhir.diagnosticmedicinemodule.Result> result,
			java.util.List<com.fhir.diagnosticmedicinemodule.PresentedForm> presentedForm,
			java.lang.String conclusion) {
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
		this.conclusion = conclusion;
	}

}
