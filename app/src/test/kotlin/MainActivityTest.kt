package br.com.aviebrantz.aicandydispenser

import org.junit.Assert.*
import org.junit.*

class MainActivityTest {

    @Test
    fun `raffleLabel() returns "THING" when "THING" is the only label in the list`() {
        val mainActivity = MainActivity()
        assertEquals("THING", mainActivity.raffleLabel2(listOf("THING"), "NOTHING"))
    }

    @Test
    fun `raffleLabel() alternates between two labels when the list contains exactly two`() {
        val mainActivity = MainActivity()
        assertEquals("THING 1", mainActivity.raffleLabel2(listOf("THING 1", "THING 2"), "THING 2"))
        assertEquals("THING 2", mainActivity.raffleLabel2(listOf("THING 1", "THING 2"), "THING 1"))
        assertEquals("THING 1", mainActivity.raffleLabel2(listOf("THING 1", "THING 2"), "THING 2"))
        assertEquals("THING 2", mainActivity.raffleLabel2(listOf("THING 1", "THING 2"), "THING 1"))
    }
}