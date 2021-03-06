package in.co.psoft.hrm.model;

import java.io.Serializable;
import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the ohrm_leave_entitlement database table.
 * 
 */
@Entity
@Table(name="ohrm_leave_entitlement")
@NamedQuery(name="OhrmLeaveEntitlement.findAll", query="SELECT o FROM OhrmLeaveEntitlement o")
public class OhrmLeaveEntitlement implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;

	@Column(name="created_by_name")
	private String createdByName;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="credited_date")
	private Date creditedDate;

	@Column(name="days_used")
	private BigDecimal daysUsed;

	private byte deleted;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="from_date")
	private Date fromDate;

	@Column(name="no_of_days")
	private BigDecimal noOfDays;

	private String note;

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="to_date")
	private Date toDate;

	//bi-directional many-to-one association to OhrmLeaveType
	@ManyToOne
	@JoinColumn(name="leave_type_id")
	private OhrmLeaveType ohrmLeaveType;

	//bi-directional many-to-one association to HsHrEmployee
	@ManyToOne
	@JoinColumn(name="emp_number")
	private HsHrEmployee hsHrEmployee;

	//bi-directional many-to-one association to OhrmLeaveEntitlementType
	@ManyToOne
	@JoinColumn(name="entitlement_type")
	private OhrmLeaveEntitlementType ohrmLeaveEntitlementType;

	//bi-directional many-to-one association to OhrmUser
	@ManyToOne
	@JoinColumn(name="created_by_id")
	private OhrmUser ohrmUser;

	//bi-directional many-to-one association to OhrmLeaveEntitlementAdjustment
	@OneToMany(mappedBy="ohrmLeaveEntitlement")
	private List<OhrmLeaveEntitlementAdjustment> ohrmLeaveEntitlementAdjustments;

	//bi-directional many-to-one association to OhrmLeaveLeaveEntitlement
	@OneToMany(mappedBy="ohrmLeaveEntitlement")
	private List<OhrmLeaveLeaveEntitlement> ohrmLeaveLeaveEntitlements;

	public OhrmLeaveEntitlement() {
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCreatedByName() {
		return this.createdByName;
	}

	public void setCreatedByName(String createdByName) {
		this.createdByName = createdByName;
	}

	public Date getCreditedDate() {
		return this.creditedDate;
	}

	public void setCreditedDate(Date creditedDate) {
		this.creditedDate = creditedDate;
	}

	public BigDecimal getDaysUsed() {
		return this.daysUsed;
	}

	public void setDaysUsed(BigDecimal daysUsed) {
		this.daysUsed = daysUsed;
	}

	public byte getDeleted() {
		return this.deleted;
	}

	public void setDeleted(byte deleted) {
		this.deleted = deleted;
	}

	public Date getFromDate() {
		return this.fromDate;
	}

	public void setFromDate(Date fromDate) {
		this.fromDate = fromDate;
	}

	public BigDecimal getNoOfDays() {
		return this.noOfDays;
	}

	public void setNoOfDays(BigDecimal noOfDays) {
		this.noOfDays = noOfDays;
	}

	public String getNote() {
		return this.note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public Date getToDate() {
		return this.toDate;
	}

	public void setToDate(Date toDate) {
		this.toDate = toDate;
	}

	public OhrmLeaveType getOhrmLeaveType() {
		return this.ohrmLeaveType;
	}

	public void setOhrmLeaveType(OhrmLeaveType ohrmLeaveType) {
		this.ohrmLeaveType = ohrmLeaveType;
	}

	public HsHrEmployee getHsHrEmployee() {
		return this.hsHrEmployee;
	}

	public void setHsHrEmployee(HsHrEmployee hsHrEmployee) {
		this.hsHrEmployee = hsHrEmployee;
	}

	public OhrmLeaveEntitlementType getOhrmLeaveEntitlementType() {
		return this.ohrmLeaveEntitlementType;
	}

	public void setOhrmLeaveEntitlementType(OhrmLeaveEntitlementType ohrmLeaveEntitlementType) {
		this.ohrmLeaveEntitlementType = ohrmLeaveEntitlementType;
	}

	public OhrmUser getOhrmUser() {
		return this.ohrmUser;
	}

	public void setOhrmUser(OhrmUser ohrmUser) {
		this.ohrmUser = ohrmUser;
	}

	public List<OhrmLeaveEntitlementAdjustment> getOhrmLeaveEntitlementAdjustments() {
		return this.ohrmLeaveEntitlementAdjustments;
	}

	public void setOhrmLeaveEntitlementAdjustments(List<OhrmLeaveEntitlementAdjustment> ohrmLeaveEntitlementAdjustments) {
		this.ohrmLeaveEntitlementAdjustments = ohrmLeaveEntitlementAdjustments;
	}

	public OhrmLeaveEntitlementAdjustment addOhrmLeaveEntitlementAdjustment(OhrmLeaveEntitlementAdjustment ohrmLeaveEntitlementAdjustment) {
		getOhrmLeaveEntitlementAdjustments().add(ohrmLeaveEntitlementAdjustment);
		ohrmLeaveEntitlementAdjustment.setOhrmLeaveEntitlement(this);

		return ohrmLeaveEntitlementAdjustment;
	}

	public OhrmLeaveEntitlementAdjustment removeOhrmLeaveEntitlementAdjustment(OhrmLeaveEntitlementAdjustment ohrmLeaveEntitlementAdjustment) {
		getOhrmLeaveEntitlementAdjustments().remove(ohrmLeaveEntitlementAdjustment);
		ohrmLeaveEntitlementAdjustment.setOhrmLeaveEntitlement(null);

		return ohrmLeaveEntitlementAdjustment;
	}

	public List<OhrmLeaveLeaveEntitlement> getOhrmLeaveLeaveEntitlements() {
		return this.ohrmLeaveLeaveEntitlements;
	}

	public void setOhrmLeaveLeaveEntitlements(List<OhrmLeaveLeaveEntitlement> ohrmLeaveLeaveEntitlements) {
		this.ohrmLeaveLeaveEntitlements = ohrmLeaveLeaveEntitlements;
	}

	public OhrmLeaveLeaveEntitlement addOhrmLeaveLeaveEntitlement(OhrmLeaveLeaveEntitlement ohrmLeaveLeaveEntitlement) {
		getOhrmLeaveLeaveEntitlements().add(ohrmLeaveLeaveEntitlement);
		ohrmLeaveLeaveEntitlement.setOhrmLeaveEntitlement(this);

		return ohrmLeaveLeaveEntitlement;
	}

	public OhrmLeaveLeaveEntitlement removeOhrmLeaveLeaveEntitlement(OhrmLeaveLeaveEntitlement ohrmLeaveLeaveEntitlement) {
		getOhrmLeaveLeaveEntitlements().remove(ohrmLeaveLeaveEntitlement);
		ohrmLeaveLeaveEntitlement.setOhrmLeaveEntitlement(null);

		return ohrmLeaveLeaveEntitlement;
	}

}