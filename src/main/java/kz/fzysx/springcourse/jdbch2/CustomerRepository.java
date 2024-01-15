package kz.fzysx.springcourse.jdbch2;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByFirstName(String firstName);

    List<Customer> findByFirstNameOrderByLastName(String firstname);

    Customer findByFirstNameAndLastName(String firstName, String lastName);

    Customer findFirstByLastName(String lastName);

}
