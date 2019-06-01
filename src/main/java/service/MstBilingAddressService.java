package service;

import java.util.List;

import dto.MstBilingAddressDto;


public interface MstBilingAddressService {

	public List<MstBilingAddressDto> findAllDeletedFalse();
	public void save(MstBilingAddressDto mstBilingAddressDto);
	public void update(MstBilingAddressDto mstBilingAddressDto);
	public void delete(MstBilingAddressDto mstBilingAddressDto);
	public void deleteBilingAddressDetail(String noID);
	public MstBilingAddressDto findByNoNota(String noID);
}
