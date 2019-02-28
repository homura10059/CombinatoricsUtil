import java.util.List;

/**
 * This is interface of Combinatorics on java.<BR>
 * Permutation and Combination are a part of Combinatorics.
 *
 * @param <T> target class for Combinatorics.
 */
public interface Combinatorics<T> {

        /**
         * Combination.<BR>
         * nCr -> factorial(n) / (factorial(r) * factorial(n-r)).<BR>
         *
         * This class return all combination in list.
         * @param objects all items
         * @param r number of choice
         * @return all combination in objects
         */
        List<List<T>> combination(List<T> objects, int r);
}
