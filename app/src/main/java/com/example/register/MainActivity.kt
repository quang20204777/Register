package com.example.register

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var male: RadioButton
    private lateinit var female: RadioButton
    private lateinit var birthday: EditText
    private lateinit var address: EditText
    private lateinit var email: EditText
    private lateinit var checkBox: CheckBox
    private lateinit var register: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        firstName = findViewById(R.id.firstname)
        lastName = findViewById(R.id.lastname)
        male = findViewById(R.id.male)
        female = findViewById(R.id.female)
        birthday= findViewById(R.id.birthday)
        address= findViewById(R.id.address)
        email= findViewById(R.id.email)
        checkBox = findViewById(R.id.checkbox)
        register = findViewById(R.id.register)
        register.setOnClickListener { registerClick() }
    }

    private fun registerClick() {
        val firstName = firstName.text.toString()
        val lastName = lastName.text.toString()
        val gender = if (male.isChecked) "Male" else "Female"
        val birthday = birthday.text.toString()
        val address = address.text.toString()
        val email = email.text.toString()
        val agreement = checkBox.isChecked
        if (firstName.isEmpty() || lastName.isEmpty() || gender.isEmpty() || birthday.isEmpty() || address.isEmpty() || email.isEmpty() || !agreement) {
            Toast.makeText(this, "Please fill in all information!", Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Sign Up Success!", Toast.LENGTH_SHORT).show()
        }
    }

}