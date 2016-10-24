package tutorial;

import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepository extends CrudRepository<Employee, Long> {

	@PreAuthorize("hasAuthority('ROLE_ADMIN')")
  	@Override
  	void delete(Long aLong);

}