package org.by9steps.toasterlibrary

import android.content.Context
import android.widget.Toast


object ToasterMessage {

    fun showToast(c: Context, message: String) {

        Toast.makeText(c, message, Toast.LENGTH_SHORT).show()

    }
}