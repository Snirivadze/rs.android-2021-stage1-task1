package subtask1

class HappyArray {

    // TODO: Complete the following function
    fun convertToHappy(sadArray: IntArray): IntArray {
        val newArray = sadArray.toMutableList()
        var noBadElements = true

        for (i in 1..newArray.size - 2) {
            if (newArray[i - 1] + newArray[i + 1] < newArray[i]) {
                noBadElements = false
                newArray.removeAt(i)
                break;
            }
        }

        return if(noBadElements)
            newArray.toIntArray()
        else
            convertToHappy(newArray.toIntArray())


    }
}
