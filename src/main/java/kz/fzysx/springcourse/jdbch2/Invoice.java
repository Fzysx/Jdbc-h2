package kz.fzysx.springcourse.jdbch2;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import jakarta.persistence.Id;

import java.util.Date;

@Data
@Builder
@AllArgsConstructor
@Entity
@Table(name = "invoice")
public class Invoice {
    @GeneratedValue(strategy = GenerationType.AUTO)
    private @Id Long invoiceId;
    private Date invoiceDate;


}
