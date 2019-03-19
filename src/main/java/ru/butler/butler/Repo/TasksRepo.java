package ru.butler.butler.Repo;

import org.springframework.data.repository.CrudRepository;
import ru.butler.butler.Model.Tasks;

public interface TasksRepo extends CrudRepository<Tasks, Integer> {
}
