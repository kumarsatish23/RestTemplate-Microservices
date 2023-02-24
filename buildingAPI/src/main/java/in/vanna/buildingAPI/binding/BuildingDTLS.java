package in.vanna.buildingAPI.binding;

import java.util.UUID;

import org.apache.commons.lang3.RandomStringUtils;

import lombok.Data;
@Data
public class BuildingDTLS {
	private UUID buildingId;
	private String buildingName;
	private Double longitude;
	private Double latitude;
	private UUID ownerId;
	
	public BuildingDTLS() {
		this.buildingId=UUID.randomUUID();
		this.buildingName=RandomStringUtils.randomAlphabetic(10);
		this.longitude=Math.random() * Math.PI * 2;
		this.latitude=Math.acos(Math.random() * 2 - 1);
		this.ownerId=UUID.randomUUID();
	}
}
