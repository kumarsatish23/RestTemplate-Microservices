package in.vanna.ownerAPI.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.stereotype.Service;

import in.vanna.ownerAPI.binding.OwnersDTLS;
@Service
public class OwnerServiceImpl implements OwnerService {

	@Override
	public List<OwnersDTLS> getAllOwners() {
		return this.generateRandomeData();
	}

	@Override
	public Optional<OwnersDTLS> getOwner(UUID ownerId) {
		OwnersDTLS ownersDTLS=this.generateRandomeData().get(0);
		ownersDTLS.setId(ownerId);
		return Optional.of(ownersDTLS);
	}
	
	private List<OwnersDTLS> generateRandomeData(){
		List<OwnersDTLS> ownersDTLSs=new ArrayList<>();
		for(int i=0;i<5;i++) {
			ownersDTLSs.add(new OwnersDTLS());
		}
		return ownersDTLSs;
	}

}
