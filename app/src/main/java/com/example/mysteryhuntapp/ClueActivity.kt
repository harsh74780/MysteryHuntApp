package com.example.mysteryhuntapp

import android.Manifest
import android.app.NotificationChannel
import android.app.NotificationManager
import android.content.Context
import android.content.pm.PackageManager
import android.os.Build
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.core.content.ContextCompat
import android.widget.TextView
import android.util.Log

class ClueActivity : AppCompatActivity() {

    private val channelId = "mysteryHuntChannel"
    private val requestCodePostNotifications = 1

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_clue)

        createNotificationChannel()

        val location = intent.getStringExtra("location")
        val theme = intent.getStringExtra("theme")

        Log.d("ClueActivity", "Received Location: $location, Theme: $theme")

        val locationView: TextView = findViewById(R.id.locationView)
        val themeView: TextView = findViewById(R.id.themeView)
        val clueView: TextView = findViewById(R.id.clueView)

        locationView.text = location
        themeView.text = theme
        clueView.text = generateClue(location, theme)

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.TIRAMISU) {
            if (ContextCompat.checkSelfPermission(this, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
                ActivityCompat.requestPermissions(this, arrayOf(Manifest.permission.POST_NOTIFICATIONS), requestCodePostNotifications)
            } else {
                sendNotification(clueView.text.toString())
            }
        } else {
            sendNotification(clueView.text.toString())
        }
    }

    private fun generateClue(location: String?, theme: String?): String {
        // Placeholder for generating clues based on location and theme
        return "Find the ancient tree in $location that fits the $theme theme."
    }

    private fun sendNotification(clue: String) {
        val builder = NotificationCompat.Builder(this, channelId)
            .setSmallIcon(R.drawable.ic_notification)
            .setContentTitle("New Clue Available")
            .setContentText(clue)
            .setPriority(NotificationCompat.PRIORITY_HIGH)
            .setVibrate(longArrayOf(1000, 1000, 1000, 1000, 1000))
            .setLights(0xFF0000FF.toInt(), 3000, 3000)
            .setAutoCancel(true)

        try {
            with(NotificationManagerCompat.from(this)) {
                notify(0, builder.build())
            }
        } catch (e: SecurityException) {
            Log.e("ClueActivity", "Notification permission not granted", e)
        }
    }


    private fun createNotificationChannel() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val name = "Mystery Hunt Channel"
            val descriptionText = "Channel for Mystery Hunt notifications"
            val importance = NotificationManager.IMPORTANCE_HIGH
            val channel = NotificationChannel(channelId, name, importance).apply {
                description = descriptionText
            }
            val notificationManager: NotificationManager =
                getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
            notificationManager.createNotificationChannel(channel)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)
        if (requestCode == requestCodePostNotifications) {
            if ((grantResults.isNotEmpty() && grantResults[0] == PackageManager.PERMISSION_GRANTED)) {
                val clueView: TextView = findViewById(R.id.clueView)
                sendNotification(clueView.text.toString())
            } else {
                // Permission denied, show a message to the user
                Log.d("ClueActivity", "Notification permission denied")
            }
        }
    }
}
