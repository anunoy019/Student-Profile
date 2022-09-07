package anunoy.Student_Profile;

public enum StudentType {
	
	FULL_TIME ("full-time"),
	PART_TIME ("part-time");
	
	private String type;

	StudentType(String type) {
		this.type = type;
	}
	
	public String gettype() {
		return type;
	}
	
	
	
	

}
