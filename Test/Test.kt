import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

class SantasHelpersTest {

    private val santasHelper = SantasHelpers()
    private val santasElfs = santasHelper.createMap()

    @Test
    fun ` test createMap`() {
        val expectedMap = mutableMapOf(
            "Santa" to listOf("Glader", "Butter"),
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
        val expectedUnderlings = listOf("Glader", "Butter"
        )
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
            "Rådjuret", "Nyckelpigan", "Haren", "Räven"
        )
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

    @Test
    fun `getUnderlings Gråsuggan`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Gråsuggan", result, santasElfs)
        val expectedUnderLings = emptyList<String>()
        assertEquals(expectedUnderLings, result)
    }

    @Test
    fun `getUnderlings BladLusen`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Bladlusen", result, santasElfs)
        val expectedUnderLings = emptyList<String>()
        assertEquals(expectedUnderLings, result)
    }

    @Test
    fun `getUnderlings Nyckelpigan`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Nyckelpigan", result, santasElfs)
        val expectedUnderLings = emptyList<String>()
        assertEquals(expectedUnderLings, result)
    }

    @Test
    fun `getUnderlings Rådjuret`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Rådjuret", result, santasElfs)
        val expectedUnderLings = emptyList<String>()
        assertEquals(expectedUnderLings, result)
    }

    @Test
    fun `getUnderlings Dammråttan`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Dammråttan", result, santasElfs)
        val expectedUnderLings = emptyList<String>()
        assertEquals(expectedUnderLings, result)
    }

    @Test
    fun `getUnderlings Tröger`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Tröger", result, santasElfs)
        val expectedUnderLings = emptyList<String>()
        assertEquals(expectedUnderLings, result)
    }

    @Test
    fun `getUnderlings Blyger`() {
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Blyger", result, santasElfs)
        val expectedUnderLings = emptyList<String>()
        assertEquals(expectedUnderLings, result)
    }

}