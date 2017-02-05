package chapter5.spittr.data;

import java.util.List;

public interface SpittleRepository {

	/**
	 * 
	 * @param max
	 *            spittle ID that represents the maximum ID of any Spittle that should be returned
	 * @param count
	 *            determines how many Spittle objects to return
	 * @return
	 */
	List<Spittle> findSpittles(long max, int count);
	
	Spittle findOne(long spittleId);
}
