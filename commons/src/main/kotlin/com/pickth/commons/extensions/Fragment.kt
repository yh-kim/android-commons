package com.pickth.commons.extensions

import android.content.Intent
import android.support.v4.app.Fragment
/**
 * @param activity class name ex) Activity.class
 */
fun Fragment.intent(activity: Class<*>) {
    startActivity(Intent(getActivity(), activity))
}