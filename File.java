public class File{
	
	private String fileType;
    private Byte[] content;
    private double size;

    public File(String fileType, Byte[] content, double size) {
        this.fileType = fileType;
        this.content = content;
        this.size = size;
    }
    
    public File download (){
        return null;
        
    }
    
    public void share (){
        
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public Byte[] getContent() {
        return content;
    }

    public void setContent(Byte[] content) {
        this.content = content;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}