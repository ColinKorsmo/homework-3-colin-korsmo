package com.example.homework3colinkorsmo.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Reminders(
    @StringRes val titleResourceId: Int,
    @DrawableRes val imageResourceId: Int,
    @StringRes val stringResourceId: Int,
)
