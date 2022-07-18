package com.example.hospitaltracer;

public class Review {

    String reviewId;
    String reviewMessage;

    public Review(){}

    public Review(String reviewId, String reviewMessage) {
        this.reviewId = reviewId;
        this.reviewMessage = reviewMessage;
    }

    public String getReviewId() {

        return reviewId;
    }

    public String getReviewMessage() {

        return reviewMessage;
    }

}