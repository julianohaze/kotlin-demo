package br.com.kotlindemo.demo.model

import javax.persistence.*

@Entity
@Table(name = "users")
public class User(val name: String = "",
                  val email: String = "",
                  @Id
                  @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "users_sequence")
                  @SequenceGenerator(name = "users_sequence", sequenceName = "users_sequence")
                  val id: Long = 0) {
}