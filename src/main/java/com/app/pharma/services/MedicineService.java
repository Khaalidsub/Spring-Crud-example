package com.app.pharma.services;

import com.app.pharma.entities.Medicine;
import com.app.pharma.repositories.IMedicineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicineService implements IMedicineService {

    private IMedicineRepository medicineRepository;

    @Autowired
    public void setMedicineRepository(IMedicineRepository medicineRepository) {
        this.medicineRepository = medicineRepository;
    }

    @Override
    public Iterable<Medicine> listAllMedicines() {
        return medicineRepository.findAll();
    }

    @Override
    public Medicine getMedicineById(Integer id) {
        return medicineRepository.findById(id).get();
    }

    @Override
    public Medicine saveMedicine(Medicine medicine) {
        return medicineRepository.save(medicine);
    }

    @Override
    public void deleteMedicine(Integer id) {
        medicineRepository.deleteById(id);
    }

}
