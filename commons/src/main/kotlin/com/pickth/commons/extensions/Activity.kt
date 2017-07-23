package com.pickth.commons.extensions

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.view.View
import android.view.WindowManager
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.Toast

/**
 * @param fragmentManager in activity. Called by getFragmentManager
 * @param fragment
 */
fun Activity.addFragmentToActivity(fragmentManager: FragmentManager, fragment: Fragment, frameId: Int) {
    checkNotNull(fragmentManager)
    checkNotNull(fragment)
    val transaction = fragmentManager.beginTransaction()
    transaction.add(frameId, fragment)
    transaction.commit()
}

fun Activity.toast(id: Int, length: Int = Toast.LENGTH_SHORT) {
    if(isOnMainThread()) {
        Toast.makeText(this, id, length).show()
    } else {
        runOnUiThread {
            Toast.makeText(this, id, length).show()
        }
    }
}

fun Activity.toast(msg: String, length: Int = Toast.LENGTH_SHORT) {
    if(isOnMainThread()) {
        Toast.makeText(this, msg, length).show()
    } else {
        runOnUiThread {
            Toast.makeText(this, msg, length).show()
        }
    }
}

fun Activity.intent(activity: Class<*>) {
    val mIntent = Intent(this, activity)
    startActivity(mIntent)
}

fun Activity.hideKeyboard() {
    val inputMethodManager = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    inputMethodManager.hideSoftInputFromWindow((currentFocus ?: View(this)).windowToken, 0)
    window!!.setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN)
    currentFocus?.clearFocus()
}

fun Activity.showKeyboard(et: EditText) {
    val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    imm.showSoftInput(et, InputMethodManager.SHOW_IMPLICIT)
}