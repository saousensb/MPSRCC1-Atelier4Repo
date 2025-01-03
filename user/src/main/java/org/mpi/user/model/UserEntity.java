package org.mpi.user.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id; // Utiliser l'import correct pour JPA
import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Adjust the generation strategy as needed
    private Long id;

    private String userName;
    private String password;

    // Pas besoin de définir manuellement les getters et setters grâce à Lombok
}

