package lk.sanchana_bag_shop.asset.user_management.user.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lk.sanchana_bag_shop.asset.common_asset.model.enums.LiveDead;
import lk.sanchana_bag_shop.asset.employee.entity.Employee;
import lk.sanchana_bag_shop.asset.user_management.role.entity.Role;
import lk.sanchana_bag_shop.asset.user_management.user_session_log.entity.UserSessionLog;
import lk.sanchana_bag_shop.util.audit.AuditEntity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(value = "createdDate", allowGetters = true)
public class User extends AuditEntity {

    @OneToOne
    private Employee employee;

    @Column(nullable = false,unique = true)
    @Size(min = 5, message = "user name should include at least five characters")
    private String username;

    @Column(nullable = false)
    @Size(min = 4, message = "password should include four characters or symbols")
    private String password;

    @Column(nullable = false)
    private boolean enabled;

    @Enumerated(EnumType.STRING)
    private LiveDead liveDead;

    @OneToMany(mappedBy = "user",fetch = FetchType.EAGER)
    private List<UserSessionLog> userSessionLogs;

    @ManyToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
    @Fetch( FetchMode.SUBSELECT)
    @JoinTable(name = "user_role",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "role_id"))
    private List<Role> roles;

}
