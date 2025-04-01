package com.scheduleapp.repository;
import com.scheduleapp.model.Kierunki;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface KierunkiRepository extends JpaRepository<Kierunki, Integer> {
    // Można dodać dodatkowe metody zapytań, np. findByNazwaKierunku
}
