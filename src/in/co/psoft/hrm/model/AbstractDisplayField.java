package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigInteger;


/**
 * The persistent class for the abstract_display_field database table.
 * 
 */
@Entity
@Table(name="abstract_display_field")
@NamedQuery(name="AbstractDisplayField.findAll", query="SELECT a FROM AbstractDisplayField a")
public class AbstractDisplayField implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;

	@Column(name="default_value")
	private String defaultValue;

	@Column(name="display_field_group_id")
	private BigInteger displayFieldGroupId;

	@Lob
	@Column(name="element_property")
	private String elementProperty;

	@Column(name="element_type")
	private String elementType;

	@Column(name="field_alias")
	private String fieldAlias;

	@Column(name="is_encrypted")
	private byte isEncrypted;

	@Column(name="is_exportable")
	private String isExportable;

	@Column(name="is_meta")
	private byte isMeta;

	@Column(name="is_sortable")
	private String isSortable;

	@Column(name="is_value_list")
	private byte isValueList;

	private String label;

	private String name;

	@Column(name="report_group_id")
	private BigInteger reportGroupId;

	@Column(name="sort_field")
	private String sortField;

	@Column(name="sort_order")
	private String sortOrder;

	@Column(name="text_alignment_style")
	private String textAlignmentStyle;

	private String width;

	public AbstractDisplayField() {
	}

	public String getId() {
		return this.id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDefaultValue() {
		return this.defaultValue;
	}

	public void setDefaultValue(String defaultValue) {
		this.defaultValue = defaultValue;
	}

	public BigInteger getDisplayFieldGroupId() {
		return this.displayFieldGroupId;
	}

	public void setDisplayFieldGroupId(BigInteger displayFieldGroupId) {
		this.displayFieldGroupId = displayFieldGroupId;
	}

	public String getElementProperty() {
		return this.elementProperty;
	}

	public void setElementProperty(String elementProperty) {
		this.elementProperty = elementProperty;
	}

	public String getElementType() {
		return this.elementType;
	}

	public void setElementType(String elementType) {
		this.elementType = elementType;
	}

	public String getFieldAlias() {
		return this.fieldAlias;
	}

	public void setFieldAlias(String fieldAlias) {
		this.fieldAlias = fieldAlias;
	}

	public byte getIsEncrypted() {
		return this.isEncrypted;
	}

	public void setIsEncrypted(byte isEncrypted) {
		this.isEncrypted = isEncrypted;
	}

	public String getIsExportable() {
		return this.isExportable;
	}

	public void setIsExportable(String isExportable) {
		this.isExportable = isExportable;
	}

	public byte getIsMeta() {
		return this.isMeta;
	}

	public void setIsMeta(byte isMeta) {
		this.isMeta = isMeta;
	}

	public String getIsSortable() {
		return this.isSortable;
	}

	public void setIsSortable(String isSortable) {
		this.isSortable = isSortable;
	}

	public byte getIsValueList() {
		return this.isValueList;
	}

	public void setIsValueList(byte isValueList) {
		this.isValueList = isValueList;
	}

	public String getLabel() {
		return this.label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public BigInteger getReportGroupId() {
		return this.reportGroupId;
	}

	public void setReportGroupId(BigInteger reportGroupId) {
		this.reportGroupId = reportGroupId;
	}

	public String getSortField() {
		return this.sortField;
	}

	public void setSortField(String sortField) {
		this.sortField = sortField;
	}

	public String getSortOrder() {
		return this.sortOrder;
	}

	public void setSortOrder(String sortOrder) {
		this.sortOrder = sortOrder;
	}

	public String getTextAlignmentStyle() {
		return this.textAlignmentStyle;
	}

	public void setTextAlignmentStyle(String textAlignmentStyle) {
		this.textAlignmentStyle = textAlignmentStyle;
	}

	public String getWidth() {
		return this.width;
	}

	public void setWidth(String width) {
		this.width = width;
	}

}