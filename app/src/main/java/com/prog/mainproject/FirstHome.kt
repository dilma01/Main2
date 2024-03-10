package com.prog.mainproject

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.android.material.bottomnavigation.BottomNavigationView

class FirstHome : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.home_first)

        val bottomNavigationView = findViewById<BottomNavigationView>(R.id.bottomNavigationView)

        // 바텀 네비게이션 아이템 클릭 리스너 설정
        bottomNavigationView.setOnNavigationItemSelectedListener { menuItem ->
            when (menuItem.itemId) {
                R.id.page_home -> {
                    // 홈 아이템 클릭 시 홈 화면으로 이동
                    //startActivity(Intent(this@MainActivity, CalenderActivity::class.java))
                    true
                }
                R.id.page_fv -> {
                    // 질병진단 아이템 클릭 시 질병진단 화면으로 이동
                    startActivity(Intent(this@FirstHome, PestActivity::class.java))
                    true
                }
                R.id.page_ps -> {
                    // 식물 기록 아이템 클릭 시 캘린더 화면으로 이동
                    startActivity(Intent(this@FirstHome, CalenderActivity::class.java))
                    true
                }
                else -> false
            }
        }
        val registerButton = findViewById<Button>(R.id.button)
        registerButton.setOnClickListener{
            val intent = Intent(this@FirstHome, RegisterActivity::class.java)
            startActivity(intent)
        }

    }
}
