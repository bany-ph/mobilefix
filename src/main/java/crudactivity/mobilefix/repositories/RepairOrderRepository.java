package crudactivity.mobilefix.repositories;

import crudactivity.mobilefix.entities.RepairOrder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RepairOrderRepository extends JpaRepository<RepairOrder,Long> {
}
