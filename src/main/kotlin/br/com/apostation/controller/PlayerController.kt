package br.com.apostation.controller

import br.com.apostation.domain.Player
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*

/**
 * Created by maurofilho on 26/05/17.
 */
@RestController
class PlayerController {

    @PostMapping(value = "/players")
    fun save(@RequestBody player: Player): ResponseEntity<Player> {
        return ResponseEntity(player, HttpStatus.CREATED)
    }

    @GetMapping(value = "/players")
    fun list() : ResponseEntity<List<Player>> {
        val players = arrayListOf(Player("mauro"), Player("filho"))
        return ResponseEntity(players, HttpStatus.OK)
    }
}
