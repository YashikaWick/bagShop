package lk.sanchana.bagShop.asset.employee.entity;


import com.fasterxml.jackson.annotation.JsonFilter;
<<<<<<< HEAD
=======
import lk.sanchana.bagShop.asset.commonAsset.model.Enum.CivilStatus;
import lk.sanchana.bagShop.asset.commonAsset.model.Enum.Gender;
import lk.sanchana.bagShop.asset.commonAsset.model.Enum.Title;
import lk.sanchana.bagShop.asset.commonAsset.model.FileInfo;
import lk.sanchana.bagShop.asset.employee.entity.Enum.Designation;
import lk.sanchana.bagShop.asset.employee.entity.Enum.EmployeeStatus;
import lk.sanchana.bagShop.asset.message.entity.EmailMessage;
import lk.sanchana.bagShop.util.audit.AuditEntity;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.multipart.MultipartFile;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonFilter("Employee")
public class Employee extends AuditEntity {

    @Column(unique = true)
<<<<<<< HEAD
    private String payRoleNumber;
=======
    private String epf;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

    @Size(min = 5, message = "Your name cannot be accepted")
    private String name;

    @Size(min = 5, message = "At least 5 characters should be included calling name")
    private String callingName;

    @Size(max = 12, min = 10, message = "NIC number is contained numbers between 9 and X/V or 12 ")
    @Column(unique = true)
    private String nic;

<<<<<<< HEAD
    @Column(unique = true)
    private String departmentIdNumber;

=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    @Size(max = 10, message = "Mobile number length should be contained 10 and 9")
    private String mobileOne;

    private String mobileTwo;

    private String land;

    @Column(unique = true)
<<<<<<< HEAD
    private String email;

    @Column(unique = true)
=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private String officeEmail;

    @Column(columnDefinition = "VARCHAR(255) CHARACTER SET utf8 COLLATE utf8_bin NULL", length = 255)
    private String address;

    @Enumerated(EnumType.STRING)
    private Title title;

    @Enumerated(EnumType.STRING)
    private Gender gender;

    @Enumerated(EnumType.STRING)
<<<<<<< HEAD
    private BloodGroup bloodGroup;

    @Enumerated(EnumType.STRING)
=======
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b
    private Designation designation;

    @Enumerated(EnumType.STRING)
    private CivilStatus civilStatus;

    @Enumerated(EnumType.STRING)
    private EmployeeStatus employeeStatus;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfBirth;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private LocalDate dateOfAssignment;

<<<<<<< HEAD
    @ManyToOne
    private Branch branch;
=======
    @ManyToMany(mappedBy = "employees")
    private List<EmailMessage> emailMessages;
>>>>>>> 56d8cb4e848d36271016629645d45166b942a42b

    @Transient
    private List<MultipartFile> files = new ArrayList<>();

    @Transient
    private List<String> removeImages = new ArrayList<>();

    @Transient
    private List< FileInfo > fileInfos = new ArrayList<>();

}
