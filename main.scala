import twitter4j.TwitterFactory
import twitter4j.Twitter
import twitter4j.conf.ConfigurationBuilder

object main {
  def main(args : Array[String]) {

        // (1) config work to create a twitter object
        val cb = new ConfigurationBuilder
        cb.setDebugEnabled(true)
            .setOAuthConsumerKey("wIVFo0g77JTbSuMhk3iC4bHMZ")
            .setOAuthConsumerSecret("YqJIsiaGFIv5cC4Kq9KNfF75emWKivUFvXfgDYEzVoF3ZXm7ik")
            .setOAuthAccessToken("761585594413813760-AfZbuho7fO7yd8S1Z03F0jjNjZPJgZ9")
            .setOAuthAccessTokenSecret("iT1qlhvcPb4uI8Aes7LicPUKtyEG8bbcNURJIG1gB67ut")
        val tf = new TwitterFactory(cb.build)
        val twitter = tf.getInstance

        // (2) use the twitter object to get your friend's timeline
        val statuses = twitter.trends().getAvailableTrends
        
        println("Showing trends.")
        val it = statuses.iterator()
        while (it.hasNext()) {
            val status = it.next
            println(status.getName);
        }
    }

}