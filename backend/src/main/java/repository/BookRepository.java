package com.bookmind.backend.repository;

import com.bookmind.backend.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

    // LOGIC:
    // 1. Match Genre, Mood, Language
    // 2. Filter Time: Must be greater than (time - 30) AND less than (time + 30)
    // 3. Sort: Show the closest matches first

    @Query("""
SELECT b FROM Book b
WHERE LOWER(b.genre) = LOWER(:genre)
  AND LOWER(b.mood) = LOWER(:mood)
  AND LOWER(b.language) = LOWER(:language)
  AND b.estimatedMinutes BETWEEN
        ( CASE
              WHEN :time < 100 THEN 0
              WHEN :time < 200 THEN 100
              WHEN :time < 300 THEN 200
              WHEN :time < 400 THEN 300
              WHEN :time < 500 THEN 400
              ELSE 500
          END )
      AND
        ( CASE
              WHEN :time < 100 THEN 100
              WHEN :time < 200 THEN 200
              WHEN :time < 300 THEN 300
              WHEN :time < 400 THEN 400
              WHEN :time < 500 THEN 500
              ELSE 600
          END )
ORDER BY ABS(b.estimatedMinutes - :time) ASC
""")
    List<Book> findRecommendations(
            @Param("genre") String genre,
            @Param("mood") String mood,
            @Param("language") String language,
            @Param("time") int time
    );
}