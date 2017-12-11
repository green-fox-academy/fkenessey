public class Main {
  public static void main(String[] args) {

    BlogPost LoremIpsum = new BlogPost();
    LoremIpsum.authorName = "John Doe";
    LoremIpsum.title = "Lorem Ipsum";
    LoremIpsum.text = "Lorem ipsum dolor sit amet.";
    LoremIpsum.publicationDate = "2000.05.04.";

    BlogPost WaitButWhy = new BlogPost();
    WaitButWhy.authorName = "Tim Urban";
    WaitButWhy.title = "Wait but why";
    WaitButWhy.text = "A popular long-form, stick-figure-illustrated blog about almost everything.";
    WaitButWhy.publicationDate = "2010.10.10.";

    BlogPost OneEngineerIs = new BlogPost();
    OneEngineerIs.authorName = "William Turton";
    OneEngineerIs.title = "One Engineer Is Trying to Get IBM to Reckon With Trump";
    OneEngineerIs.text = "Daniel Hanley, a cybersecurity engineer at IBM, doesn’t want to be the center of attention. " +
            "When I asked to take his picture outside one of IBM’s New York City offices, he told me that he wasn’t " +
            "really into the whole organizer profile thing.";
    OneEngineerIs.publicationDate = "2017.03.28.";
  }
}
