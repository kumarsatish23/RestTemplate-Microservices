package in.vanna.buildingAPI.rest;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.vanna.buildingAPI.binding.BuildingDTLS;
import in.vanna.buildingAPI.service.BuildingService;
@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	BuildingService buildingService;
	
	@GetMapping("/Buildings")
	public List<BuildingDTLS> getAllBuilding(){
		return buildingService.getAllBuilding();
	}
	
	@GetMapping("/Building/{buildingId}")
	public String getBuildingDTLS(@PathVariable UUID buildingId) {
		return buildingService.getBuildingDTLS(buildingId);
	}

}
