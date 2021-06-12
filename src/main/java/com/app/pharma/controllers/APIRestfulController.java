package com.app.pharma.controllers;

import com.app.pharma.entities.Medicine;
import com.app.pharma.entities.StoreOwner;
import com.app.pharma.services.IMedicineService;
import com.app.pharma.services.IStoreOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class APIRestfulController {

    private IMedicineService medicineService;
    private IStoreOwnerService storeOwnerService;
    @Autowired
    public void setMedicineService(IMedicineService medicineService) {
        this.medicineService = medicineService;
    }

    @Autowired
    public void setStoreOwnerService(IStoreOwnerService storeOwnerService) {
        this.storeOwnerService = storeOwnerService;
    }

    @GetMapping("api/storeowners")
    public Iterable<StoreOwner> storeOwners() {
        return storeOwnerService.listAllStoreOwner();
    }

    @GetMapping("api/medicines")
    public Iterable<Medicine> medicines() {
        return medicineService.listAllMedicines();
    }
}
