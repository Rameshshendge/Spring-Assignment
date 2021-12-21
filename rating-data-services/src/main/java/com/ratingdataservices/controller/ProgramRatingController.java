package com.ratingdataservices.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ratingdataservices.model.Rating;
import com.ratingdataservices.model.UserRating;

@RestController
@RequestMapping("/rating")
public class ProgramRatingController 
{
	@RequestMapping("/{programId}")
	public Rating getProgramRating(@PathVariable("programId") String programId)
	{
		return new Rating(programId,5);
	}
	
	@RequestMapping("users/{programId}")
	public UserRating getUserRating(@PathVariable("programId") String programId)
	{
		List<Rating> ratings = Arrays.asList(
				new Rating("1234",5),
				new Rating("1432",4)
		);
		UserRating userRating = new UserRating();
		userRating.setUserRating(ratings);
		return userRating;	
    	}

}
