package com.app.pharma.services;
import com.app.pharma.entities.StoreOwner;

public interface IStoreOwnerService {
    Iterable<StoreOwner> listAllStoreOwner();

    StoreOwner getStoreOwnerById(Integer id);

    StoreOwner saveStoreOwner(StoreOwner storeOwner);

    void deleteStoreOwner(Integer id);
}
