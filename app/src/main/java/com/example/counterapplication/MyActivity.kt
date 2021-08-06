package com.example.counterapplication

import android.os.Bundle
import com.instacart.formula.android.FormulaAppCompatActivity

class MyActivity : FormulaAppCompatActivity() {
  private lateinit var counterRenderView: CounterRenderView

  override fun onCreate(state: Bundle?) {
    super.onCreate(state)
    setContentView(R.layout.activity_my)

    counterRenderView = CounterRenderView(findViewById(R.id.activity_content))
  }

  fun render(model: CounterRenderModel) {
    counterRenderView.render(model)
  }
}
