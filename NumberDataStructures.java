import java.util.Map;
import java.util.TreeMap;
import java.util.stream.IntStream;

public class NumberDataStructures {
;

    public static void main(){

        //Sorting Banking Account
        final String[] dataS = { "6", "03 10103538 2222 1233 6160 0142", "03 10103538 2222 1233 6160 0141",
                "30 10103538 2222 1233 6160 0141", "30 10103538 2222 1233 6160 0142", "30 10103538 2222 1233 6160 0141",
                "30 10103538 2222 1233 6160 0142", "5", "30 10103538 2222 1233 6160 0144",
                "30 10103538 2222 1233 6160 0142", "30 10103538 2222 1233 6160 0145", "30 10103538 2222 1233 6160 0146",
                "30 10103538 2222 1233 6160 0143" };
            getSortedBankingAccount(dataS);
    }

    // Sorting Banking Account inputArrayString:ias
    static void getSortedBankingAccount(final String[] ias) {

        final Map<String, Integer> mapa = new TreeMap<String, Integer>();

        IntStream.range(0, ias.length).filter(s->String.valueOf(ias[s]).length()>=26).forEach(s->{
            // each element of stream not exist in Map as key no repeatable
            if(!mapa.containsKey(ias[s])) mapa.put(ias[s],0);
            // each Stream element as Key and value increment plus 1
            mapa.put(ias[s],mapa.get(ias[s])+1);
        });
        //finally, for each key and value of TreeMap i show the ouput result.
        mapa.forEach((key,value)->System.out.println(key+" "+value));
    }

}