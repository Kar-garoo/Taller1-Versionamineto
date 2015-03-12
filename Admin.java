public class Admin extends User{

	private int level;
	private double rating;
	private Forum [] moderate;

	public Admin(int level, double rating, Forum[] moderate, String name, String lastname, int age, String username, String password) {
        super(name, lastname, age, username, password);
        this.level = level;
        this.rating = rating;
        this.moderate = moderate;
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

    public Forum[] getModerate() {
        return moderate;
    }

    public void setModerate(Forum[] moderate) {
        this.moderate = moderate;
    }

}