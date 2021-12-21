package com.ratingdataservices.model;

public class Rating 
{
	private String programId;
	private int rating;
	public String getProgramId() {
		return programId;
	}
	public void setProgramId(String programId) {
		this.programId = programId;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Rating(String programId, int rating) {
		super();
		this.programId = programId;
		this.rating = rating;
	}
	

}
