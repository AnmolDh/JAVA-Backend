package com.springmessaging.repositories;

import com.springmessaging.entities.Greeting;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IGreetingRepository extends JpaRepository<Greeting, Long> {
}
