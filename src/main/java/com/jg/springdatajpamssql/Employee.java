package com.jg.springdatajpamssql;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Entity
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "employees")
public class Employee {

    @Id
    @Builder.Default
    private UUID id = UUID.randomUUID();

    @NonNull
    private String firstName;

    @NonNull
    private String lastName;

}
