package lk.sanchana.bagShop.asset.userManagement.entity;



import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
<<<<<<< HEAD
import com.sun.istack.NotNull;

=======


import lk.sanchana.bagShop.asset.employee.entity.Employee;
import lk.sanchana.bagShop.util.audit.AuditEntity;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.Size;
<<<<<<< HEAD
import java.util.*;
=======
import java.util.List;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = "createdDate", allowGetters = true)
public class User extends AuditEntity {

    @OneToOne
    @NotNull
    private Employee employee;

    @Column(nullable = false,unique = true)
    @Size(min = 5, message = "user name should include at least five characters")
    private String username;

    @Column(nullable = false)
    @Size(min = 4, message = "password should include four characters or symbols")
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<UserSessionLog> userSessionLogs;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @Fetch( FetchMode.SUBSELECT)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

    /*@ManyToMany(fetch = FetchType.EAGER)
    //@Fetch( FetchMode.SUBSELECT)
    @JoinTable(name = "user_working_place",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "working_place_id"))
    private Set< WorkingPlace > workingPlaces;*/

}
