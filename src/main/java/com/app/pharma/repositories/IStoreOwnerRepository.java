package com.app.pharma.repositories;
import com.app.pharma.entities.StoreOwner;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStoreOwnerRepository extends JpaRepository<StoreOwner, Integer> {
}