package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary implements LibraryDataBase {
    LibraryDataBase libraryDatabase;

    public BookLibrary(LibraryDataBase libraryDatabase)
    {
        this.libraryDatabase = libraryDatabase;
    }

    @Override
    public List<Book> listBooksWithCondition(String titleFragment) {
        List<Book> bookList = new ArrayList<Book>();
        if (titleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase
                .listBooksWithCondition(titleFragment);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList; }

    @Override
    public List<Book> listBooksInHandsOf(LibraryUser libraryUser) {
        List<Book> bookList = new ArrayList<Book>();
        if (libraryUser.getFirstname()=="Itil") return bookList;
        List<Book> resultList = libraryDatabase.listBooksInHandsOf(libraryUser);
        if (resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }

    @Override
    public boolean rentABook(LibraryUser libraryUser, Book book) {
        return false;
    }

    @Override
    public int returnBooks(LibraryUser libraryUser) {
        return 0;
    }
}