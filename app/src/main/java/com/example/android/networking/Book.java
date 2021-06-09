package com.example.android.networking;

class Book {

    final String title;
    final String authors;
    final String pages;
    final String smallThumbnailLink;


    public Book(
            String title,
            String authors,
            String pages,
            String smallThumbnailLink
    ) {

        this.title = title;
        this.authors = authors;
        this.pages = pages;
        this.smallThumbnailLink = smallThumbnailLink;

    }

}
