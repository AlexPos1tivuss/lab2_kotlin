package com.raywenderlich.android.lab1.screens

import android.annotation.SuppressLint
import androidx.compose.material.BottomAppBar
import androidx.compose.material.Scaffold
import androidx.compose.material.ScaffoldState
import androidx.compose.material.rememberScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import com.raywenderlich.android.lab1.R
import kotlinx.coroutines.CoroutineScope

@Composable
fun ScaffoldScreen() {

}

@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun MyScaffold() {
    val scaffoldState: ScaffoldState = rememberScaffoldState()
    val scope: CoroutineScope = rememberCoroutineScope()

    Scaffold (
        scaffoldState = scaffoldState,
        contentColor = colorResource(id = R.color.colorPrimary),
        content = {
            MyRow()
        },
        topBar = { MyTopAppBar(scaffoldState = scaffoldState, scope = scope)},
        bottomBar = { MyBottomAppBar()},
        drawerContent = { MyColumn()}
    )
}

@Composable
fun MyTopAppBar(scaffoldState: ScaffoldState, scope: CoroutineScope) {
    
}

@Composable
fun MyBottomAppBar() {
    BottomAppBar (
        content = {},
        backgroundColor = colorResource(id = R.color.colorPrimary)
    )
}