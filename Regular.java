public class Regular extends User{
    private int postViews;
    private int strikesNumber;
    private int starsNumber;
    
    private Post[] posts;
    
    public Regular(String name, String lastname, int age, String username, String password, int postViews, int strikesNumber,int starsNumber,Post[] posts) {
        super(name, lastname, age, username, password);
        this.postViews = postViews;
        this.strikesNumber = strikesNumber;
        this.starsNumber = starsNumber;
        this.posts = posts;
    }
    public void setPostViews(int postViews) {
        this.postViews = postViews;
    }

    public int getPostViews() {
        return postViews;
    }

   public void setStrikesNumber(int strikesNumber) {
        this.strikesNumber = strikesNumber;
    }

    public int getStrikesNumber() {
        return strikesNumber;
    }
    public void setStarsNumber(int starsNumber) {
        this.starsNumber = starsNumber;
    }

    public int getStarsNumber() {
        return starsNumber;
    }
    public void setPosts(Post[] posts) {
        this.posts = posts;
    }

    public Post[] getPosts() {
        return posts;
    }
	
	
}