package cours.iir4.livraison.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cours.iir4.livraison.model.Client;
@Repository
public interface ClientRepository extends JpaRepository<Client ,Long > {

}
