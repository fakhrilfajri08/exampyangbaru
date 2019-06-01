package dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import entity.MstBilingAddress;
import entity.pk.MstBilingAddressPk;


public interface MstBilingAddressDao extends JpaRepository<MstBilingAddress, MstBilingAddressPk>{
	
	@Query(value="SELECT p FROM Mst_BilingAddress p WHERE p.deleted = false")
	public List<MstBilingAddress> findAllDeletedFalse();
	
//	@Query(value="SELECT p FROM TrOrderHeader p WHERE p.noNota = :noNota")
//	public TrOrderHeader findByNoNota(@Param("noNota") String noNota);

}
