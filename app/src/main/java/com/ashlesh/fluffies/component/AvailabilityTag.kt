package com.ashlesh.fluffies.component

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.unit.dp
import com.ashlesh.fluffies.R

@Composable
fun AvailabilityTag(detail: Boolean, adoption: Boolean) {
    val color = if (adoption) R.color.green else R.color.red
    val adoptionAvailability = if (adoption) "Available" else "Adopted"
    if (detail) AvailabiltyDetailView(
        adoption = adoptionAvailability, colorResource = colorResource(
            id = color
        )
    ) else AvailabilityView(colorResource(id = color))

}

@Composable
fun AvailabilityView(colorResource: Color) {
    Box(
        modifier = Modifier
            .wrapContentWidth()
            .size(5.dp)
            .clip(RoundedCornerShape(40.dp))
            .background(colorResource.copy(1f))
    ) {
        Text(
            text = "", modifier = Modifier.padding(12.dp, 6.dp, 12.dp, 6.dp),
            style = MaterialTheme.typography.caption,
            color = colorResource
        )
    }
}

@Composable
fun AvailabiltyDetailView(adoption: String, colorResource: Color) {
    Box(
        modifier = Modifier
            .wrapContentWidth()
            .clip(RoundedCornerShape(12.dp))
            .background(colorResource.copy(.08f))
    ) {
        Text(
            text = adoption, modifier = Modifier.padding(12.dp, 6.dp, 12.dp, 6.dp),
            style = MaterialTheme.typography.caption,
            color = colorResource
        )
    }
}