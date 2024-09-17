package pet.store.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import pet.store.entity.Inventory;

public interface InventoryDao extends JpaRepository<Inventory, Long> {

}
