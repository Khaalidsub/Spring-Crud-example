package com.app.pharma.repositories;

import com.app.pharma.entities.Medicine;
import org.springframework.data.repository.CrudRepository;

public interface IMedicineRepository  extends CrudRepository<Medicine, Integer>  {
}
