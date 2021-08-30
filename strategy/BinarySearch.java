import java.util.Collections;
import java.util.ArrayList;
//https://stackabuse.com/binary-search-in-java/,
//used as reference for development of binary search.
public class BinarySearch implements SearchBehavior {
    public boolean contains(ArrayList<String> data, String item){
        Collections.sort(data);
        int n = 0;
        int t = data.size()-1;
        while (n<=t){
        int middle = n+(t-n)/2;
        if (data.get(middle).equals(item))
                return true;
        if (data.get(middle).compareTo(item)<0)
                n = middle + 1;
                    else   
                t = middle - 1;
        }
        return false;
    }
}
