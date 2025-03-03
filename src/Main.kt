class SantasHelpers() {


    fun createMap(): MutableMap<String, List<String>> {
        val santasElfs: MutableMap<String, List<String>> = mutableMapOf(
            "Santa" to listOf(
                "Tröger",
                "Trötter",
                "Blyger",
                "Dammråttan",
                "Skumtomten",
                "Glader",
                "Butter",
                "Rådjuret",
                "Nyckelpigan",
                "Haren",
                "Räven",
                "Gråsuggan",
                "Myran",
                "Bladlusen"
            ),
            "Glader" to listOf("Tröger", "Trötter", "Blyger"),
            "Butter" to listOf("Rådjuret", "Nyckelpigan", "Haren", "Räven"),
            "Trötter" to listOf("Skummtomten"),
            "Skummtomten" to listOf("Dammråttan"),
            "Räven" to listOf("Gråsuggan", "Myran"),
            "Myran" to listOf("Bladlusen")
        )
        return santasElfs
    }


    fun getUnderlings(currentName: String, result: MutableList<String>, santasElfs: MutableMap<String, List<String>>) {
        tailrec fun workingElfs(resultList: MutableList<String>, index: Int) {
            if (index == resultList.size) return
            santasElfs[currentName]?.let { underlings ->
                resultList.addAll(underlings.filterNot { it in resultList })
            }
            return workingElfs(resultList, index + 1)
        }
        santasElfs[currentName]?.let { result.addAll(it) }
        return workingElfs(result, 0)
    }

}


fun main() {
    val santasHelper = SantasHelpers()
    val santasElfs = santasHelper.createMap()
    val result = mutableListOf<String>()
    santasHelper.getUnderlings("kaninen", result, santasElfs)
    println(result)
}


