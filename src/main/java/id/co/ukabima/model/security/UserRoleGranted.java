package id.co.ukabima.model.security;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "user_roles_apply", schema = "security")
public class UserRoleGranted {

    @Id
    @GenericGenerator(name = "gen_user_role", strategy = "uuid2")
    @GeneratedValue(generator = "gen_user_role")
    private String id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "role_id", nullable = false)
    private Role role;
}
