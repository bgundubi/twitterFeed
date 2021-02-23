import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

/**
 * Created by IntelliJ IDEA.
 * User: bgundubi
 * Date: 2/23/21
 * Time: 11:17 AM
 * To change this template use File | Settings | File and Code Templates.
 */

public class TwitterFeed {

    public Set<String> getTopNHashtags(ArrayList<String> tweetList, Integer topN) {

        Pattern hashPattern = Pattern.compile("#(\\S+)");
        Map<String, Integer> hashTagsMap = new HashMap();

        for (String tweet : tweetList) {

            Matcher matcher = hashPattern.matcher(tweet);
            while (matcher.find()) {

                String key = matcher.group(1);
                if (hashTagsMap.containsKey(key)) {
                    int val = hashTagsMap.get(key);
                    hashTagsMap.put(key, ++val);
                } else {
                    hashTagsMap.put(key, 1);
                }
            }
        }

        LinkedHashMap<String, Integer> sortedMap = hashTagsMap.entrySet()
                .stream()
                .sorted(Map.Entry.<String, Integer>comparingByValue().reversed())
                .limit(topN)
                .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (e1, e2) -> e1, LinkedHashMap::new));

        return sortedMap.keySet();

    }

}
