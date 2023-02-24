package in.vanna.ownerAPI.services;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import in.vanna.ownerAPI.binding.OwnersDTLS;

public interface OwnerService {
	List<OwnersDTLS> getAllOwners();
	Optional<OwnersDTLS> getOwner(UUID ownerId);
}
