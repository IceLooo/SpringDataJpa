package kz.zhanayev.springcourse.repositories;

import kz.zhanayev.springcourse.models.Item;
import kz.zhanayev.springcourse.models.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ItemsRepository extends JpaRepository<Item, Integer> {

    List<Item> findByItemName(String itemName);

    List<Item> findByOwner(Person owner);

}
