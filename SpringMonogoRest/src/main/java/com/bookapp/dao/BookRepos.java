package com.bookapp.dao;

 

import java.util.List;

 

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

 

import com.bookapp.model.Book;

 

@Repository
public interface BookRepos extends MongoRepository<Book,Integer>{
    
    List<Book> findByAuthor(String author);
    List<Book> findByCategoryOrderByTitleAsc(String category);
    List<Book> findByTitleAndAuthor(String title,String author);
    
    @Query("{'category': ?0,'price': {$eq: ?}}")
    List<Book> findBooksByTitleAndPrice(String title,Double price);
 
}
 