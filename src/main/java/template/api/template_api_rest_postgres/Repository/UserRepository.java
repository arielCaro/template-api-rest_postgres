package template.api.template_api_rest_postgres.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import template.api.template_api_rest_postgres.Entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
