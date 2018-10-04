package br.com.aviebrantz.aicandydispenser

import org.junit.Assert.*
import org.junit.*

class LabelManagerTest {

    @Test
    fun `raffleLabel() returns "THING" when "THING" is the only label in the list`() {
        val labelManager = LabelManager(listOf("THING"))
        assertEquals("THING", labelManager.raffleLabel())
    }

    @Test
    fun `raffleLabel() alternates between two labels when the list contains exactly two`() {
        val labelManager = LabelManager(listOf("THING 1", "THING 2"))
        val firstLabel = labelManager.raffleLabel()
        var expectedLabel = ""
        if (firstLabel == "THING 1") {
            expectedLabel = "THING 2" 
        } else {
            expectedLabel = "THING 1"
        }
        assertEquals(expectedLabel, labelManager.raffleLabel())
    }
}