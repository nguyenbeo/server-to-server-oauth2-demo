package se.mikka.oauth2.springbootclientoauth2;

public class User {
	
	private String name;
	private String position;
	private String company;
	private String url;
	private String bio;

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", position=" + position + ", company=" + company + ", url=" + url + ", bio="
				+ bio + "]";
	}
	
}
