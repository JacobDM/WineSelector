package klfmediatest.jake.wineselector.wine;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * @author Jacob Miller
 * 
 * Wine entity containing product information.
 *
 */
@Entity
@Table(name = "Products")
public class Wine {

	@Id
	@Column(name = "prodID")
	private Integer prodID;
	
	@Column(name = "prodNum")
	private Long prodNum;
	
	@Column(name = "prodName")
	private String prodName;
	
	@Column(name = "prodColorId")
	private Integer colorId;
	
	@Column(name = "prodPack")
	private Integer prodPack;
	
	@Column(name = "prodRegionID")
	private Integer regionID;
	
	@Column(name = "prodNoRequest")
	private Integer amountRequested;
	
	@Column(name = "prodIDSupplier")
	private Integer supplierID;
	
	@Column(name = "prodDateBuy")
	@Temporal(TemporalType.DATE)
	private Date datePurchased;
	
	@Column(name = "prodQtyBuy")
	private Integer quantityPurchased;
	
	@Column(name = "prodFormat")
	private Integer prodFormat;
	
	@Column(name = "prodPriceBuy")
	private Double purchasePrice;
	
	@Column(name = "prodLabelCharge")
	private Double labelCharge;
	
	@Column(name = "prodBottleCharge")
	private Double bottleCharge;
	
	@Column(name = "prodBottleChargePerson")
	private Double chargePerPerson;
	
	@Column(name = "prodComment")
	private String prodComment;
	
	private Wine() { }
	
	private Wine(long prodNum, String prodName, Integer colorId, Integer prodPack, Integer regionID, Integer amountRequested, 
				Integer supplierID, Date datePurchased, Integer quantityPurchased, Integer prodFormat, Double purchasePrice, 
				Double labelCharge, Double bottleCharge, Double chargePerPerson, String prodComment) {
		this.prodNum = prodNum;
		this.prodName = prodName;
		this.colorId = colorId;
		this.prodPack = prodPack;
		this.regionID = regionID;
		this.amountRequested = amountRequested;
		this.supplierID = supplierID;
		this.datePurchased = datePurchased;
		this.quantityPurchased = quantityPurchased;
		this.prodFormat = prodFormat;
		this.purchasePrice = purchasePrice;
		this.labelCharge = labelCharge;
		this.bottleCharge = bottleCharge;
		this.chargePerPerson = chargePerPerson;
		this.prodComment = prodComment;
	}
	
	public Integer getProdID() {
		return prodID;
	}

	public long getProdNum() {
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

	/**
	 * @author Jacob Miller
	 * 
	 * Builder for the Wine class. Useless since the database is
	 * read-only but wanted to show what I would do if the requirements
	 * required database persistence. I'd utilize a builder as this class' 
	 * parameter list is monolithic.
	 *
	 */
	public static class Builder {

		private long prodNum;

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
		
		public Builder() { }

		public Builder setProdNum(long prodNum) {
			this.prodNum = prodNum;
			return this;
		}

		public Builder setProdName(String prodName) {
			this.prodName = prodName;
			return this;
		}

		public Builder setColorId(Integer colorId) {
			this.colorId = colorId;
			return this;
		}

		public Builder setProdPack(Integer prodPack) {
			this.prodPack = prodPack;
			return this;
		}

		public Builder setRegionID(Integer regionID) {
			this.regionID = regionID;
			return this;
		}

		public Builder setAmountRequested(Integer amountRequested) {
			this.amountRequested = amountRequested;
			return this;
		}

		public Builder setSupplierID(Integer supplierID) {
			this.supplierID = supplierID;
			return this;
		}

		public Builder setDatePurchased(Date datePurchased) {
			this.datePurchased = datePurchased;
			return this;
		}

		public Builder setQuantityPurchased(Integer quantityPurchased) {
			this.quantityPurchased = quantityPurchased;
			return this;
		}

		public Builder setProdFormat(Integer prodFormat) {
			this.prodFormat = prodFormat;
			return this;
		}
		
		public Builder setPurchasePrice(Double purchasePrice) {
			this.purchasePrice = purchasePrice;
			return this;
		}

		public Builder setLabelCharge(Double labelCharge) {
			this.labelCharge = labelCharge;
			return this;
		}

		public Builder setBottleCharge(Double bottleCharge) {
			this.bottleCharge = bottleCharge;
			return this;
		}

		public Builder setChargePerPerson(Double chargePerPerson) {
			this.chargePerPerson = chargePerPerson;
			return this;
		}

		public Builder setProdComment(String prodComment) {
			this.prodComment = prodComment;
			return this;
		}
		
		public Wine build() {
			return new Wine(prodNum, prodName, colorId, prodPack, regionID, amountRequested, 
					supplierID, datePurchased, quantityPurchased, prodFormat, purchasePrice, 
					labelCharge, bottleCharge, chargePerPerson, prodComment);
		}
		
	}

}
