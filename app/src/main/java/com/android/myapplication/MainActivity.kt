package com.android.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.android.myapplication.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.button.setOnClickListener {
            if (binding.checkBox.isChecked) {
                if (binding.editTextText.text.toString() == "" ||
                    binding.editTextText2.text.toString() == "" ||
                    binding.editTextText4.text.toString() == ""
                ) {
                    Toast.makeText(this, "All values must be filled ", Toast.LENGTH_SHORT).show()
                } else {
                    val price: Double = binding.editTextText.text.toString().toDouble()
                    val numoftheday: Double = binding.editTextText2.text.toString().toDouble() * 30
                    val benefit: Double = binding.editTextText4.text.toString().toDouble()
                    val result: Double = (price * numoftheday * benefit) / 36500.0
                    binding.textView.text = result.toString()
                    binding.textView.visibility = View.VISIBLE
                    Toast.makeText(this, "Profit was calculated ", Toast.LENGTH_SHORT).show()
                }

            }else{
                Toast.makeText(this, "Please confirm the rules", Toast.LENGTH_SHORT).show()
            }


        }


    }
}