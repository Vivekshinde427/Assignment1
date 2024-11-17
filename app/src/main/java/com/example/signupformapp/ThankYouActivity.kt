package com.example.signupformapp // Use your actual package name

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signupformapp.databinding.ActivityThankYouBinding

class ThankYouActivity : AppCompatActivity() {

    // Declare the binding variable
    private lateinit var binding: ActivityThankYouBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Initialize the binding variable
        binding = ActivityThankYouBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // Set the message for the Thank You screen
        binding.textViewThankYouMessage.text = "Thanks for submitting the details!\nWe will connect soon."
    }
}
