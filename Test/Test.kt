import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SantasHelpersTest {

    private val santasHelper = SantasHelpers()
    private val santasElfs = santasHelper.createMap()

    @Test
    fun ` test createMap`() {
        val expectedMap = mutableMapOf(
            "Santa" to listOf("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader", "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen"),
            "Glader" to listOf("Tröger", "Trötter", "Blyger"),
            "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
            "Trötter" to listOf("Skummtomten"),
            "Skummtomten" to listOf("Dammråttan"),
            "Räven" to listOf("Gråsuggan", "Myran"),
            "Myran" to listOf("Bladlusen")
        )

        assertEquals(expectedMap, santasElfs)
    }

    @Test
    fun `getUnderlings Santa`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Santa", result, santasElfs)
        val expectedUnderlings = listOf(
            "Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader", "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen")
        assertEquals(expectedUnderlings, result)
    }

    @Test
    fun `test getUnderlings for Glader`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Glader", result, santasElfs)
        val expectedUnderlings = listOf("Tröger", "Trötter", "Blyger")
        assertEquals(expectedUnderlings, result)
    }

        @Test
        fun `getUnderlings Butter`() {
            val result = mutableListOf<String>()
            santasHelper.getUnderlings("Butter", result, santasElfs)
            val expectedUnderlings = listOf(
                "Rådjuret", "Nyckelpigan", "Haren", "Räven")
            assertEquals(expectedUnderlings, result)
        }

        @Test
        fun `getUnderlings Trötter`() {
            val result = mutableListOf<String>()
            santasHelper.getUnderlings("Trötter", result, santasElfs)
            val expectedUnderLings = listOf("Skummtomten")
            assertEquals(expectedUnderLings, result)
        }

    @Test
    fun `getUnderlings Skummtomten `() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Skummtomten", result, santasElfs)
        val expectedUnderLings = listOf("Dammråttan")
        assertEquals(expectedUnderLings, result)
    }
    @Test
    fun `getUnderlings Räven`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Räven", result, santasElfs)
        val expectedUnderLings = listOf("Gråsuggan", "Myran")
        assertEquals(expectedUnderLings, result)
    }
    @Test
    fun `getUnderlings Myran`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Myran", result, santasElfs)
        val expectedUnderLings = listOf("Bladlusen")
        assertEquals(expectedUnderLings, result)
    }

}

