package com.ashlesh.fluffies.navigation

import androidx.annotation.StringRes
import com.ashlesh.fluffies.R

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Home : Screen("home", R.string.text_home)
    object Details : Screen("details", R.string.text_details)
    object OwnerDetails : Screen("ownerDetails", R.string.text_owner_details)
}
