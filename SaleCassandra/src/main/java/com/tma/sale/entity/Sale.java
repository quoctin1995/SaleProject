package com.tma.sale.entity;
import java.math.BigDecimal;
import java.util.UUID;

import org.springframework.cassandra.core.PrimaryKeyType;
import org.springframework.data.cassandra.mapping.Column;
import org.springframework.data.cassandra.mapping.PrimaryKeyColumn;
import org.springframework.data.cassandra.mapping.Table;
@Table("sale")
public class Sale {

	@PrimaryKeyColumn(name = "product_id", ordinal = 0, type = PrimaryKeyType.PARTITIONED)
	private UUID productId;
	@PrimaryKeyColumn(name = "time_id", ordinal = 1, type = PrimaryKeyType.CLUSTERED)
	private UUID timeId;
	@PrimaryKeyColumn(name = "location_id", ordinal = 2, type = PrimaryKeyType.CLUSTERED)
	private UUID locationId;
	@Column("dollars")
	private BigDecimal dollars;


	public BigDecimal getDollars() {
		return dollars;
	}

	public Sale(UUID productId, UUID timeId, UUID locationId, BigDecimal dollars) {
		super();
		this.productId = productId;
		this.timeId = timeId;
		this.locationId = locationId;
		this.dollars = dollars;
	}

	public void setDollars(BigDecimal dollars) {
		this.dollars = dollars;
	}

	public UUID getProductId() {
		return productId;
	}

	public void setProductId(UUID productId) {
		this.productId = productId;
	}

	public UUID getTimeId() {
		return timeId;
	}

	public void setTimeId(UUID timeId) {
		this.timeId = timeId;
	}

	public UUID getLocationId() {
		return locationId;
	}

	public void setLocationId(UUID locationId) {
		this.locationId = locationId;
	}

}
