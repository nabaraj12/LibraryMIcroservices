package com.example.Books;




import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.example.Books.Book;

import java.util.List;
import java.util.Optional;

@Repository
public interface BooksRepository extends JpaRepository<Book,Integer> {

    @Query(value = "select * from book where name= :name",nativeQuery = true)
    List<Book> findByName(@Param("name") String name);

}
