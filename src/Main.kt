
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


    fun getUnderlings(currentName: String, result: MutableList<String> = mutableListOf(), santasElfs: MutableMap<String, List<String>>): MutableList<String> {
         fun getElfs(currentName: String, result: MutableList<String>, index : Int) : MutableList<String> {
            santasElfs[currentName]?.let { underlings ->
                underlings.filterNot { it in result }.forEach { elf ->
                    result.add(elf)
                    getElfs(elf, result, index +1)
                }
            }
            return result
        }
        return getElfs(currentName, result, 0)
    }
}

    fun main() {
        val santasHelper = SantasHelpers()
        val santasElfs = santasHelper.createMap()
        val result = mutableListOf<String>()
        santasHelper.getUnderlings("Tomten", result, santasElfs)
        result.forEach(::println)
    }


//  fun getUnderlings1(currentName: String, result: MutableList<String>, santasElfs: MutableMap<String, List<String>>) {
//        tailrec fun workingElfs(resultList: MutableList<String>, index: Int) {
//            if (index == resultList.size) return
//            santasElfs[currentName]?.let { underlings ->
//                resultList.addAll(underlings.filterNot { it in resultList })
//            }
//            return workingElfs(resultList, index + 1)
//        }
//        santasElfs[currentName]?.let { result.addAll(it) }
//        return workingElfs(result, 0)
//    }

