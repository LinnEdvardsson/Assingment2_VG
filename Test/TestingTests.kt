import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test


    class SantaTest {
        private val santasHelper = SantasHelpers()
        private val santasElfs = santasHelper.createMap()

        val uTomten = listOf("Glader", "Tröger", "Trötter", "Skummtomten", "Dammråttan", "Blyger", "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")
        val uGlader = listOf("Tröger", "Trötter", "Skummtomten", "Dammråttan", "Blyger");
        val uButter = listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen");
        val uTrötter = listOf("Skummtomten", "Dammråttan");
        val uSkumtomten = listOf("Dammråttan");
        val uRäven = listOf("Gråsuggan", "Myran", "Bladlusen");
        val uMyran = listOf("Bladlusen");

        @Test
        fun testGetUnderlingsForTomten() {
            val result = santasHelper.getUnderlings("Tomten", santasElfs = santasElfs)
            assertEquals(uTomten, result)
        }
        @Test
        fun testgetUnderlingsforGlader() {
            val result = santasHelper.getUnderlings("Glader", santasElfs = santasElfs)
            assertEquals(uGlader, result)
        }

        @Test
        fun testGetUnderlingsForButter() {
            val result = santasHelper.getUnderlings("Butter", santasElfs = santasElfs)
            assertEquals(uButter, result)
        }

        @Test
        fun testGetUnderlingsForTrotter() {
            val result = santasHelper.getUnderlings("Trötter", santasElfs = santasElfs)
            assertEquals(uTrötter, result)
        }

        @Test
        fun testGetUnderlingsForSkummtomten() {
            val result = santasHelper.getUnderlings("Skummtomten", santasElfs = santasElfs)
            assertEquals(uSkumtomten, result)
        }

        @Test
        fun testGetUnderlingsForRaven() {
            val result = santasHelper.getUnderlings("Räven", santasElfs = santasElfs)
            assertEquals(uRäven, result)
        }

        @Test
        fun testGetUnderlingsForMyran() {
            val result = santasHelper.getUnderlings("Myran", santasElfs = santasElfs)
            assertEquals(uMyran, result)
        }

        @Test
        fun testGetUnderlingsForBladlusen() {
            val result = santasHelper.getUnderlings("Bladlusen", santasElfs = santasElfs)
            val expected = emptyList<String>()
            assertEquals(expected, result)
        }
        @Test
        fun testGetUnderlingsForNyckelpigan() {
            val result = santasHelper.getUnderlings("Nyckelpigan", santasElfs = santasElfs)
            val expected = emptyList<String>()
            assertEquals(expected, result)
        }
        @Test
        fun testGetUnderlingsForTroger() {
            val result = santasHelper.getUnderlings("Tröger", santasElfs = santasElfs)
            val expected = emptyList<String>()
            assertEquals(expected, result)
        }
        @Test
        fun testGetUnderlingsForBlyger() {
            val result = santasHelper.getUnderlings("Blyger", santasElfs = santasElfs)
            val expected = emptyList<String>()
            assertEquals(expected, result)
        }
        @Test
        fun testGetUnderlingsForDammrottan() {
            val result = santasHelper.getUnderlings("Dammråttan", santasElfs = santasElfs)
            val expected = emptyList<String>()
            assertEquals(expected, result)
        }
        @Test
        fun testGetUnderlingsForRadjuret() {
            val result = santasHelper.getUnderlings("Rådjuret", santasElfs = santasElfs)
            val expected = emptyList<String>()
            assertEquals(expected, result)
        }
    }