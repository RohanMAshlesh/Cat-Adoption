package com.ashlesh.fluffies.view

import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import com.ashlesh.fluffies.TopBar
import com.ashlesh.fluffies.component.ItemCatCard
import com.ashlesh.fluffies.model.Cat

@Composable
fun Home(navController: NavHostController, catList: List<Cat>, toggleTheme: () -> Unit) {
    LazyColumn {
        item {
            TopBar(
                onToggle = {
                    toggleTheme()
                }
            )
            Spacer(modifier = Modifier.height(8.dp))
        }

        items(catList) {
            catList.forEach {
                ItemCatCard(
                    it,
                    onItemClicked = { cat ->
                        navController.navigate("details/${cat.id}/${cat.name}/${cat.location}")
                    }
                )
            }
        }
    }
}
