package crudactivity.mobilefix.repositories;

import crudactivity.mobilefix.entities.RepairOrder;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepairOrderRepository extends JpaRepository<RepairOrder,Long> {
}
