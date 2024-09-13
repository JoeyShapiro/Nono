package com.joeyshapiro.nono

import android.accessibilityservice.AccessibilityService
import android.content.ContentValues.TAG
import android.util.Log
import android.view.accessibility.AccessibilityEvent

class NumberAccessibilityService : AccessibilityService() {
    override fun onCreate() {
        super.onCreate()

        Log.d(TAG, "onCreate")
    }

    override fun onServiceConnected() {
        super.onServiceConnected()

        Log.d(TAG, "NumberAccessibilityService onServiceConnected")
    }

    override fun onAccessibilityEvent(event: AccessibilityEvent) {
        if (event.eventType == AccessibilityEvent.TYPE_WINDOW_CONTENT_CHANGED) {
            // This is called when UI elements are added or changed
            // You can put your custom logic here
            handleUiChange(event)
        }
    }

    private fun handleUiChange(event: AccessibilityEvent) {
        // Your custom logic goes here
        // For example, you can check if specific UI elements are added
        // and perform actions accordingly
        Log.d(TAG, "handleUiChange event: $event")
    }

    override fun onInterrupt() {
        // Handle interruption (if necessary)
    }
}
