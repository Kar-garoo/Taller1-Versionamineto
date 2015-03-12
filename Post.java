import java.io.File;
import java.util.Date;


public class Post {

	private String topic;
	private Date date;
	private Date lastUpDate;
	private boolean isAllowed;
	private File[] files;
		
	
	public Post(String topic, Date date, Date lastUpDate, boolean isAllowed,
			File[] files) {

		this.topic = topic;
		this.date = date;
		this.lastUpDate = lastUpDate;
		this.isAllowed = isAllowed;
		this.files = files;
	}
	
	public String comment(){
		
		return null;
	}
	
	public int rate(){
		
		return 0;
	}
	
	public void share(){
		
		
	}
	
	
	
	
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public Date getLastUpDate() {
		return lastUpDate;
	}
	public void setLastUpDate(Date lastUpDate) {
		this.lastUpDate = lastUpDate;
	}
	public boolean isAllowed() {
		return isAllowed;
	}
	public void setAllowed(boolean isAllowed) {
		this.isAllowed = isAllowed;
	}
	public File[] getFiles() {
		return files;
	}
	public void setFiles(File[] files) {
		this.files = files;
	}
	
	
}
