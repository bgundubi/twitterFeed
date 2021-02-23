import java.util.ArrayList;

/**
 * Created by IntelliJ IDEA.
 * User: bgundubi
 * Date: 2/23/21
 * Time: 3:33 PM
 * To change this template use File | Settings | File and Code Templates.
 */

public class TwitterFeedTest {

    public static void main(String[] args) {

        TwitterFeed twitterFeed = new TwitterFeed();


        ArrayList<String> tweets =  new ArrayList<>();

        tweets.add("When \u2066\n" +
                "@sachin_rt\n" +
                "\u2069 got down his car to play gully cricket with fans! #SachinTendulkar #Sachin #Cricket");
        tweets.add("Wish you very very happy birthday domestic #sachin and also memers of the year \n" +
                "@WasimJaffer14");
        tweets.add("Rahul Dravid & Kiccha Sudeep at the Inauguration of BGS Cricket Ground. \n" +
                "\n" +
                "#Dravid #KicchaSudeep \n" +
                "@KicchaSudeep\n" +
                " #RahulDravid \n" +
                "#VikrantRona");
        tweets.add("Worlds best cricketer are #yuvraj and #Smith");
        tweets.add("Worlds best cricketer are #yuvraj and #Kholi");
        tweets.add( "Throwback to when #ViratKohli accepted for the first time in public that he likes #AnushkaSharma.");
        tweets.add("Would like to see people appreciating #ViratKohli captaincy in this match.");
        tweets.add("Virat Kohli Portrait in Hall of Fame \n" +
                "in Motera (World's Biggest Cricket Staidum) ");
        tweets.add("With Flag of India Indian flag on the background our indian captain look stunning in this still Fire\n" +
                "\n" +
                "#ViratKohli - Wallpaper series");
        tweets.add( "Azharuddeen stated that once he was bagged by the RCB, he had received a text message from an unknown number welcoming him to the RCB squad. Well, it turned out to be #ViratKohli #IPL2021");

        tweets.add("Tough to stop the juggernaut, predict an India win in 3rd Test,\" reckons \n" +
                "@MichaelVaughan\n" +
                " in his preview for the Pink Ball Test, on #CricbuzzChatter with \n" +
                "@bhogleharsha\n" +
                "\n" +
                "\n" +
                "#INDvENG #ViratKohli #JoeRoot");

        twitterFeed.getTopNHashtags(tweets,10).stream().forEach(System.out::println);
    }
}
