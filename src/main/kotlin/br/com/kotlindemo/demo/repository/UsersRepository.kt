package br.com.kotlindemo.demo.repository

import br.com.kotlindemo.demo.model.User
import org.springframework.data.jpa.repository.JpaRepository

interface UsersRepository : JpaRepository<User, Long> {
}