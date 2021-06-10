package com.example.android.networking;

class Book {

    final String title;
    final String authors;
    final String publishedDate;
    final String pageCount;
    final String averageRating;
    final String smallThumbnailLink;



    public Book(
            String title,
            String authors,
            String publishedDate,
            String pageCount,
            String averageRating,
            String smallThumbnailLink
    ) {

        this.title = title;
        this.authors = authors;
        this.publishedDate = publishedDate;
        this.pageCount = pageCount;
        this.averageRating = averageRating;
        this.smallThumbnailLink = smallThumbnailLink;

    }

}
