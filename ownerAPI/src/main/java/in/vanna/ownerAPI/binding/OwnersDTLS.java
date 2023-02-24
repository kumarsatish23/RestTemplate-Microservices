package in.vanna.ownerAPI.binding;


import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.commons.lang3.RandomUtils;

import lombok.Data;
@Data
public class OwnersDTLS {
	private UUID id;
	private String name;
	private Integer age;
	private String gender;
	
	public OwnersDTLS() {
		this.id=UUID.randomUUID();
		this.name=RandomStringUtils.randomAlphabetic(10);
		this.age= RandomUtils.nextInt()%100;
		List<String> genders = Arrays.asList("male", "female", "none");
		this.gender=genders.get(RandomUtils.nextInt()%genders.size());
	}
}
