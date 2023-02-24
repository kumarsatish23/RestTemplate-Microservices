package in.vanna.buildingAPI.service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import in.vanna.buildingAPI.binding.BuildingDTLS;
@Service
public class BuildingServiceImpl implements BuildingService {
	@Autowired
	private RestTemplate restTemplate;

	@Override
	public List<BuildingDTLS> getAllBuilding() {
		return this.generateRandomeData();
	}

	@Override
	public String getBuildingDTLS(UUID buildingId) {
		BuildingDTLS buildingDTLS=this.generateRandomeData().get(0);
		buildingDTLS.setBuildingId(buildingId);
		String ownerDTLS=ownerDTLS(buildingDTLS.getOwnerId());
		return buildingDTLS+"OwnerDetails "+ownerDTLS;
	}

	private List<BuildingDTLS> generateRandomeData() {
		List<BuildingDTLS> buildingDTLSs = new ArrayList<>();
		for (int i = 0; i < 5; i++) {
			buildingDTLSs.add(new BuildingDTLS());
		}
		return buildingDTLSs;
	}

	private String ownerDTLS(UUID ownerId) {
		ResponseEntity<String> responseEntity = restTemplate.getForEntity("http://43.204.219.101:8080/Owner/" + ownerId, String.class);
		return responseEntity.getBody();
	}
}
