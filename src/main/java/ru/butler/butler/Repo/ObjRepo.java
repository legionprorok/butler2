package ru.butler.butler.Repo;

import org.springframework.data.repository.CrudRepository;
import ru.butler.butler.Model.Obj;

public interface ObjRepo extends CrudRepository<Obj, Integer> {
}
