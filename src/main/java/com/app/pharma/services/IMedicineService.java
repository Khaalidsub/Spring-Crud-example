package com.app.pharma.services;

import com.app.pharma.entities.Medicine;

public interface IMedicineService {
    Iterable<Medicine> listAllMedicines();

    Medicine getMedicineById(Integer id);

    Medicine saveMedicine(Medicine medicine);

    void deleteMedicine(Integer id);
}
