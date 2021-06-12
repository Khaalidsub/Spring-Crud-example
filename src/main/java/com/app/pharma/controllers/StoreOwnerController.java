package com.app.pharma.controllers;

import com.app.pharma.entities.StoreOwner;
import com.app.pharma.services.IStoreOwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class StoreOwnerController {
    private IStoreOwnerService storeOwnerService;

    @Autowired
    public void setStoreOwnerService(IStoreOwnerService storeOwnerService) {
        this.storeOwnerService = storeOwnerService;
    }

    /**
     * List all storeowners.
     *
     * @param model
     * @return
     */
    @RequestMapping(value = "/storeOwners", method = RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("storeOwners", storeOwnerService.listAllStoreOwner());
        System.out.println("Returning rpoducts:");
        return "storeOwners";
    }

    /**
     * View a specific storeOwner by its id.
     *
     * @param id
     * @param model
     * @return
     */
    @RequestMapping(value = "storeOwner/{id}",method = RequestMethod.GET)
    public String showstoreOwner(@PathVariable Integer id, Model model) {
        model.addAttribute("storeOwner", storeOwnerService.getStoreOwnerById(id));
        return "storeOwnershow";
    }


    @RequestMapping("storeOwner/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("storeOwner", storeOwnerService.getStoreOwnerById(id));
        return "storeOwnerForm";
    }

    /**
     * New storeOwner.
     *
     * @param model
     * @return
     */
    @RequestMapping("storeOwner/new")
    public String newStoreOwner(Model model) {
        model.addAttribute("storeOwner", new StoreOwner());
        return "storeOwnerForm";
    }

    /**
     * Save storeOwner to database.
     *
     * @param storeOwner
     * @return
     */
    @RequestMapping(value = "storeOwner", method = RequestMethod.POST)
    public String saveStoreOwner(StoreOwner storeOwner) {
        storeOwnerService.saveStoreOwner(storeOwner);
        return "redirect:/storeOwner/" + storeOwner.getId();
    }

    /**
     * Delete storeOwner by its id.
     *
     * @param id
     * @return
     */
    @RequestMapping("storeOwner/delete/{id}")
    public String delete(@PathVariable Integer id) {
        storeOwnerService.deleteStoreOwner(id);
        return "redirect:/storeOwners";
    }
}
