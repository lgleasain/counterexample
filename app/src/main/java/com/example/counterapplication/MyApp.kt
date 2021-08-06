package com.example.counterapplication

import android.app.Application
import com.instacart.formula.FormulaAndroid
import com.instacart.formula.rxjava3.toObservable

class MyApp : Application() {

  override fun onCreate() {
    super.onCreate()

    FormulaAndroid.init(this) {
      activity<MyActivity> {
        store(
          streams = {
            val formula = CounterFormula()
            update(formula.toObservable(), MyActivity::render)
          }
        )
      }
    }
  }
}