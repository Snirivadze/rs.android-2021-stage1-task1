package subtask2

class BillCounter {

    // TODO: Complete the following function
    // The output could be "Bon Appetit" or the string with number(e.g "10")
    fun calculateFairlySplit(bill: IntArray, k: Int, b: Int): String {
        var result = 0
        val idealCase = "Bon Appetit"
        for(i in 0..bill.size -1){
            if(i == k) continue
            result += bill[i]
        }
        result /= 2
        result = b - result
        return if(result == 0)
            idealCase
        else
            result.toString()
    }
}
