package com.example.signupformapp

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val etName = findViewById<EditText>(R.id.etName)
        val etContact = findViewById<EditText>(R.id.etContact)
        val etEmail = findViewById<EditText>(R.id.etEmail)
        val etPassword = findViewById<EditText>(R.id.etPassword)
        val etAddress = findViewById<EditText>(R.id.etAddress)
        val btnSubmit = findViewById<Button>(R.id.btnSubmit)

        btnSubmit.setOnClickListener {
            val name = etName.text.toString().trim()
            val contact = etContact.text.toString().trim()
            val email = etEmail.text.toString().trim()
            val password = etPassword.text.toString().trim()
            val address = etAddress.text.toString().trim()

            var isValid = true

            // Validate each field
            if (name.isEmpty()) {
                etName.error = "Name cannot be empty"
                isValid = false
            }

            if (contact.isEmpty()) {
                etContact.error = "Contact cannot be empty"
                isValid = false
            } else if (!contact.matches(Regex("\\d{10}"))) {
                etContact.error = "Enter a valid 10-digit contact number"
                isValid = false
            }

            if (email.isEmpty()) {
                etEmail.error = "Email cannot be empty"
                isValid = false
            } else if (!android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches()) {
                etEmail.error = "Enter a valid email address"
                isValid = false
            }

            if (password.isEmpty()) {
                etPassword.error = "Password cannot be empty"
                isValid = false
            }

            if (address.isEmpty()) {
                etAddress.error = "Address cannot be empty"
                isValid = false
            }

            // Show success message if all fields are valid
            if (isValid) {
                Toast.makeText(this, "Form submitted successfully!", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
