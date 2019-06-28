package com.sahan.graphql.springbootgraphql.repository;

import com.sahan.graphql.springbootgraphql.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, String> {
}
