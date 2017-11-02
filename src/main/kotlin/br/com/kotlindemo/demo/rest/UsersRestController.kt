package br.com.kotlindemo.demo.rest

import br.com.kotlindemo.demo.repository.UsersRepository
import br.com.kotlindemo.demo.model.User
import org.springframework.util.Assert
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/users")
class UsersRestController (val usersRepository: UsersRepository) {

    @GetMapping
    fun findAll(): List<User> {
        return usersRepository.findAll();
    }

    @PostMapping
    fun insert(@RequestBody user: User): User {
        return usersRepository.save(user);
    }

    @PutMapping
    fun update(@RequestBody user: User): User {
        Assert.notNull(user.id, "You must inform the user id")
        Assert.isTrue(user.id > 0L,  "User id must be greater than zero")

        Assert.notNull(usersRepository.findOne(user.id), "User with id " + user.id + " does not exist")

        return usersRepository.save(user);
    }

    @DeleteMapping("/{id}")
    fun delete(@PathVariable id: Long) : Unit {
        return usersRepository.delete(id);
    }
}


