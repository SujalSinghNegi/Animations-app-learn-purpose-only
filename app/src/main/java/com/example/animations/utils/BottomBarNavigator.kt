package com.example.animations.utils

import nl.joery.animatedbottombar.AnimatedBottomBar
import nl.joery.animatedbottombar.AnimatedBottomBar.Tab
import androidx.navigation.NavController
import androidx.navigation.NavOptions

fun setupBottomBarNavigation(
    bottomBar: AnimatedBottomBar,
    navController: NavController,
    tabDestinations: Map<Int, Int>
) {
    // Update selected tab when destination changes
    navController.addOnDestinationChangedListener { _, destination, _ ->
        val selectedTabId = tabDestinations.entries.find { it.value == destination.id }?.key
        if (selectedTabId != null && bottomBar.selectedTab?.id != selectedTabId) {
            bottomBar.selectTabById(selectedTabId, true)
        }
    }

    // Handle tab selection
    bottomBar.setOnTabSelectListener(object : AnimatedBottomBar.OnTabSelectListener {
        override fun onTabSelected(
            lastIndex: Int,
            lastTab: Tab?,
            newIndex: Int,
            newTab: Tab
        ) {
            val targetDest = tabDestinations[newTab.id]
            val options = NavOptions.Builder()
                .setLaunchSingleTop(true)
                .setPopUpTo(navController.graph.startDestinationId, false)
                .build()

            if (targetDest != null) {
                navController.safeNavigate(targetDest, options)
            }
        }
    })
}
