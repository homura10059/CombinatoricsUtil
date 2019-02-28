import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class implements Combinatorics on java.<BR>
 * Permutation and Combination are a part of Combinatorics.
 *
 * @param <T> target class for Combinatorics.
 */
public class CombinatoricsUtil<T> implements Combinatorics<T>{

        /**
         * {@inheritDoc}.
         */
        public List<List<T>> combination(List<T> objects, int r) {
                int n = objects.size();
                if(n < r){
                        throw new IllegalArgumentException("r should be smaller than objects.size()");
                }

                return getCombinationFrom(objects, 0, r);
        }

        /**
         * get combination from objects.
         * @param objects all item
         * @param index start index
         * @param r number of choice
         * @return all combination in objects from start index
         */
        private List<List<T>> getCombinationFrom(List<T> objects, int index, int r){
                int n = objects.size();

                List<List<T>> result = new ArrayList<>();
                if (r==1){
                        for (int i = index; i <= n-r; i++) {
                                result.add(Collections.singletonList(objects.get(i)));
                        }
                }else{
                         for (int i = index; i <= n-r; i++) {
                                 T object = objects.get(i);
                                List<List<T>> tmp = getCombinationFrom(objects, i+1, r-1);
                                tmp.forEach(x -> result.add(join(object, x)));
                        }
                }
                return result;
        }

        /**
         * join object to head of list.
         * @param first first object
         * @param other other item list
         * @return joined list
         */
        private List<T> join(T first, List<T> other){
                List<T> joined = new ArrayList<>();
                joined.add(first);
                joined.addAll(other);
                return joined;
        }


}
