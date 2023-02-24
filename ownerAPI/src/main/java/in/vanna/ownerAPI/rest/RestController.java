package in.vanna.ownerAPI.rest;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import in.vanna.ownerAPI.binding.OwnersDTLS;
import in.vanna.ownerAPI.services.OwnerService;

@org.springframework.web.bind.annotation.RestController
public class RestController {
	@Autowired
	private OwnerService ownerService;
	
	@GetMapping("/owners")
	public List<OwnersDTLS> getAllOwners(){
		return ownerService.getAllOwners();
	}
	@GetMapping("/Owner/{id}")
	public Optional<OwnersDTLS> getOwner(@PathVariable UUID id){
		return ownerService.getOwner(id);
	}
}
