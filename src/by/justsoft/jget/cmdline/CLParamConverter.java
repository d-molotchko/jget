package by.justsoft.jget.cmdline;

/**
 * Interface for String-to-T converting.
 * @author mda
 *
 * @param <T> 
 */
public interface CLParamConverter<T> {
	/**
	 * Converts String into T 
	 * @param value String for converting
	 * @return T
	 * @throws CLArgumentException if fails
	 */
	public T convert(String value) throws CLArgumentException;
}
