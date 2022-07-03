package mima.anitab.fibonaccinumbers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import mima.anitab.fibonaccinumbers.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var numberList=fibonacciNumbers(100)
        println(numberList)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter =NumberRecyclerViewAdapter(numberList)

    }
    fun fibonacciNumbers(size:Int):List<Int>{
        var numbers = listOf<Int>()
        var num1 = 0
        var num2 = 1
        var number = 0

        while (number < size){
            var sum = num1+num2
            num1=num2
            num2=sum
            number++
        }
        return numbers
    }
}
