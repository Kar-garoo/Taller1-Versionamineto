public class Admin extends User{

	private int level;
	private double rating;

 	public Admin(String name, String lastname, int age, String username, String password, int level, double rating) {
        super(name, lastname, age, username, password);
        this.level = level;
        this.rating = rating;
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }

    public double getRating() {
        return rating;
    }

    public void setRating(double rating) {
        this.rating = rating;
    }

}