package br.com.cep.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.cep.model.Cep;

import java.util.List;

@Repository
public interface CepRepository extends JpaRepository<Cep, String> {
	
	public Cep findByCep(String cep);
	
	@Query("SELECT cp FROM Cep cp INNER JOIN FETCH cp.cidade cid  WHERE (cid.ibge = :ibge) AND (:uf IS NULL OR cid.uf = :uf)")
	public List<Cep> findByIbgeAndUf(@Param("ibge") String ibge, @Param("uf") String uf);
}