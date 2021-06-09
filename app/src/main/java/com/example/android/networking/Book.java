package com.example.android.networking;

class Book {

    final String title;
    final String authors;
    final String publishedDate;
    final int pageCount;
    final String smallThumbnailLink;


    public Book(
            String title,
            String authors,
            String publishedDate,
            int pageCount,
            String smallThumbnailLink
    ) {

        this.title = title;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.pageCount = pageCount;
        this.smallThumbnailLink = smallThumbnailLink;

    }

}
