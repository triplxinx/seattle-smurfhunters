package com.triplxinx.smurfhunters
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
class MainActivity: Activity() { override fun onCreate(savedInstanceState: Bundle?) { super.onCreate(savedInstanceState); setContentView(TextView(this).apply { text="Seattle Smurfhunters\n\nMap layers, habitat observations, camera pins and galleries are planned. No habitat predictions are supplied."; textSize=20f; setPadding(32,32,32,32) }) } }