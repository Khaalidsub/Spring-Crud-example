package com.app.pharma.services;
import com.app.pharma.entities.StoreOwner;
import com.app.pharma.repositories.IStoreOwnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StoreOwnerService  implements IStoreOwnerService {
    private IStoreOwnerRepository storeOwnerRepository;

    @Autowired
    public void setMedicineRepository(IStoreOwnerRepository storeOwnerRepository) {
        this.storeOwnerRepository = storeOwnerRepository;
    }


    @Override
    public Iterable<StoreOwner> listAllStoreOwner() {
        return storeOwnerRepository.findAll();
    }

    @Override
    public StoreOwner getStoreOwnerById(Integer id) {
        return storeOwnerRepository.findById(id).get();
    }

    @Override
    public StoreOwner saveStoreOwner(StoreOwner storeOwner) {
        return storeOwnerRepository.save(storeOwner);
    }

    @Override
    public void deleteStoreOwner(Integer id) {
    storeOwnerRepository.deleteById(id);
    }
}
