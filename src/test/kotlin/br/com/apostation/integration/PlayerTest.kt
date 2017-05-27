package br.com.apostation.integration

import org.junit.Test
import org.junit.runner.RunWith
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.test.context.junit4.SpringRunner
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*
import org.springframework.test.web.servlet.result.MockMvcResultMatchers.*

/**
 * Created by maurofilho on 26/05/17.
 */
@RunWith(SpringRunner::class)
@SpringBootTest
@AutoConfigureMockMvc
class PlayerTest {

    @Autowired
    lateinit var mockMvc:MockMvc

    @Test
    fun testThatPlayersAreListed() {
        this.mockMvc
            .perform(
                get("/players")
                    .contentType(MediaType.APPLICATION_JSON)
            )
            .andExpect(status().isOk)
    }

    @Test
    fun testThatPlayerIsCreated() {
        this.mockMvc
            .perform(
                post("/players")
                    .contentType(MediaType.APPLICATION_JSON)
                    .content("{\"name\":\"mauro\"}"))
            .andExpect(status().isCreated)
    }
}
