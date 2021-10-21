package io.mosip.authentication.core.spi.id.service;

import java.util.List;
import java.util.Map;
import io.mosip.authentication.core.exception.IdAuthenticationBusinessException;

/**
 * The Interface IdAuthService.
 *
 * @author Arun Bose
 * @param <T> the generic type
 */

public interface IdService<T> {

	/**
	 * validates the UIN.
	 *
	 * @param uin the uin
	 * @param isBio the is bio
	 * @return the id repo by uin number
	 * @throws IdAuthenticationBusinessException the id authentication business
	 *                                           exception
	 */
	Map<String, Object> getIdByUin(String uin, boolean isBio, List<String> bioFilterAttributes) throws IdAuthenticationBusinessException;

	/**
	 * validates the VID.
	 *
	 * @param vid the vid
	 * @param isBio the is bio
	 * @return the id repo by vid number
	 * @throws IdAuthenticationBusinessException the id authentication business
	 *                                           exception
	 */
	Map<String, Object> getIdByVid(String vid, boolean isBio, List<String> bioFilterAttributes) throws IdAuthenticationBusinessException;

	/**
	 * Process id type.
	 *
	 * @param idvIdType the idv id type
	 * @param idvId the idv id
	 * @param isBio the is bio
	 * @param markVidConsumed the flag to mark VID consumed
	 * @return the map
	 * @throws IdAuthenticationBusinessException the id authentication business exception
	 */
	public Map<String, Object> processIdType(String idvIdType, String idvId, boolean isBio, boolean markVidConsumed, List<String> bioFilterAttributes)
			throws IdAuthenticationBusinessException;

	/**
	 * Store entry in Auth_txn table for all authentications.
	 *
	 * @param t the t
	 * @throws IdAuthenticationBusinessException the id authentication business
	 *                                           exception
	 */
	public void saveAutnTxn(T t) throws IdAuthenticationBusinessException;
	
	/**
	 * Gets the demo data.
	 *
	 * @param identity the identity
	 * @return the demo data
	 */
	Map<String, Object> getDemoData(Map<String, Object> identity);

	/**
	 * Gets the token .
	 *
	 * @param idResDTO the id res DTO
	 * @return the token
	 */
	String getToken(Map<String, Object> idResDTO);
	
}
