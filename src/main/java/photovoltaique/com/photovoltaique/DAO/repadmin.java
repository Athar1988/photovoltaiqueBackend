package photovoltaique.com.photovoltaique.DAO;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;
import photovoltaique.com.photovoltaique.Entity.admin;


@CrossOrigin("*")
@RepositoryRestResource
public interface repadmin extends JpaRepository<admin,Long> {

}