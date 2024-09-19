package com.example.github.core.utils

import kotlinx.coroutines.flow.flow

fun <T> emitFlow(operation: (suspend () -> T)) = flow { emit(operation()) }
