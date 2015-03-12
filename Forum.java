import java.util.Date;

public class Forum {
	private String name;
	private Date datecreated;
	private String category;
	private Post[] posts;
	
	
	
	
	public Forum(String name, Date datecreated, String category, Post[] posts) {
		this.name = name;
		this.datecreated = datecreated;
		this.category = category;
		this.posts = posts;
	}
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDatecreated() {
		return this.datecreated;
	}
	public void setDatecreated(Date datecreated) {
		this.datecreated = datecreated;
	}
	public String getCategory() {
		return this.category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public Post[] getPosts() {
		return this.posts;
	}
	public void setPosts(Post[] posts) {
		this.posts = posts;
	}
	
	
}
