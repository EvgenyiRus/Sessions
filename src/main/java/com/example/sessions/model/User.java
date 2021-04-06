package com.example.sessions.model;

import lombok.*;
import org.springframework.data.jpa.domain.AbstractPersistable;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true, exclude = "password") //exclude password - исключить из вывода password
public class User extends AbstractPersistable<Long> { //AbstractPersistable<Long> для генерации PK ключа
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    Long id;

    @Column(name = "login")
    @Size(max = 100)
    @NotBlank
    private String login;

    @Column(name = "password")
    @Size(max = 20)
    @NotBlank
    @ToString.Exclude
    private String password;

    @Enumerated(EnumType.STRING) //добавить Enum в Entity
    @CollectionTable(name = "user_roles", joinColumns = @JoinColumn(name = "user_id"))
    @Column(name = "role")
    @ElementCollection(fetch = FetchType.EAGER)
    private Set<Role> roles;
}
