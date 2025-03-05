
class SantasHelpers() {


    fun createMap(): MutableMap<String, List<String>> {
        val santasElfs: MutableMap<String, List<String>> = mutableMapOf(
            "Tomten" to listOf("Glader", "Butter"),
            "Glader" to listOf("Tröger", "Trötter", "Blyger"),
            "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
            "Trötter" to listOf("Skummtomten"),
            "Skummtomten" to listOf("Dammråttan"),
            "Räven" to listOf("Gråsuggan", "Myran"),
            "Myran" to listOf("Bladlusen")
        )
        return santasElfs
    }


    fun getUnderlings(currentName: String, result: MutableList<String>, santasElfs: MutableMap<String, List<String>>): MutableList<String> {
        fun getElfs(result: MutableList<String>) : MutableList<String> {
            santasElfs[currentName]?.let { underlings ->
                underlings
                    .forEach { elf ->
                        result.add(elf)
                        getUnderlings(elf, result, santasElfs)
                    }
            }
            return result
        }
        return getElfs(result)
    }
}


    fun main() {
        val santasHelper = SantasHelpers()
        val santasElfs = santasHelper.createMap()
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Tomten", result, santasElfs)
        result.forEach(::println)
    }


