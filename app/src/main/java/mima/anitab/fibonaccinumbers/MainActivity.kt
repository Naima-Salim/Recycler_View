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

        fibonacciNumbers()
    }
    fun fibonacciNumbers(){
        var num1 =0
        var num2 = 1
        var numbers = mutableListOf<Int>()

        for (i in 1..100) {
            numbers.add(num1)

            val sum = num1 + num2
            num1 = num2
            num2 = sum
        }
        var numbAdapter=NumberRecyclerViewAdapter(numbers)
        binding.rvNumbers.layoutManager = LinearLayoutManager(this)
        binding.rvNumbers.adapter=numbAdapter

        }

}
