package dam.a42346.helloworld

import android.os.Build
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class OSBuild : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_osbuild)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        /*
         * use the android.os.Build object to extract
         * Manufacturer
         * Model
         * Brand
         * Type
         * User
         * Base
         * Incremental
         * SDK
         * Version
         * Display
         */
        val osVersion = findViewById<TextView>(R.id.os_version)
        osVersion.text = buildString {
            append("Manufacturer: ")
            append(Build.MANUFACTURER)
            append("\nModel: ")
            append(Build.MODEL)
            append("\nBrand: ")
            append(Build.BRAND)
            append("\nType: ")
            append(Build.TYPE)
            append("\nUser: ")
            append(Build.USER)
            append("\nBase: ")
            append(Build.VERSION.BASE_OS)
            append("\nIncremental: ")
            append(Build.VERSION.INCREMENTAL)
            append("\nSDK: ")
            append(Build.VERSION.SDK_INT)
            append("\nVersion: ")
            append(Build.VERSION.CODENAME)
            append("\nDisplay: ")
            append(Build.DISPLAY)
        }
    }
}