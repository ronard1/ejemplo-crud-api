package api.ron.domain.repository;

import api.ron.domain.model.Compra;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CompraRepository extends JpaRepository<Compra, Long> {
    //boolean existsByAccountNumber(String accountNumber);
}
