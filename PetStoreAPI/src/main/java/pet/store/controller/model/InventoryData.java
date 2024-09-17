package pet.store.controller.model;

import lombok.Data;
import lombok.NoArgsConstructor;
import pet.store.entity.Inventory;
import pet.store.entity.PetStore;
import pet.store.entity.Product;

@Data
@NoArgsConstructor
public class InventoryData {

    private Long inventoryId;
    private int quantity;
    private String locationInStore;
    private int reorderLevel;
    private Product product;
    private PetStore store;

    public InventoryData(Inventory inventory) {
        inventoryId = inventory.getInventoryId();
        quantity = inventory.getQuantity();
        locationInStore = inventory.getLocationInStore();
        reorderLevel = inventory.getReorderLevel();
        product = inventory.getProduct();
        store = inventory.getStore();
    }
}
