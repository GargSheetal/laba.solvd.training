/**
 * 
 */
package com.mytravelagencyV4;

import java.util.HashSet;
import java.util.Set;

import com.travelagency.customexceptions.MissingInputException;

/**
 * @author sheetal
 *
 */
public interface IReservation {

	void confirmReservation() throws MissingInputException;
	void cancelReservation();
	String getReservationId();
	String toString();
	Customer getCustomer();

}
