package com.jcayllahua.giancarlowebcopy.api.iam.domain.model.entities;

import com.jcayllahua.giancarlowebcopy.api.iam.domain.model.valueobjects.Roles;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@With
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
    private Long id;

    @Enumerated(jakarta.persistence.EnumType.STRING)
    @Column(length = 20)
    private Roles name;

    public Role(Roles name) {
        this.name = name;
    }
    public static Role getDefaultRole(){
        return new Role(Roles.ROLE_USER);
    }
    public String getStringName(){
        return name.name();
    }
    public static Role toRoleFromName(String name){
        return new Role(Roles.valueOf(name));
    }

    public static List<Role> validateRoleSet(List<Role> roles) {
        if (roles.isEmpty())
            return List.of(getDefaultRole());

        return roles;
    }


}
