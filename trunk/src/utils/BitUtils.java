package utils;

/**
 * 
 * 
 * @author kreich
 */
public class BitUtils {

	/**
	 * @param n The number to print.
	 * @return A String representation of the bits in the number.
	 */
	public static String toBitString(long n) {
		StringBuilder b = new StringBuilder();
		long mask = 0x8000000000000000L;
		for (int i = 0; i < Long.SIZE; i++) {
			b.append((n&mask) != 0 ? '1' : '0');
			mask >>>= 1;
		}
		return b.toString();
	}
	
	/**
	 * @param n The number whose bytes we want to flip.
	 * @return A long whose bits were flipped, turning 1->0 and 0->1.
	 */
	public static long flip(long n) {
		return n ^ ALL_ONES64;
	}
	
	/** A long with all 64 bits lit. */
	public static final long ALL_ONES64 = 0xffffffffffffffffL;
}