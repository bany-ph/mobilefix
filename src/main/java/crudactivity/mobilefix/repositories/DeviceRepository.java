package crudactivity.mobilefix.repositories;

import crudactivity.mobilefix.entities.Device;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DeviceRepository extends JpaRepository<Device,Long> {
}
