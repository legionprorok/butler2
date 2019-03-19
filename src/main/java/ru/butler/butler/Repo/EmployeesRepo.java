package ru.butler.butler.Repo;

import org.springframework.data.repository.CrudRepository;
import ru.butler.butler.Model.Employees;

public interface EmployeesRepo extends CrudRepository<Employees, Integer> {
}
