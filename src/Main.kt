
class SantasHelpers() {


    fun createMap(): MutableMap<String, List<String>> {
        val santasElfs: MutableMap<String, List<String>> = mutableMapOf(
            "Santa" to listOf("Glader", "Butter"),
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
        tailrec fun workingElfs(result: MutableList<String>, index: Int) {
            if (index == result.size) return
            santasElfs[currentName]?.let { underlings ->                        // Hitta underlings för currentName från santasElfs
                result.addAll(underlings.filterNot { it in result })           // Lägg till alla underlings i result, även underlings till underlings + undvika dubletter.
                return workingElfs(result, index + 1)                 // Fortsätter rekursionen genom att öka index med 1, och gå igenom nästa nästa nyckel i result.
            }
        }
        santasElfs[currentName]?.let { result.addAll(it) }               // Startar rekursionen, genom att lägga till de direkta underlings för currentName i resultatlistan
        return workingElfs(result, 0)
    }



}


    fun main() {
        val santasHelper = SantasHelpers()
        val santasElfs = santasHelper.createMap()
        val result = mutableListOf<String>()
        santasHelper.getUnderlings2("Glader", result, santasElfs)
        result.forEach(::println)
    }


