package com.example.animations.utils

import androidx.navigation.NavController
import androidx.navigation.NavOptions

fun NavController.safeNavigate(resId: Int, options: NavOptions? = null) {
    if (currentDestination?.id != resId) {
        this.navigate(resId, null, options)
    }
}
