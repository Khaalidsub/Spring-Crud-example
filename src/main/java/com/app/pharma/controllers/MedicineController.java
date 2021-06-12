package com.app.pharma.controllers;
import com.app.pharma.entities.Medicine;
import com.app.pharma.services.IMedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;


@Controller
public class MedicineController {

    private IMedicineService medicineService;

    @Autowired
    public void setMedicineService(IMedicineService medicineService) {
        this.medicineService = medicineService;
    }

    /**
     * List all medicines.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/medicines", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("medicines", medicineService.listAllMedicines());
        System.out.println("Returning rpoducts:");
        return "medicines";
    }

    /**
     * View a specific medicine by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "medicine/{id}",method = RequestMethod.GET)
    public String showmedicine(@PathVariable Integer id, Model model) {
        model.addAttribute("medicine", medicineService.getMedicineById(id));
        return "medicineshow";
    }


    @RequestMapping("medicine/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("medicine", medicineService.getMedicineById(id));
        return "medicineForm";
    }

    /**
     * New medicine.
     *
     * @param model
     * @return
     */
    @RequestMapping("medicine/new")
    public String newMedicine(Model model) {
        model.addAttribute("medicine", new Medicine());
        return "medicineForm";
    }

    /**
     * Save medicine to database.
     *
     * @param medicine
     * @return
     */
    @RequestMapping(value = "medicine", method = RequestMethod.POST)
    public String saveMedicine(Medicine medicine) {
        medicineService.saveMedicine(medicine);
        return "redirect:/medicine/" + medicine.getId();
    }

    /**
     * Delete medicine by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("medicine/delete/{id}")
    public String delete(@PathVariable Integer id) {
        medicineService.deleteMedicine(id);
        return "redirect:/medicines";
    }

}
