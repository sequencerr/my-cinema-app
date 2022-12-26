package cinema.service;

import cinema.model.Role;
import java.util.Optional;

public interface RoleService {
    Role add(Role role);

    Optional<Role> findByName(String name);
}
