public class Exercise2 {
    public static void main(String[] args) {
        String url = "https//www.reddit.com/r/nevertellmethebots";

        // Accidentally I got the wrong URL for a funny subreddit. It's probably "odds" and not "bots"
        // Also, the URL is missing a crutial component, find out what it is and insert it too!
        // Try to solve it more than once using different String functions!

        String goodurl = url.replace("bots", "odds");

        //goodurl = url.replace("https", "https:");

        String goodurl1 = goodurl.substring(0,5);
        String goodurl2 = goodurl.substring(5);
        goodurl = goodurl1 + ":" + goodurl2;

        System.out.println(goodurl1);
        System.out.println(goodurl2 + "\n");

        System.out.println("original: " + url);
        System.out.println("rectified: " + goodurl);
    }
}