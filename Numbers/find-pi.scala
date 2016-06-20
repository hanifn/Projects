/* Find Pi till the Nth place
 * Formula: https://www.math.hmc.edu/funfacts/ffiles/20010.5.shtml
 */
object FindPi {
    def main(args: Array[String]) {
        val N = args(0).toInt

        println("Hello, "+N+"!")
    }

    def calculatePi(n: Int): Double = {
        val N = n

        return 3.142
    }
}
