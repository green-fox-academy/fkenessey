import java.util.ArrayList;
import java.util.List;

public class Blog {
  List<BlogPost> daSite;

  public Blog() {
    this.daSite = new ArrayList<>();
  }

  public void addBlog(int i, BlogPost input) {
    this.daSite.add(i, input);
  }

  public void removeBlog(int i) {
    this.daSite.remove(i);
  }

  public void updateBlog(int i, BlogPost input) {
    daSite.add(i,input);
    daSite.remove(i+1);
  }
}
