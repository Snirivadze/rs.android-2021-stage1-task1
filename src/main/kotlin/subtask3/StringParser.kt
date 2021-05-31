package subtask3

class StringParser {

    // TODO: Complete the following function
    fun getResult(inputString: String): Array<String> {
            var subString: String
            val stringArray = arrayListOf<String>()
            val indexArray = arrayListOf<Int>()
            var index: Int = 0
            for (i in 0..inputString.length - 1) {
                if (inputString[i] == '<' || inputString[i] == '(' || inputString[i] == '[') {
                    for (k in i + 1..inputString.length - 1) {
                        if (inputString[k] == inputString[i] + 2 || inputString[k] == inputString[i] + 1) {
                            indexArray.add(k)
                            index = k
                        }
                        if (index == 0) continue
                        if (inputString[k] == inputString[i]) break
                    }

                    for (l in indexArray) {
                        subString = inputString.substring(i + 1, l)
                        stringArray.add(subString)
                    }
                    indexArray.removeAll(indexArray)
                    index = 0
                }

            }

            val arrayStr = stringArray.toTypedArray()
            return arrayStr

    }
}
