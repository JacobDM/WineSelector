package klfmediatest.jake.wineselector.wine;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

/**
 * @author Jacob Miller
 * 
 * Generic DTO class for the {@link Wine} object.
 *
 */
@JsonInclude(Include.NON_EMPTY)
public class WineDto {
	
	private Integer prodID;

	private Long prodNum;

	private String prodName;

	private Integer colorId;

	private Integer prodPack;

	private Integer regionID;

	private Integer amountRequested;

	private Integer supplierID;

	private Date datePurchased;

	private Integer quantityPurchased;

	private Integer prodFormat;

	private Double purchasePrice;

	private Double labelCharge;

	private Double bottleCharge;
	
	private Double chargePerPerson;

	private String prodComment;
	
	public WineDto() { }

	public Integer getProdID() {
		return prodID;
	}

	public Long getProdNum() {
		return prodNum;
	}

	public String getProdName() {
		return prodName;
	}

	public Integer getColorId() {
		return colorId;
	}

	public Integer getProdPack() {
		return prodPack;
	}

	public Integer getRegionID() {
		return regionID;
	}

	public Integer getAmountRequested() {
		return amountRequested;
	}

	public Integer getSupplierID() {
		return supplierID;
	}

	public Date getDatePurchased() {
		return datePurchased;
	}

	public Integer getQuantityPurchased() {
		return quantityPurchased;
	}

	public Integer getProdFormat() {
		return prodFormat;
	}

	public Double getPurchasePrice() {
		return purchasePrice;
	}

	public Double getLabelCharge() {
		return labelCharge;
	}

	public Double getBottleCharge() {
		return bottleCharge;
	}

	public Double getChargePerPerson() {
		return chargePerPerson;
	}

	public String getProdComment() {
		return prodComment;
	}

	public WineDto setProdID(Integer prodID) {
		this.prodID = prodID;
		return this;
	}

	public WineDto setProdNum(Long prodNum) {
		this.prodNum = prodNum;
		return this;
	}

	public WineDto setProdName(String prodName) {
		this.prodName = prodName;
		return this;
	}

	public WineDto setColorId(Integer colorId) {
		this.colorId = colorId;
		return this;
	}

	public WineDto setProdPack(Integer prodPack) {
		this.prodPack = prodPack;
		return this;
	}

	public WineDto setRegionID(Integer regionID) {
		this.regionID = regionID;
		return this;
	}

	public WineDto setAmountRequested(Integer amountRequested) {
		this.amountRequested = amountRequested;
		return this;
	}

	public WineDto setSupplierID(Integer supplierID) {
		this.supplierID = supplierID;
		return this;
	}

	public WineDto setDatePurchased(Date datePurchased) {
		this.datePurchased = datePurchased;
		return this;
	}

	public WineDto setQuantityPurchased(Integer quantityPurchased) {
		this.quantityPurchased = quantityPurchased;
		return this;
	}

	public WineDto setProdFormat(Integer prodFormat) {
		this.prodFormat = prodFormat;
		return this;
	}

	public WineDto setPurchasePrice(Double purchasePrice) {
		this.purchasePrice = purchasePrice;
		return this;
	}

	public WineDto setLabelCharge(Double labelCharge) {
		this.labelCharge = labelCharge;
		return this;
	}

	public WineDto setBottleCharge(Double bottleCharge) {
		this.bottleCharge = bottleCharge;
		return this;
	}

	public WineDto setChargePerPerson(Double chargePerPerson) {
		this.chargePerPerson = chargePerPerson;
		return this;
	}

	public WineDto setProdComment(String prodComment) {
		this.prodComment = prodComment;
		return this;
	}

}
