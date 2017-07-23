package com.pickth.commons.extensions

import android.widget.TextView

/**
 * Return trimmed text
 */
val TextView.value: String get() = text.toString().trim()