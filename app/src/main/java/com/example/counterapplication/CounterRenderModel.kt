package com.example.counterapplication

data class CounterRenderModel(
  val count: String,
  val onDecrement: () -> Unit,
  val onIncrement: () -> Unit
)
