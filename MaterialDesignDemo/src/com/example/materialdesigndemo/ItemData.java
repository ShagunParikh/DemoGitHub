package com.example.materialdesigndemo;

public class ItemData {
	 
	 
    private String title;
    public String getTitle() {
		return title;
	}

	public int getImageUrl() {
		return imageUrl;
	}

	private int imageUrl;
     
    public ItemData(String title,int imageUrl){
         
        this.title = title;
        this.imageUrl = imageUrl;
    }
    // getters & setters
}
