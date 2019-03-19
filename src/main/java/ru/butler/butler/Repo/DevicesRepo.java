package ru.butler.butler.Repo;

import org.springframework.data.repository.CrudRepository;
import ru.butler.butler.Model.Devices;

public interface DevicesRepo extends CrudRepository<Devices, Integer> {
}
