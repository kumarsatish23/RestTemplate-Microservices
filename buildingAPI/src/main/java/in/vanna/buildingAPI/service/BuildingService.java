package in.vanna.buildingAPI.service;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.vanna.buildingAPI.binding.BuildingDTLS;
public interface BuildingService {
	List<BuildingDTLS> getAllBuilding();
	String getBuildingDTLS(UUID buildingId);
}
