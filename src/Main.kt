
class SantasHelpers() {


    fun createMap(): MutableMap<String, List<String>> {
        val santasElfs: MutableMap<String, List<String>> = mutableMapOf(
            "Santa" to listOf("Tröger", "Trötter", "Blyger", "Dammråttan", "Skumtomten", "Glader", "Butter", "Rådjuret", "Nyckelpigan", "Haren", "Räven", "Gråsuggan", "Myran", "Bladlusen"),
            "Glader" to listOf("Tröger", "Trötter", "Blyger"),
            "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
            "Trötter" to listOf("Skummtomten"),
            "Skummtomten" to listOf("Dammråttan"),
            "Räven" to listOf("Gråsuggan", "Myran"),
            "Myran" to listOf("Bladlusen")
        )
        return santasElfs
    }


    fun getUnderlings(currentName: String, result: MutableList<String>, santasElfs: MutableMap<String, List<String>>): Any {
        tailrec fun workingElfs(resultList: MutableList<String>, index: Int) {
            if (index == resultList.size) return
            santasElfs[currentName]?.let { underlings ->                        // Hitta underlings för currentName från santasElfs
                resultList.addAll(underlings.filterNot { it in resultList })    // Lägg till alla underlings i resultList, ej dubletter
                return workingElfs(resultList, index + 1)                 // Fortsätter rekursionen genom att öka index med 1, och gå igenom nästa nästa nyckel i resultList
            }
        }
        santasElfs[currentName]?.let { result.addAll(it)}               // Startar rekursionen, genom att lägga till de direkta underlings för currentName i resultatlistan
        return workingElfs(result, 0)

    }

}
    fun main() {
        val santasHelper = SantasHelpers()
        val santasElfs = santasHelper.createMap()
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Trötter", result, santasElfs)
        println(result)
    }


