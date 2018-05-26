package se.mikka.oauth2.springbootresourceserveroauth2.controller;

import javax.annotation.Generated;

public class User {
	
	private String name;
	private String position;
	private String company;
	private String url;
	private String bio;

	@Generated("SparkTools")
	private User(Builder builder) {
		this.name = builder.name;
		this.position = builder.position;
		this.company = builder.company;
		this.url = builder.url;
		this.bio = builder.bio;
	}
	
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
	
	/**
	 * Creates builder to build {@link User}.
	 * @return created builder
	 */
	@Generated("SparkTools")
	public static Builder builder() {
		return new Builder();
	}

	/**
	 * Builder to build {@link User}.
	 */
	@Generated("SparkTools")
	public static final class Builder {
		private String name;
		private String position;
		private String company;
		private String url;
		private String bio;

		private Builder() {
		}

		public Builder withName(String name) {
			this.name = name;
			return this;
		}

		public Builder withPosition(String position) {
			this.position = position;
			return this;
		}

		public Builder withCompany(String company) {
			this.company = company;
			return this;
		}

		public Builder withUrl(String url) {
			this.url = url;
			return this;
		}

		public Builder withBio(String bio) {
			this.bio = bio;
			return this;
		}

		public User build() {
			return new User(this);
		}
	}
	
}
