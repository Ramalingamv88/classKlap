/**
 * 
 */
package io.classKlap.parkinglot.model.strategy;

/**
 * @author Ramalingam
 *
 */
public interface ParkingStrategy
{
	public void add(int i);
	
	public int getSlot();
	
	public void removeSlot(int slot);
}
