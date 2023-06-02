package wecare.care.Repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import wecare.care.Modal.Pessoa;


public interface extendRepository  extends JpaRepository <Pessoa,Long > {
}
