package lk.sanchana.bagShop.asset.userManagement.entity;
<<<<<<< HEAD
=======



import lk.sanchana.bagShop.asset.userManagement.entity.Enum.UserSessionLogStatus;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class UserSessionLog {
    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private Integer id;

    private int failureAttempts;

    @Column( updatable = false, nullable = false )
    private LocalDateTime createdAt;

    @Enumerated( EnumType.STRING )
    private UserSessionLogStatus userSessionLogStatus;

    @ManyToOne
    private User user;
}
