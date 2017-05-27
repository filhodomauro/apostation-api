package br.com.apostation

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication

@SpringBootApplication
class ApostationApiApplication

fun main(args: Array<String>) {
    SpringApplication.run(ApostationApiApplication::class.java, *args)
}
