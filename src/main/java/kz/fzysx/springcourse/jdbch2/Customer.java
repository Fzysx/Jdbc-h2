package kz.fzysx.springcourse.jdbch2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.Id;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.MappedCollection;

import java.util.Set;

@Data
@Builder
@AllArgsConstructor
@Entity
@NoArgsConstructor
@Table(name = "customer")
public class Customer {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Id Long customerId;
    private String firstName;
    private String lastName;
    private String email;
}
