package com.app.pharma.repositories;
import com.app.pharma.entities.Medicine;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMedicineRepository  extends JpaRepository<Medicine, Integer> {
}
