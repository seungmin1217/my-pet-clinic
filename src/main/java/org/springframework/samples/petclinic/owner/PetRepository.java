package org.springframework.samples.petclinic.owner;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.Repository;

// 디대일 연관관계를 위해 추가한 repository
public interface PetRepository extends Repository<Pet, Integer> {

	void save(Pet pet);
}
